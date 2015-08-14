package javaCVSite;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
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

		// Enregistre l'entité dans le Datastore
		datastore.put(personnage);
		// Crée l'entité de type (kind) "Personnage" avec l'ID "groknan"
		// Entity personnage = new Entity("Personnage", "groknan");

		// immédiatement)
		// Key clePersonnage = Key.create(Personnage.class, "groknan");
		// Key cleGroknan = Key.create(Personnage.class, "groknan");
		// Personnage r = ofy().load().key(cleGroknan).now();

		// Retourne tous les personnages dont la vie est supérieure à 50
		// List<Personnage> personnages =
		// ofy().load().type(Personnage.class).filter("vie >", 50).list();
		// Pas d'opérateur : retourne tous les personnages dont la vie est égale
		// à 50
		// List<Personnage> personnages =
		// ofy().load().type(Personnage.class).filter("vie", 50).list();

		// List<Arme> armes =
		// ofy().load().type(Arme.class).ancestor(KeyFactory.createKey("Personnage",
		// "groknan")).list();
		// Iterable<Key<Personnage>> clesPersonnagesFaibles =
		// ofy().load().type(Personnage.class).filter("vie <", 30)
		// .keys();

		// Supprime tous les personnages faibles
		// ofy().delete().keys(clesPersonnagesFaibles);

	}

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException
	{
		// resp.sendRedirect('javacvsite.jsp');
		this.getServletContext().getRequestDispatcher("/javacvsite.jsp").forward(req, resp);
		// ObjectifyService.register(Personnage.class); // Fait connaître votre
		// // classe-entité à
		// // Objectify
		// ObjectifyService.register(Arme.class);
		//
		// Process();
	}
}
