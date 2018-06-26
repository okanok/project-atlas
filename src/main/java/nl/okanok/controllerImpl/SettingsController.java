package nl.okanok.controllerImpl;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/settings")
public class SettingsController {
	static boolean settingsSet = false;

	@RequestMapping(value = "/postAll", method = RequestMethod.POST)
	public void setSettings(@RequestBody String payload) {
		settingsSet = true;
	}

}
