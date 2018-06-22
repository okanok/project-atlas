package nl.okanok.payloadPojos.github;

public class Links {
	private Link issue;

	private Link commits;

	private Link html;

	private Link self;

	private Link review_comments;

	private Link statuses;

	private Link review_comment;

	private Link comments;

	public Link getIssue ()
	{
		return issue;
	}

	public void setIssue (Link issue)
	{
		this.issue = issue;
	}

	public Link getCommits ()
	{
		return commits;
	}

	public void setCommits (Link commits)
	{
		this.commits = commits;
	}

	public Link getHtml ()
	{
		return html;
	}

	public void setHtml (Link html)
	{
		this.html = html;
	}

	public Link getSelf ()
	{
		return self;
	}

	public void setSelf (Link self)
	{
		this.self = self;
	}

	public Link getReview_comments ()
	{
		return review_comments;
	}

	public void setReview_comments (Link review_comments)
	{
		this.review_comments = review_comments;
	}

	public Link getStatuses ()
	{
		return statuses;
	}

	public void setStatuses (Link statuses)
	{
		this.statuses = statuses;
	}

	public Link getReview_comment ()
	{
		return review_comment;
	}

	public void setReview_comment (Link review_comment)
	{
		this.review_comment = review_comment;
	}

	public Link getComments ()
	{
		return comments;
	}

	public void setComments (Link comments)
	{
		this.comments = comments;
	}

	@Override
	public String toString()
	{
		return "ClassPojo [issue = "+issue+", commits = "+commits+", html = "+html+", self = "+self+", review_comments = "+review_comments+", statuses = "+statuses+", review_comment = "+review_comment+", comments = "+comments+"]";
	}
}
