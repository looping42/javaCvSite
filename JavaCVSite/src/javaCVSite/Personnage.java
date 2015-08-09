package javaCVSite;
import com.googlecode.objectify.annotation.*;

@Entity
@Index
public class Personnage {
	    String nom;
	    int niveau;
	    int vie;

	    public Personnage (String nom, int niveau) {
	        this.nom = nom;
	        this.niveau = niveau;
	        this.vie = 100;
	    }
	
}
