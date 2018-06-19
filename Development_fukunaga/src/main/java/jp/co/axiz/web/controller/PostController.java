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
public class PostController {

	@Autowired
	HttpSession session;

	@RequestMapping(value="/post",method = RequestMethod.GET)
	public String rankChange(@ModelAttribute("command") Form form, Model model) {
		//投稿ページへ
		return "post";
	}

	@RequestMapping(value="/postConfirm",method = RequestMethod.POST)
	public String Confirm(@ModelAttribute("command") Form form, Model model) {
		//有料、無料の判定。制限の判定
		return "postConfirm";
	}

	@RequestMapping(value="/post",method = RequestMethod.POST)
	public String Result(@ModelAttribute("command") Form form, Model model) {
		//ランク変更処理
		return "postResult";
	}


}
