
package bdd;

import java.util.ArrayList;
import objetsmetier.Chambre;
import objetsmetier.Patient;
import objetsmetier.Personnel;

public class Donnees {
    public Donnees() {
    }

    public static ArrayList<Patient> getPatientData() {
        ArrayList<Patient> aL = new ArrayList<>();
        aL.add(new Patient("Dupont", "Jean", "26.09.2017", 101));
        aL.add(new Patient("Vileret", "Ralph", "16.02.2015", 103));
        aL.add(new Patient("Germot", "Paul", "01.01.2019", 102));
        aL.add(new Patient("Baken", "William", "13.05.2018", 103));
        aL.add(new Patient("Rohr", "Nicolas", "09.09.2018", 101));
        aL.add(new Patient("Fazi", "Stéphanie", "31.10.2018", 202));
        aL.add(new Patient("Tirol", "Geneviève", "02.11.2005", 301));
        aL.add(new Patient("Ottoni", "David", "26.03.2019", 304));
        aL.add(new Patient("Schaub", "Alex", "05.01.2019", 101));
        aL.add(new Patient("Droz", "Eric", "30.01.2019", 103));
        aL.add(new Patient("Diener", "Michael", "10.12.2018", 301));
        aL.add(new Patient("Obama", "Donald", "17.02.2018", 304));
        aL.add(new Patient("Borlo", "Sarah", "11.06.2018", 202));
        aL.add(new Patient("Leta", "Josiane", "16.09.2018", 101));
        return aL;
    }

    public static ArrayList<Personnel> getPersonnelData() {
        ArrayList<Personnel> aL = new ArrayList<>();
        aL.add(new Personnel("Lazzi", "Enzo", "23.09.2013"));
        aL.add(new Personnel("Nguyen", "Alexandre", "16.05.2011"));
        aL.add(new Personnel("Henrich", "Jacques", "01.05.2001"));
        aL.add(new Personnel("Lilo", "Lola", "13.05.1997"));
        aL.add(new Personnel("Graf", "Benoit", "09.09.2015"));
        aL.add(new Personnel("Ruedi", "Marc", "31.10.2017"));
        aL.add(new Personnel("Reist", "Marianne", "02.11.2002"));
        aL.add(new Personnel("Zapov", "Oksana", "26.03.2019"));
        aL.add(new Personnel("Merla", "Judith", "05.01.2013"));
        aL.add(new Personnel("Vithu", "Ross", "30.01.2004"));
        aL.add(new Personnel("Simi", "Jack", "10.12.2010"));
        aL.add(new Personnel("Franc", "Simon", "17.02.2006"));
        aL.add(new Personnel("Bourgeois", "Fabio", "11.06.2004"));
        aL.add(new Personnel("Clerc", "Florent", "16.09.2009"));
        return aL;
    }

    public static ArrayList<Chambre> getChambreData() {
        ArrayList<Chambre> aL = new ArrayList<>();
        aL.add(new Chambre(101, 4));
        aL.add(new Chambre(102, 6));
        aL.add(new Chambre(103, 8));
        aL.add(new Chambre(202, 2));
        aL.add(new Chambre(301, 4));
        aL.add(new Chambre(304, 4));
        return aL;
    }
}
