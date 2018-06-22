package nl.okanok.controllerImpl;

import nl.okanok.GitHookController;

public class GitHubHookController implements GitHookController {

	/**
	 * See https://developer.github.com/v3/activity/events/types/#createevent for payload.
	 * When the tag property is "branch" (new branch is created) this method should handle the request.
	 */
	public void createBranchHookHandler() {
		//TODO: start container
	}

	/**
	 * See https://developer.github.com/v3/activity/events/types/#pullrequestevent for payload.
	 * When the action property is "closed" and the merged property is true (pull request is merged)
	 * this method should handle the request.
	 */
	public void mergeBranchHookHandler() {
		//TODO: stop container

	}

	/**
	 * See https://developer.github.com/v3/activity/events/types/#pushevent for payload.
	 * This method will always handle the request.
	 */
	public void pushChangesHookHandler() {
		//TODO: update container
	}
}
