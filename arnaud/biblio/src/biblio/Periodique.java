/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package biblio;

/**
 *
 * @author vargasch
 */
public class Periodique {
  String _issn ;
  String _nom  ;
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
