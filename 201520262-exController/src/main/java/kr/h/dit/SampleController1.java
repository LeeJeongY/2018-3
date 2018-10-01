package kr.h.dit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController1 {
	@RequestMapping("urlA")
	public void urlA() {
	}
	@RequestMapping("urlB")
	public void urlB() {
	}
}
