package javaCVSite;

import java.util.Date;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import com.googlecode.objectify.annotation.Cache;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;
import com.googlecode.objectify.annotation.Parent;

import com.googlecode.objectify.annotation.Cache;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;

@Entity
@Cache
public class Message
{
	@Parent
	Key parent;
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
		// ...
		this.parent = KeyFactory.createKey("LivreOr", "livreOr");
	}

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
}