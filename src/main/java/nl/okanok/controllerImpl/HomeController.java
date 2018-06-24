package nl.okanok.controllerImpl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HomeController {


	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView startPage(ModelAndView mv) {
		mv.setViewName("setup");
		return mv;
	}

	@RequestMapping(value = "postsettings", method = RequestMethod.POST)
	public String setSettings(@RequestBody String payload) {
		return "ok";
	}
}
