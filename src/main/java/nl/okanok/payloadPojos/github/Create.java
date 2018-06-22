package nl.okanok.payloadPojos.github;

public class Create {
	private Sender sender;

	private String ref;

	private Repository repository;

	private String description;

	private String ref_type;

	private String master_branch;

	private String pusher_type;

	public Sender getSender ()
	{
		return sender;
	}

	public void setSender (Sender sender)
	{
		this.sender = sender;
	}

	public String getRef ()
	{
		return ref;
	}

	public void setRef (String ref)
	{
		this.ref = ref;
	}

	public Repository getRepository ()
	{
		return repository;
	}

	public void setRepository (Repository repository)
	{
		this.repository = repository;
	}

	public String getDescription ()
	{
		return description;
	}

	public void setDescription (String description)
	{
		this.description = description;
	}

	public String getRef_type ()
	{
		return ref_type;
	}

	public void setRef_type (String ref_type)
	{
		this.ref_type = ref_type;
	}

	public String getMaster_branch ()
	{
		return master_branch;
	}

	public void setMaster_branch (String master_branch)
	{
		this.master_branch = master_branch;
	}

	public String getPusher_type ()
	{
		return pusher_type;
	}

	public void setPusher_type (String pusher_type)
	{
		this.pusher_type = pusher_type;
	}

	@Override
	public String toString()
	{
		return "ClassPojo [sender = "+sender+", ref = "+ref+", repository = "+repository+", description = "+description+", ref_type = "+ref_type+", master_branch = "+master_branch+", pusher_type = "+pusher_type+"]";
	}
}
