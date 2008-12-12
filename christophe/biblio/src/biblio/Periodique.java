/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package biblio;

import java.io.*;
//import java.lang.*;
import java.util.*;
/**
 *
 * @author vargasch
 */
public class Periodique  extends Observable        // pour MVC
        implements Serializable
{
  private String _issn ;
  private String _nom  ;
  public Periodique( String issn , String nom ){
    _nom = nom ;
    _issn = issn ;
  }
  public String issn() {
    return _issn ;
  }
  public String nom(){
    return _nom ;
  }
}
