
package biblio;

import java.io.*;

public class Start {

 

    
    
    
//****************************
//      Constructeur
//****************************
public  Start()  {
    // Creation de l'instance Appli
    Bibliotheque  bib = new Bibliotheque();
    String nomfich = "bd.data";
// Restauration des objets de l'application
{
try  {
    FileInputStream f = new FileInputStream(nomfich);
    ObjectInputStream in = new ObjectInputStream(f);

    bib = (Bibliotheque) in.readObject();
    System.out.println();
    System.out.println(" $$$ Restauration du fichier "+nomfich+" realisée");
    System.out.println();
    f.close();
    
}
  catch (Exception e)  {
        System.out.println(" *** ");
        System.out.println(" *** Start : Pbs de Restauration / fichier "+nomfich);
        System.out.println(" *** ");
}

    

    // Creation de l'instance menu de MenuBiblio
    MenuGUI menu = new MenuGUI();

    // Appel au Menu Principal
    menu.menuPrincipal(bib);
  

} // Fin Constructeur
}
//************************************
//         Programme Principal
//************************************

public static void main (String Args[])  {
        new Start() ;
} // Fin main

} // Fin Classe Start

