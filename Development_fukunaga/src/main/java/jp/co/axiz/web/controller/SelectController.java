package jp.co.axiz.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.axiz.web.entity.Form;

@Controller
public class SelectController {
	@RequestMapping(value="/select",method = RequestMethod.GET)
	public String jump (@ModelAttribute("command") Form form, Model model) {
		//select.jspにジャンプ
		return "select";
	}

	@RequestMapping(value="/selectResult",method = RequestMethod.GET)
	public String result (@ModelAttribute("command") Form form, Model model) {
		//検索する
		return "selectResult";
	}
}
