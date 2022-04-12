package objetsmetier;
import java.util.*;
/**
 * Classe modelisant une chambre dans un Hôpital. 
 *
 * A compléter si besoin.
 * 
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Chambre
{
    private int numChambre;
    private int nbLits;
    private ArrayList<Patient> occupants;
    private int nbLitsOccupes;
    private Personnel responsable;
    
    /**
     * Constructeur d'objets de classe Chambre
     */
    public Chambre(int numChambre, int nbLits)
    {
        this.numChambre = numChambre;
        this.nbLits = nbLits;
        this.occupants = new ArrayList<Patient>();
        this.nbLitsOccupes = occupants.size();
        this.responsable = null;
    }
    
    /**
     * Accesseur du numéro de chambre
     */
    public int getNumChambre(){
        return numChambre;
    }
    
     /**
     * Méthode ajoutant un patient dans la chambre
     * @Param Patient p : Le patient
     */
    public void ajouterOccupant(Patient p){
        occupants.add(p);
        nbLitsOccupes++;
    }
    
    // A compléter si besoin
}