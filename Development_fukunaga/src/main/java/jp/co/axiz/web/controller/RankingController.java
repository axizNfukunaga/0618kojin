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
public class RankingController {

	@Autowired
	HttpSession session;
	@Autowired
	PostsService postsService;

	@RequestMapping(value="/ranking")
	public String ranking(@ModelAttribute("command") Form form, Model model) {
		String genre_id=form.getGenre_id();
		List<Posts> list;
		if(genre_id==null||genre_id.equals("0")) {
			list=postsService.orderA();
		}else {
			list=postsService.orderG(genre_id);
		}
		model.addAttribute("list", list);
		return "rankingResult";
	}

	@RequestMapping(value="/dateRank",method = RequestMethod.GET)
	public String dateRanking(@ModelAttribute("command") Form form, Model model) {
		List<Posts> list;
		list=postsService.orderD();
		model.addAttribute("list", list);
		return "rankingResult";
	}

	@RequestMapping(value="/like",method = RequestMethod.POST)
	public String like(@ModelAttribute("command") Form form, Model model) {
		//いいね処理
		Integer post_id=form.getPost_id();
		String rank_id=form.getRank_id();
		Integer point = postsService.getPoint(post_id);

		if(rank_id.equals("3")){
			point=point+2;
			postsService.pointUp(post_id, point);
		}else {
			point=point+1;
		}
		postsService.pointUp(post_id, point);


		return "likeResult";
	}


}
