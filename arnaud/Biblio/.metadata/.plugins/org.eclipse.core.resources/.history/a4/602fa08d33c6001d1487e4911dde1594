package biblio;

public class CtrRendreExNonDispo {

        // *************************
//        Attributs
// *************************
                private Bibliotheque biblio;

// *************************
//        Constructeur
// *************************
public CtrRendreExNonDispo(Bibliotheque bib) {

  // Liaison � l'appli "Bibliotheque"
  this.lierBibliotheque(bib);

  System.out.println();
  System.out.print("Rendre un exemplaire non disponible");
   System.out.println();

   System.out.println();
   System.out.print("Numero ISBN :");
   String isbn = IO.lireChaine();

   // V�rification l'existence de l'ouvrage / isbn
   Ouvrage ouv = biblio.unOuvrage(isbn);
   if (ouv != null) {

       System.out.print("Num�ro d'exemplaire : ");
       int numero = IO.lireEntier();

       // V�rification l'existence de l'exemplaire / num�ro
       Exemplaire exemp = ouv.unExemplaire(numero);
       if (exemp != null) {

               // l'exemplaire est actuellement non disponible
               if (exemp.estNonDisponible() )
                   System.out.print("L'exemplaire est d�j� non disponible.");
               else
               {
                       biblio.modifStatutExemplaire(exemp,exemp.nonDisponible);

                   // Cr�ation de la vue Exemplaire
                   VueExemplaire vExemp = new VueExemplaire(exemp);

                   // Suppression de la vue vExemp comme Observatrice de l'objet exemp
                   vExemp.elimineObserveur();
                   vExemp = null;
               }
       }

       else System.out.print("L'exemplaire n'existe pas.");
   }
   else System.out.print("L'ouvrage n'existe pas.");

} // Fin Constructeur

// *******************************
//      M�thodes priv�es
// *******************************
private void lierBibliotheque(Bibliotheque bib) {
    biblio = bib;
} // Fin lierBibliotheque

}   // fin CtrRendreExNonDispo
