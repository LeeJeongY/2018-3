package kr.ac.dit.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import kr.ac.dit.domain.StudentVO;
import kr.ac.dit.service.StudentService;
@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;
	@RequestMapping("testDI")
	public void testDI(StudentVO studentVO, Model model) throws Exception {
		studentService.createStudent(studentVO);
	}
}
