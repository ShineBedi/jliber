/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package biblio;

import java.util.*;

/**
 *
 * @author vargasch
 */
public class CtrNouvPeriodique {
  private Bibliotheque biblio;
  public CtrNouvPeriodique(Bibliotheque bib) {
    System.out.println();
    System.out.print("Ajout d'un periodique");
    System.out.println();
    
    System.out.print("ISSN : ");
    String issn = IO.lireChaine();
    System.out.print("Nom : ");
    String nom = IO.lireChaine();
    
    Periodique per = biblio.unPeriodique(issn);
    if (  per != null ){
      per = biblio.nouveauPeriodique(issn,nom );
      VuePeriodique(per);
    }
    
    
  }
  private void lierBibliotheque(Bibliotheque bib) {
      biblio = bib;
}
}
