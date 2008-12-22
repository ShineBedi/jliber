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
        extends Index
        implements Serializable {

    private String motCle;

    // *************************
    //     Constructeur
    // *************************
    public MotCle(String motCle) {
        super(motCle);
        this.motCle = motCle;
    } // Fin Constructeur

    //**********************************************
    // Methodes d'acces aux attributs de la classe
    //**********************************************

    public String motCle() { return motCle; }
    
}
