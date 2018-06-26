package nl.okanok.controllerImpl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HomeController {


	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView startPage(ModelAndView mv) {
		if(SettingsController.settingsSet) {
			mv.setViewName("main");
		} else {
			mv.setViewName("setup");
		}
		return mv;
	}

}
