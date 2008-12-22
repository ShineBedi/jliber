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

    public Article(String titre, int page, Parution parution) {
        super(titre);
        this.page = page;
        this.lierParution(parution);
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