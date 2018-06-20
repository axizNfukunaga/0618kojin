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
import jp.co.axiz.web.service.UsersService;

@Controller
public class AuthController {

	@Autowired
	HttpSession session;
	@Autowired
	UsersService usersService;

	@RequestMapping(value="/login",method = RequestMethod.GET)
	public String toLogin(@ModelAttribute("command") Form form, Model model) {
		return "login";
	}

	@RequestMapping(value="/login",method = RequestMethod.POST)
	public String login(@ModelAttribute("command") Form form, Model model) {

		String id = form.getId();
		String pass = form.getPass();
		Users loginUser=usersService.login(id, pass);

		if(loginUser==null) {
			model.addAttribute("msg", "IDまたはパスワードが間違っています");
			return "login";
		}else {
			session.setAttribute("loginUser", loginUser);
			return "menu";
		}
	}

	@RequestMapping("/logout")
	public String logout (@ModelAttribute("command") Form form, Model model) {

		session.invalidate();

		return "logout";
	}

	@RequestMapping("/menu")
	public String menu (@ModelAttribute("command") Form form, Model model) {
		return "menu";
	}

	@RequestMapping("/unsub")
	public String unsub (@ModelAttribute("command") Form form, Model model) {
		return "unsub";
	}

	@RequestMapping("/unsubConfirm")
	public String unsubConfirm (@ModelAttribute("command") Form form, Model model) {
		return "unsubResult";
	}
}
