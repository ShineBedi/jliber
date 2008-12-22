package biblio;

import java.util.*;
import java.io.*;

public class Document extends Observable
implements Serializable
{
    private String titre;
    private Set<MotCle> motsCles;
    private Set<Auteur> auteurs;

    public Document(String titre) {
        this.titre=titre;
        motsCles = new HashSet<MotCle>();
        auteurs  = new HashSet<Auteur>();
    }
  
    public String getTitre() {
        return titre;
    }

     public Set<Auteur> tesAuteurs() {
        return (Set<Auteur>)auteurs;
    }

    public Set<MotCle> tesMotsCles() {
        return (Set<MotCle>)motsCles;
    }

    protected void lierAuteur(Auteur aut) {
        auteurs.add(aut);
    }
    
    protected void lierMotCle(MotCle mc) {
        motsCles.add(mc);
    }

}

