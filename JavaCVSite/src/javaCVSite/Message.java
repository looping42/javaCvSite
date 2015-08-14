package javaCVSite;

import java.util.Date;

import com.googlecode.objectify.annotation.Cache;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;

@Entity
@Cache
public class Message
{
	@Id
	Long id; // Sera généré automatiquement
	@Index
	Date date;
	String name;
	String message;

	private Message()
	{
	}

	public Message(String name, String message)
	{
		this.name = name;
		this.message = message;
		this.date = new Date();
	}

	public Date getDate()
	{
		return date;
	}

	public String getMessage()
	{
		return message;
	}

	public String getName()
	{
		return name;
	}

	public void setDate(Date date)
	{
		this.date = date;
	}

	public void setMessage(String message)
	{
		this.message = message;
	}

	public void setName(String name)
	{
		this.name = name;
	}
}
