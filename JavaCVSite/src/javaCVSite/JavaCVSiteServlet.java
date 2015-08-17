package javaCVSite;

import static com.googlecode.objectify.ObjectifyService.ofy;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.KeyFactory;
import com.googlecode.objectify.ObjectifyService;

@SuppressWarnings("serial")
public class JavaCVSiteServlet extends HttpServlet
{
	static
	{
		ObjectifyService.register(Personnage.class); // Fait connaître votre
		// classe-entité à
		// Objectify
		ObjectifyService.register(Arme.class);
		ObjectifyService.register(Message.class);

		Process();
	}

	public static void Process()
	{
		DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
		// Crée l'entité de type (kind) "Personnage"
		Entity personnage = new Entity("Personnage");

		// Assigne des propriétés à l'entité
		personnage.setProperty("nom", "Groknan le Barbare");
		personnage.setProperty("niveau", 25);
		personnage.setProperty("vie", 100);

		Entity arme = new Entity("Arme", "pourfendeur", personnage.getKey());

		arme.setProperty("nom", "Pourfendeur des faibles");
		arme.setProperty("degats", 250);

		// Enregistre l'entité dans le Datastore
		datastore.put(personnage);
		datastore.put(arme);

	}

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException
	{
		List<Message> messages = ofy().load().type(Message.class).ancestor(KeyFactory.createKey("LivreOr", "livreOr"))
				.order("-date").limit(5).list();

		req.setAttribute("messages", messages);
		this.getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);
		// ObjectifyService.register(Personnage.class); // Fait connaître votre
		// // classe-entité à
		// // Objectify
		// ObjectifyService.register(Arme.class);
		//
		// Process();

	}
}
