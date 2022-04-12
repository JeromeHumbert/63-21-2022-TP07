import objetsmetier.Chambre;
import objetsmetier.Patient;
import presentation.Hopital;
/**
 * Classe de test permettant l'accès aux différentes fonctionnalités d'une instance d'Hôpital
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class TestHopital
{
    public static void main(String[] args) {
        Hopital hop = new Hopital();
        System.out.println("---------Tests ajouts patient---------"); // le dernier fonctionne
        hop.ajoutPatient(new Patient("Bonnard", "Jean", "13.04.2022", 101));
        hop.ajoutPatient(new Patient("Bonnard", "Jean", "13.04.2022", 1010));
        hop.ajoutPatient(new Patient("Leta", "Josiane", "16.09.2018", 101));
        hop.ajoutPatient(new Patient("Bonnard", "Jean", "13.04.2022", 304));

        System.out.println("---------Tests changement de chambre---------"); // le dernier fonctionne
        hop.changerChambre(new Patient("Obama", "Donald", "17.02.2018", 304),101);
        hop.changerChambre(new Patient("Obama", "Donald", "17.02.2018", 304),1010);
        hop.changerChambre(new Patient("Obama", "Donald", "17.02.2018", 304),304);
        hop.changerChambre(new Patient("Obama", "Donald", "17.02.2018", 304),103);

        System.out.println("---------Répartition du personnel---------");
        hop.repartitionDuPersonnel();

        System.out.println("---------Recherche de personne---------");
        hop.recherchePersonne("Simi", "Jack");
        hop.recherchePersonne("Lazzi", "Enzo");
        hop.recherchePersonne("Dupont", "Jean");
        hop.recherchePersonne("Bolard", "Jean");
    }
}
