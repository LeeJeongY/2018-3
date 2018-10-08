package kr.ac.dit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import kr.ac.dit.ClassB;
@Controller
public class TestConstructorSpringDI {
 @Autowired
 ClassB classB;
 @RequestMapping("testDI")
 public void testDI() {
  classB.methodB();
 }
}