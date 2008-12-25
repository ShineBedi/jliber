
package biblio;

import java.util.*;
import java.io.*;

public class Index
implements Serializable
{
      private String idf;
      private Set<Object> documents;

      public Index(String valeur) {
        idf =valeur;
        documents = new HashSet<Object>();
      }

      public Index(String nom, String prenom) {
         idf= nom+prenom;
      }

      public String getIdf() {
        return idf;
      }

      public Set<Object> tesArticles() {
        Set<Object> articles = new HashSet<Object>();
        for(Object d:documents) {
          if(d instanceof Article)
            articles.add((Article)d);
        }
        return articles;
      }

      public Set<Object> tesOuvrages() {
        Set<Object> ouvrages = new HashSet<Object>();
        for(Object d:documents) {
          if(d instanceof Ouvrage)
            ouvrages.add((Ouvrage)d);
        }
        return ouvrages;
      }

      public void lierOuvrage(Ouvrage ouv) {
            documents.add(ouv);
      } // Fin lierOuvrage

       public void lierArticle(Article art) {
            documents.add(art);
      }

}
