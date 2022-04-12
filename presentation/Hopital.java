package presentation;
import objetsmetier.*;
import bdd.*;
import java.util.*;
/**
 * Classe modélisant un Hôpital
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Hopital
{
    /* Contient toutes les chambres */
    private ArrayList<Chambre> chambres;
    /* Contient tous les patients */
    private ArrayList<Patient> patients;
    /* Contient tous le personnel */
    private ArrayList<Personnel> personnels;

    /**
     * Constructeur d'objets de classe Hopital
     */
    public Hopital()
    {
        this.patients = Donnees.getPatientData();
        this.chambres = Donnees.getChambreData();
        this.personnels = Donnees.getPersonnelData();
        chargerPatientChambre();
    }
    
    /**
     * Méthode affectant les patients dans les chambres.
     */
    private void chargerPatientChambre(){
        for (Chambre c : chambres){
            for (Patient p : patients){
                if(c.getNumChambre() == p.getNumChambre()){
                    c.ajouterOccupant(p);
                }
            }
        }
    }
    
    /**
     * Méthode permettant d'ajouter un patient dans une chambre 
     *      (et dans la liste des patients).
     * L'ajout se fait uniquement si : 
     *      Le patient n'est pas déjà dans la chambre
     *      La chambre liée au patient existe
     *      La chambre n'est pas pleine
     * Se référer à l'énoncé pour l'affichage
     * @Param Patient p : Le patient à ajouter
     */
    public void ajoutPatient(Patient p){
        // A développer
    }
    
    /**
     * Méthode permettant de changer un patient de chambre
     * Le déplacement se fait uniquement si : 
     *      Le patient n'est pas déjà dans la chambre
     *      La chambre liée au patient existe
     *      La chambre n'est pas pleine
     * Se référer à l'énoncé pour l'affichage
     * @Param Patient p : Le patient à ajouter
     * @Param int numChambreVers : La chambre où transférer le patient
     */
    public void changerChambre(Patient p, int numChambreVers){
        // A développer
    }
    
    
    /**
     * Méthode répartissant le personnel comme responsable de chambre
     *      de manière aléatoire.
     * Contrainte : Un membre du personnel ne peut pas être responsable
     *      de deux chambres simultanément.
     */
    public void repartitionDuPersonnel (){
        // A développer
    }
    
    /**
     * Méthode permettant de rechercher une personne dans l'Hôpital
     *      et l'affichant (voir énoncé pour les types d'affichages). 
     * @Param String nom : Le nom à rechercher
     * @Param String prénom : Le prénom à rechercher
     */
    public void recherchePersonne(String nom, String prenom){
        // A développer
    }
}