/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package biblio;

import java.io.*;
import java.util.*;

/**
 *
 * @author mailleta
 */
public class MotCle
        extends Observable          // pour MVC
        implements Serializable {

    private String motCle;


    // Attributs d'Association
    private Set<Article> articles;
    private Set<Ouvrage> ouvrages;

    // *************************
    //     Constructeur
    // *************************
    public MotCle(String motCle) {
        this.motCle = motCle;
        articles = new HashSet<Article>();
        ouvrages = new HashSet<Ouvrage>();
    } // Fin Constructeur

    //**********************************************
    // Methodes d'acces aux attributs de la classe
    //**********************************************

    public String motCle() { return motCle; }

    
    public Set<Article> tesArticles() {
        return (Set<Article>)articles;
    }

    public Set<Ouvrage> tesOuvrages() {
        return (Set<Ouvrage>)ouvrages;
    }



    // ***************************
    //     Méthodes privées
    // ***************************
    private void lierOuvrage(Set<Ouvrage> ouv) {
        ouvrages = ouv;
    } // Fin lierOuvrage

    private void lierArticle(Set<Article> art) {
        articles = art;
    }
}
