package javaCVSite;

import com.googlecode.objectify.Key;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Parent;

@Entity
public class Arme
{
	@Id
	Long id;
	@Parent
	Key<Personnage> parent;
	String nom;
	int degats;

	private Arme()
	{
	}

	public Arme(String nom, int degats, Key<Personnage> parent)
	{
		this.nom = nom;
		this.degats = degats;
		this.parent = parent;
	}
}
