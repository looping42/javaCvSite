package javaCVSite;
import com.googlecode.objectify.ObjectifyService;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class JavaCVSiteServlet extends HttpServlet {
	static {
	        ObjectifyService.register(Personnage.class); // Fait connaître votre classe-entité à Objectify
	}
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, Denis");
	}
}
