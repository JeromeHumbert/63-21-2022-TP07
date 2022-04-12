package objetsmetier;
/**
 * Classe modelisant un membre du personnel d'un Hôpital. 
 *
 * Ne pas modifier !
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Personnel extends Personne
{
    private String dateEngagement;

    /**
     * Constructeur d'objets de classe Patient
     */
    public Personnel(String nom, String prenom, String dateEngagement)
    {
        super(nom,prenom);
        this.dateEngagement = dateEngagement;
    }
    
    /**
     * Méthode retournant les coordonnées d'un patient
     * @return String : Le nom et prénom du patient (hérité de Personne)
     */
    public String afficheCoordonnees(){
        return super.toString();    
    }
    
    /**
     * Méthode retournant un string permettant de (re)définir 
     *      l'affichage d'une instance de cette classe
     * @Return String : L'affichage de cette instance en string 
     *      (Partiellement héritée de Personne)
     */
    public String toString(){
        return super.toString() + "  Engagé le : " + dateEngagement;      
    }
    
    /**
     * Méthode comparant une instance donnée à cette instance. (Héritée de Personne)
     * @Param Object p : une instance d'Object
     */
    public boolean equals(Object p){
        return super.equals(p);
    }
}
