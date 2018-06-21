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
import jp.co.axiz.web.entity.Users;
import jp.co.axiz.web.service.UsersService;

@Controller
public class RankChangeController {

	@Autowired
	HttpSession session;
	@Autowired
	UsersService usersService;

	@RequestMapping(value="/rankChange",method = RequestMethod.GET)
	public String rankChange(@ModelAttribute("command") Form form, Model model) {
		//ランク変更ページへ
		return "rankChange";
	}

	@RequestMapping(value="/rankChangeConfirm",method = RequestMethod.GET)
	public String Confirm(@ModelAttribute("command") Form form, Model model) {
		//同じもの選んでないか判定
		Users loginUser=(Users)session.getAttribute("loginUser");
		String userRank=loginUser.getRank_id();
		String changeRank=form.getRank_id();
		if(userRank.equals("2")) {
			userRank="3";
		}
		boolean change=userRank.equals(changeRank);
		if(change) {
			model.addAttribute("msg", "変更がありませんでした");
			return "rankChange";
		}
		if(userRank.equals("1")) {
			model.addAttribute("changeRank", "有料");
		}else {
			model.addAttribute("changeRank", "無料");
		}
		model.addAttribute("userRank", loginUser.getRank());
		session.setAttribute("userRankId", changeRank);

		return "rankChangeConfirm";
	}

	@RequestMapping(value="/rankChangeResult",method = RequestMethod.GET)
	public String Result(@ModelAttribute("command") Form form, Model model) {
		//ランク変更処理
		Users loginUser=(Users)session.getAttribute("loginUser");
		String id=loginUser.getUser_id();
		String rank_id=(String)session.getAttribute("userRankId");
		if(rank_id.equals("3")) {
			rank_id="2";
			session.setAttribute("flg", true);
		}else {
			session.removeAttribute("flg");
		}
		usersService.rankChange(id,rank_id);
		session.removeAttribute("userRankId");

		List<Users> list=usersService.serchId(id);
		if(list.size()!=0) {
			session.setAttribute("loginUser", list.get(0));
		}

		return "rankChangeResult";
	}


}
