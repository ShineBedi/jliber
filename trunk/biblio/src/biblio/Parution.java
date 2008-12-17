/**
 *
 * @author Guillaume
 */

package biblio;

import java.io.*;
//import java.lang.*;
import java.util.*;

public class Parution
        extends Observable        // pour MVC
        implements Serializable{

        private String numpar;
        
        private Periodique periodique;

        private Set<Article> articles;

        public Parution(String numpar, Periodique periodique) {
           this.numpar = numpar;
           this.lierPeriodique(periodique);
           articles = new HashSet<Article>();
        }

        public String numpar() { return numpar; }
        
        public Periodique tonPeriodique() {return periodique;}

        public Set<Article> tesArticles() {
            return (Set<Article>)articles;
        }

        public void lierPeriodique(Periodique periodique) {
            this.periodique = periodique;
        }

        public void lierArticle(Set<Article> articles) {
            this.articles = articles;
        }

}
