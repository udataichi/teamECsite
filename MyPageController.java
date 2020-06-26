package jp.co.internous.react.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.internous.react.model.domain.MstUser;
import jp.co.internous.react.model.mapper.MstUserMapper;
import jp.co.internous.react.model.session.LoginSession;

@Controller
@RequestMapping("/react/mypage")
public class MyPageController {
	
	@Autowired
	MstUserMapper mstUserMapper;
	
	@Autowired 
	LoginSession loginSession;
	
	
	@RequestMapping("/")
	public String index(Model model) {
		
		// ユーザ名とパスワードでDBのユーザ検索 
		MstUser user = mstUserMapper.findByUserNameAndPassword(loginSession.getUserName(), loginSession.getPassword());
			
			
		model.addAttribute("user", user);
		model.addAttribute("loginSession", loginSession);
		
		return "my_page";
		
	}
	
}
