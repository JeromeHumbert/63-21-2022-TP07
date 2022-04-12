package objetsmetier;
/**
 * Classe modelisant un patient dans un Hôpital. 
 * 
 * Ne pas modifier !
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Patient extends Personne
{
    private String dateHospitalisation;
    private int numChambre;

    /**
     * Constructeur d'objets de classe Patient
     */
    public Patient(String nom, String prenom, String dateHospitalisation,  int numChambre)
    {
        super(nom,prenom);
        this.dateHospitalisation = dateHospitalisation;
        this.numChambre = numChambre;
    }
    
     /**
     * Méthode retournant les coordonnées d'un patient
     * @Return String : Le nom et prénom du patient (hérité de Personne)
     */
    public String afficheCoordonnees(){
        return super.toString();    
    }
    
    /**
     * Méthode retournant le numéro de chambre du patient
     * @Return int numChambre : Le numéro de chambre
     */
    public int getNumChambre(){
        return numChambre;
    }
    
    /**
     * Méthode affectant un nouveau numéro de chambre
     * @Param int numChambre : Le numéro de chambre
     */
    public void setNumChambre(int numChambre){
        this.numChambre = numChambre;
    }
    
    /**
     * Méthode comparant une instance donnée à cette instance. (Héritée de Personne)
     * @Param Object p : une instance d'Object
     */
    public boolean equals(Object p){
        return super.equals(p);
    }
    
    /**
     * Méthode retournant un string permettant de (re)définir 
     *      l'affichage d'une instance de cette classe
     * @Return String : L'affichage de cette instance en string 
     *      (Partiellement héritée de Personne)
     */
    public String toString(){
        return super.toString() + "  Hospitalisation depuis le : "
            + dateHospitalisation + ". Actuellement dans la chambre : " 
            + numChambre;      
    }
}
