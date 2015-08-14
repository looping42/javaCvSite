package javaCVSite;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;
import com.googlecode.objectify.annotation.Unindex;

@Entity
@Index
public class Personnage
{
	@Id
	String id;
	@Unindex
	String nom;
	int niveau;
	int vie;

	private Personnage()
	{
	}

	public Personnage(String nom, int niveau)
	{
		this.id = nom;
		this.nom = nom;
		this.niveau = niveau;
		this.vie = 100;
	}
}
