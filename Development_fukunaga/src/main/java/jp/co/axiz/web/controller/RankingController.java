package jp.co.axiz.web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.axiz.web.entity.Form;

@Controller
public class RankingController {

	@Autowired
	HttpSession session;

	@RequestMapping(value="/ranking",method = RequestMethod.GET)
	public String ranking(@ModelAttribute("command") Form form, Model model) {
		//ランキングを表示
		return "rankingResult";
	}

	@RequestMapping(value="/like",method = RequestMethod.POST)
	public String like(@ModelAttribute("command") Form form, Model model) {
		//いいね処理
		return "likeResult";
	}


}
