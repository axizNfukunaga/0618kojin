package jp.co.axiz.web.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.axiz.web.entity.Form;
import jp.co.axiz.web.entity.Posts;
import jp.co.axiz.web.service.PostsService;

@Controller
public class SelectController {
	@Autowired
	HttpSession session;
	@Autowired
	PostsService postsService;
	@RequestMapping(value="/select",method = RequestMethod.GET)
	public String jump (@ModelAttribute("command") Form form, Model model) {
		//select.jspにジャンプ
		return "select";
	}

	@RequestMapping(value="/selectResult",method = RequestMethod.GET)
	public String result (@ModelAttribute("command") Form form, Model model) {
		//検索する
		String contents= form.getContent();
		String genre_id=form.getGenre_id();
		List<Posts> list;

			if(genre_id.equals("0")) {
				list=postsService.selectA(contents);
			}else {
				list=postsService.selectG(contents,genre_id);
			}

		model.addAttribute("list",list);
		return "selectResult";
	}
}
