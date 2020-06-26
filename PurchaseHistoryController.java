package jp.co.internous.react.controller;





import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jp.co.internous.react.model.domain.dto.PurchaseHistoryDto;
import jp.co.internous.react.model.mapper.TblPurchaseHistoryMapper;
import jp.co.internous.react.model.session.LoginSession;

@Controller
@RequestMapping("/react/history")
public class PurchaseHistoryController {
	
	@Autowired
	LoginSession loginSession;
	
	@Autowired
	TblPurchaseHistoryMapper purchaseMapper;
	

	@RequestMapping("/")
	public String index(Model model) {
		long userId = loginSession.getUserId();
		List<PurchaseHistoryDto> historyList = purchaseMapper.findByUserId(userId);
		
		model.addAttribute("historyList", historyList);
		model.addAttribute("loginSession", loginSession);
		
		return "purchase_history";
	} 
	
	@RequestMapping("/delete")
	@ResponseBody
	public boolean delete() {
		long userId = loginSession.getUserId();
		long result = purchaseMapper.logicalDeleteByUserId(userId);
		
		return result > 0;
	}
	
}
