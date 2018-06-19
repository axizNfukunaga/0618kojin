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
public class RankChangeController {

	@Autowired
	HttpSession session;

	@RequestMapping(value="/rankChange",method = RequestMethod.GET)
	public String rankChange(@ModelAttribute("command") Form form, Model model) {
		//ランク変更ページへ
		return "rankChange";
	}

	@RequestMapping(value="/rankChangeConfirm",method = RequestMethod.GET)
	public String Confirm(@ModelAttribute("command") Form form, Model model) {
		//同じもの選んでないか判定
		return "rankChangeConfirm";
	}

	@RequestMapping(value="/rankChangeResult",method = RequestMethod.GET)
	public String Result(@ModelAttribute("command") Form form, Model model) {
		//ランク変更処理
		return "rankChangeResult";
	}


}
