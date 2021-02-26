package MVCAssignment1;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	@RequestMapping("/helloWorld") 
	public ModelAndView test()
	{
		System.out.println("Model no. 1");
		ModelAndView model=new ModelAndView("helloworld");
		return model;
	}
	
	@RequestMapping("/Adios") 
	public ModelAndView test2()
	{
		System.out.println("Model no. 2");
		ModelAndView model=new ModelAndView("index","msg","Adios");
		model.addObject("msg1","Byee");
		return model;
	}
}
