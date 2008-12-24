package biblio;

import java.io.*;
import java.util.*;

public class Article
        extends Document
        implements Serializable {

//**************************
//        Attributs
//**************************


    private int    page;

    private Parution     parution;

    public Article(String titre, int page, Parution parution, Set<Auteur> mesAuteurs, Set<MotCle> mesMotsCles) {
        super(titre);
        this.page = page;
        this.lierParution(parution);
        parution.lierArticle(this);
        for(Auteur aut:mesAuteurs) {
                this.lierAuteur(aut);
                aut.lierArticle(this);
         }
         for(MotCle mc:mesMotsCles) {
              this.lierMotCle(mc);
                mc.lierArticle(this);
         }
    }

    //**********************************************
    // Methodes d'acces aux attributs de la classe
    //**********************************************

    public int page() { return page; }

    public Parution taParution() {
        return (Parution)parution;
    }


    // ***************************
    //     Méthodes privées
    // ***************************
    private void lierParution(Parution parution) {
        this.parution = parution;
    }


}