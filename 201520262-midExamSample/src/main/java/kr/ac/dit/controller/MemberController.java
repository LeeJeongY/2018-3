package kr.ac.dit.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.ac.dit.domain.MemberVO;
import kr.ac.dit.service.MemberService;
@Controller
public class MemberController {
	@Autowired
	private MemberService memberService;
	@RequestMapping(value = "createmember", method = RequestMethod.GET) 
	public void createGET() throws Exception {
	}
	@RequestMapping(value = "createmember", method = RequestMethod.POST) 
	public void createPOST(MemberVO studentVO, Model model) throws Exception {
		memberService.createMember(studentVO);
	}
	@RequestMapping("readmember") 
	public void readList(Model model) throws Exception {
		model.addAttribute("items", memberService.readMemberList());
	}
}