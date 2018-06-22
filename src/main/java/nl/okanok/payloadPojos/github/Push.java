package nl.okanok.payloadPojos.github;

public class Push {
	private Pusher pusher;

	private String before;

	private String compare;

	private String deleted;

	private Sender sender;

	private String after;

	private String ref;

	private String base_ref;

	private String created;

	private String head_commit;

	private Repository repository;

	private String[] commits;

	private String forced;

	public Pusher getPusher ()
	{
		return pusher;
	}

	public void setPusher (Pusher pusher)
	{
		this.pusher = pusher;
	}

	public String getBefore ()
	{
		return before;
	}

	public void setBefore (String before)
	{
		this.before = before;
	}

	public String getCompare ()
	{
		return compare;
	}

	public void setCompare (String compare)
	{
		this.compare = compare;
	}

	public String getDeleted ()
	{
		return deleted;
	}

	public void setDeleted (String deleted)
	{
		this.deleted = deleted;
	}

	public Sender getSender ()
	{
		return sender;
	}

	public void setSender (Sender sender)
	{
		this.sender = sender;
	}

	public String getAfter ()
	{
		return after;
	}

	public void setAfter (String after)
	{
		this.after = after;
	}

	public String getRef ()
	{
		return ref;
	}

	public void setRef (String ref)
	{
		this.ref = ref;
	}

	public String getBase_ref ()
	{
		return base_ref;
	}

	public void setBase_ref (String base_ref)
	{
		this.base_ref = base_ref;
	}

	public String getCreated ()
	{
		return created;
	}

	public void setCreated (String created)
	{
		this.created = created;
	}

	public String getHead_commit ()
	{
		return head_commit;
	}

	public void setHead_commit (String head_commit)
	{
		this.head_commit = head_commit;
	}

	public Repository getRepository ()
	{
		return repository;
	}

	public void setRepository (Repository repository)
	{
		this.repository = repository;
	}

	public String[] getCommits ()
	{
		return commits;
	}

	public void setCommits (String[] commits)
	{
		this.commits = commits;
	}

	public String getForced ()
	{
		return forced;
	}

	public void setForced (String forced)
	{
		this.forced = forced;
	}

	@Override
	public String toString()
	{
		return "ClassPojo [pusher = "+pusher+", before = "+before+", compare = "+compare+", deleted = "+deleted+", sender = "+sender+", after = "+after+", ref = "+ref+", base_ref = "+base_ref+", created = "+created+", head_commit = "+head_commit+", repository = "+repository+", commits = "+commits+", forced = "+forced+"]";
	}
}
