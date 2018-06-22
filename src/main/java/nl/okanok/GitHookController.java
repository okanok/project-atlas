package nl.okanok;

public interface GitHookController {

	/**
	 * Handles the create branch event by creating new container when a feature branch is created.
	 */
	void createBranchHookHandler();

	/**
	 * Handles the merge branch event by closing the container of the merged feature branch .
	 */
	void mergeBranchHookHandler();

	/**
	 *  Handles the push event to a feature branch by updating the container of the feature branch.
	 */
	void pushChangesHookHandler();
}
