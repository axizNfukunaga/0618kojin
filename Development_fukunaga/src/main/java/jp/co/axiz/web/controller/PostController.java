package jp.co.axiz.web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.axiz.web.entity.Form;
import jp.co.axiz.web.entity.Users;
import jp.co.axiz.web.service.PostsService;

@Controller
public class PostController {

	@Autowired
	HttpSession session;
	@Autowired
	PostsService postsService;

	@RequestMapping(value="/post",method = RequestMethod.GET)
	public String rankChange(@ModelAttribute("command") Form form, Model model) {
		//投稿ページへ
		return "post";
	}

	@RequestMapping(value="/postConfirm",method = RequestMethod.POST)
	public String Confirm(@ModelAttribute("command") Form form, Model model) {
		//有料、無料の判定。制限の判定
		Users loginUser=(Users)session.getAttribute("loginUser");
		String id=loginUser.getUser_id();
		boolean tollFree = loginUser.getRank_id().equals("3");

		if(!tollFree) {
			boolean success =postsService.check(id);
			if(!success) {
				model.addAttribute("msg", "今日はすでにつぶやいています。");
				return "post";
			}
		}

		return "postConfirm";
	}

	@RequestMapping(value="/post",method = RequestMethod.POST)
	public String Result(@ModelAttribute("command") Form form, Model model) {
		//投稿処理
		Users loginUser=(Users)session.getAttribute("loginUser");
		String id=loginUser.getUser_id();
		String contents=form.getContent();
		String genre_id=form.getGenre_id();

		postsService.post(id, contents, genre_id);
		return "postResult";
	}


}
