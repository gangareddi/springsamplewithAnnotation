package scenarios;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class spring {
	public class springmvc {
		
		
		public ModelAndView getSample(){
			ModelAndView modelAndView= new ModelAndView();
			modelAndView.addObject("message", "hello ganga");
			modelAndView.setViewName("home");
			return modelAndView;
		}

}
