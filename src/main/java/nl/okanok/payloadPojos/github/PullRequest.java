package nl.okanok.payloadPojos.github;

public class PullRequest {
	private Sender sender;

	private Repository repository;

	private Pull_request pull_request;

	private String action;

	private String number;

	public Sender getSender ()
	{
		return sender;
	}

	public void setSender (Sender sender)
	{
		this.sender = sender;
	}

	public Repository getRepository ()
	{
		return repository;
	}

	public void setRepository (Repository repository)
	{
		this.repository = repository;
	}

	public Pull_request getPull_request ()
	{
		return pull_request;
	}

	public void setPull_request (Pull_request pull_request)
	{
		this.pull_request = pull_request;
	}

	public String getAction ()
	{
		return action;
	}

	public void setAction (String action)
	{
		this.action = action;
	}

	public String getNumber ()
	{
		return number;
	}

	public void setNumber (String number)
	{
		this.number = number;
	}

	@Override
	public String toString()
	{
		return "ClassPojo [sender = "+sender+", repository = "+repository+", pull_request = "+pull_request+", action = "+action+", number = "+number+"]";
	}
}
