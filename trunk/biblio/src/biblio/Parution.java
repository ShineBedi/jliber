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

        private String idParution;
        private Periodique periodique;
        private Set<Article> articles;

        public Parution(String idParution, Periodique periodique) {
           this.idParution = idParution;
           this.lierPeriodique(periodique);
           articles = new HashSet<Article>();
        }

        public String idParution() { return idParution; }
        
        public Periodique tonPeriodique() {return periodique;}

        public Set<Article> tesArticles() {
            return (Set<Article>)articles;
        }

        public void lierPeriodique(Periodique periodique) {
            this.periodique = periodique;
        }

        public void lierArticle(Article art) {
            articles.add(art);
        }

}
