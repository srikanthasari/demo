package info.inetsolv;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController {

	@RequestMapping("/fc")
	public ModelAndView firstReq(ModelAndView view) {
		
		view.setViewName("one");
		
		return view;
		
		
		
	}
}
