package objetsmetier;
/**
 * Classe modelisant une personne dans un Hôpital.
 * Ne devrait pas être instanciée.
 * 
 * Ne pas modifier !
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Personne
{
    private String nom;
    private String prenom;

    /**
     * Constructeur d'objets de classe Personne
     */
    public Personne(String nom, String prenom)
    {
        this.nom = nom;
        this.prenom = prenom;
    }
    
    /**
     * Méthode retournant un string permettant de (re)définir 
     *      l'affichage d'une instance de cette classe
     * @Return String : L'affichage de cette instance en string 
     */
    public String toString(){
        return nom + " " + prenom;
    }
    
        /**
     * Méthode comparant une instance donnée à cette instance. Dans ce cas,
     *      la comparaison est faite avec le nom et le prénom.
     * @Param Object p : une instance d'Object
     */
    public boolean equals(Object p){
        if(this.nom.equals(((Personne)p).nom) && 
            (this.prenom.equals(((Personne)p).prenom))){
            return true;
        }
        return false;
    }
}
