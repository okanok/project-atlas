package nl.okanok.payloadPojos.github;

public class Head {
	private String ref;

	private String sha;

	private Repository repo;

	private String label;

	private User user;

	public String getRef ()
	{
		return ref;
	}

	public void setRef (String ref)
	{
		this.ref = ref;
	}

	public String getSha ()
	{
		return sha;
	}

	public void setSha (String sha)
	{
		this.sha = sha;
	}

	public Repository getRepo ()
	{
		return repo;
	}

	public void setRepo (Repository repo)
	{
		this.repo = repo;
	}

	public String getLabel ()
	{
		return label;
	}

	public void setLabel (String label)
	{
		this.label = label;
	}

	public User getUser ()
	{
		return user;
	}

	public void setUser (User user)
	{
		this.user = user;
	}

	@Override
	public String toString()
	{
		return "ClassPojo [ref = "+ref+", sha = "+sha+", repo = "+repo+", label = "+label+", user = "+user+"]";
	}
}
