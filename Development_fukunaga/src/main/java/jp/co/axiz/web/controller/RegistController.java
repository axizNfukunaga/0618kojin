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
public class RegistController {


	@Autowired
	HttpSession session;

	@RequestMapping(value="/regist",method = RequestMethod.GET)
	public String regist (@ModelAttribute("command") Form form, Model model) {
		//登録画面に飛ぶ
		return "regist";
	}

	@RequestMapping(value="/registConfirm",method = RequestMethod.POST)
	public String registCon (@ModelAttribute("command") Form form, Model model) {
		//IDがあるかチェック
		return "registConfirm";
	}

	@RequestMapping(value="/regist",method = RequestMethod.POST)
	public String registRes (@ModelAttribute("command") Form form, Model model) {
		//登録操作
		return "registResult";
	}


}
