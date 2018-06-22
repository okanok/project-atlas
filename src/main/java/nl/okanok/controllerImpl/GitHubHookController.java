package nl.okanok.controllerImpl;

import com.google.gson.Gson;
import nl.okanok.GitHookController;
import nl.okanok.payloadPojos.github.Create;
import nl.okanok.payloadPojos.github.PullRequest;
import nl.okanok.payloadPojos.github.Push;

public class GitHubHookController implements GitHookController {

	private Gson gson;

	//TODO: add payloadPojos to mvnrepository.

	public GitHubHookController() {
		gson = new Gson();
	}

	/**
	 * See https://developer.github.com/v3/activity/events/types/#createevent for payload.
	 * When the tag property is "branch" (new branch is created) this method should handle the request.
	 */
	public void createBranchHookHandler(String payload) {
		Create payloadPojo = gson.fromJson(payload, Create.class);
		if (payloadPojo.getRef_type().equals("branch")) {
			//TODO: start container
		}
	}

	/**
	 * See https://developer.github.com/v3/activity/events/types/#pullrequestevent for payload.
	 * When the action property is "closed" and the merged property is true (pull request is merged)
	 * this method should handle the request.
	 */
	public void mergeBranchHookHandler(String payload) {
		PullRequest payloadPojo = gson.fromJson(payload, PullRequest.class);
		if (payloadPojo.getAction().equals("closed") && payloadPojo.getPull_request().getMerged()){
			//TODO: stop container
		}
	}

	/**
	 * See https://developer.github.com/v3/activity/events/types/#pushevent for payload.
	 * This method will always handle the request.
	 */
	public void pushChangesHookHandler(String payload) {
		//TODO: update container
		Push payloadPojo = gson.fromJson(payload, Push.class);
	}
}
