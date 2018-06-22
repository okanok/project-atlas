package nl.okanok;

import nl.okanok.controllerImpl.GitHubHookController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hook")
public class HookController implements GitHookController{

	private GitHookController hookController;

	public HookController() {
		hookController = new GitHubHookController();
	}

	/**
	 * Endpoint to check version number
	 */
	@RequestMapping(value = "/version", method = RequestMethod.GET)
	public String getVersionNumber(){
		return "0.1";
	}

	/**
	 * Endpoint for handling the create branch event.
	 */
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public void createBranchHookHandler() {
		hookController.createBranchHookHandler();
	}

	/**
	 * Endpoint for handling the merge branch event.
	 */
	@RequestMapping(value = "/merge", method = RequestMethod.POST)
	public void mergeBranchHookHandler() {
		hookController.mergeBranchHookHandler();
	}

	/**
	 * Endpoint for handling the push event.
	 */
	@RequestMapping(value = "/push", method = RequestMethod.POST)
	public void pushChangesHookHandler() {
		hookController.pushChangesHookHandler();
	}
}
