/**
 *
 * @author Guillaume
 */

package biblio;

import java.io.*;
//import java.lang.*;
import java.util.*;

public class Article
        extends Observable        // pour MVC
        implements Serializable{

// *************************
//        Attributs
// *************************
    private String titre;
    private int numero_page;
    private Hashtable auteurs;
    private Hashtable motscles;

}
