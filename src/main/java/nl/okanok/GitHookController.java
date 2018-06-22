package nl.okanok;

public interface GitHookController {

	/**
	 * Handles the create branch event by creating new container when a feature branch is created.
	 */
	void createBranchHookHandler(String payload);

	/**
	 * Handles the merge branch event by closing the container of the merged feature branch .
	 */
	void mergeBranchHookHandler(String payload);

	/**
	 *  Handles the push event to a feature branch by updating the container of the feature branch.
	 */
	void pushChangesHookHandler(String payload);
}
