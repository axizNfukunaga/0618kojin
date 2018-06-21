package jp.co.axiz.web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.axiz.web.entity.Form;
import jp.co.axiz.web.service.UsersService;

@Controller
public class RegistController {

	@Autowired
	UsersService usersService;
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
		String id=form.getId();
		String nic=form.getNic();
		String pass=form.getPass();
		if(id==null||nic==null||pass==null||"".equals(id)||"".equals(nic)||"".equals(pass)) {
			model.addAttribute("msg", "必須項目を入力してください");
			return "regist";
		}
		boolean success=usersService.idCheck(id);

		if(success) {
			model.addAttribute("id", id);
			model.addAttribute("nic", nic);
			session.setAttribute("pass", pass);
			return "registConfirm";
		}else {
			model.addAttribute("nic", nic);
			model.addAttribute("msg", "入力したIDはすでに使われています");
			return "regist";
		}
	}

	@RequestMapping(value="/regist",method = RequestMethod.POST)
	public String registRes (@ModelAttribute("command") Form form, Model model) {
		//登録操作
		String id= form.getId();
		String nic=form.getNic();
		String rePass=form.getRePass();
		String pass=(String)session.getAttribute("pass");
		boolean success=rePass.equals(pass);

		if(success) {
			usersService.regist(id,nic,rePass);
			session.removeAttribute("pass");
			return "registResult";
		}else {
			model.addAttribute("msg", "パスワードが違います");
			return "registConfirm";
		}

	}


}
