package javaCVSite;

import java.util.Date;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import com.googlecode.objectify.annotation.Cache;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;
import com.googlecode.objectify.annotation.Parent;

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

	public void AfficheMessage()
	{

		System.out.println("<div class='row'>");
		System.out.println(
				"<div class='col-sm-4'><a href='#' class=''><img src='http://placehold.it/1280X720' class='img-responsive'></a>");
		System.out.println("</div>");
		System.out.println("<div class='col-sm-8'>");
		System.out.println(
				"<h3 class='title'>teste affiche message</h3>");
		System.out.println(
				"<p class='text-muted'><span class='glyphicon glyphicon-lock'></span> Available Exclusively for Premium Members</p>");
		System.out.println(
				"<p>Could artificial intelligence have been used to prevent the high-profile Target breach? The concept is not so far-fetched. Organizations such as Mastercard and RBS WorldPay have long relied on artificial intelligence to detect fraudulent transaction patterns and prevent card.</p>");

		System.out.println("<p class='text-muted'>Presented by <a href='#'>Ellen Richey</a></p>");

		System.out.println("</div>");
		System.out.println(" </div>");
		System.out.println("<hr>");
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
