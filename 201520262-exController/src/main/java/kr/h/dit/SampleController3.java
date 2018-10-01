package kr.h.dit;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController3 {
	@RequestMapping()
	public String urlD(Model model){
		StudentVO studentVO = new StudentVO();
		studentVO.setNo("201520262");
		studentVO.setName("유상훈");
		model.addAttribute(studentVO);
		return "read";
	}
}
