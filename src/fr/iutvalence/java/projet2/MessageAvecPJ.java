package fr.iutvalence.java.projet2;


/**
 * @author pougem
 *
 */
public class MessageAvecPJ extends Message
{

    /**
     * Le chemin de la pièce jointe
     */
    private String Chemin;

    /**
     * @param objet
     * @param expediteur
     * @param destinataire
     * @param corps
     * @param cheminDuFichier
     */
    public MessageAvecPJ(String objet, String expediteur, String destinataire,
            String corps, String cheminDuFichier)
    {
        //Appel du super constructeur (de la classe message)
        super(objet, expediteur, destinataire, corps);
        //Ajout du chemin
        this.Chemin = cheminDuFichier;
    }

    /**
     * @return the Chemin
     */
    public String getChemin()
    {
        return this.Chemin;
    }

    /**
     * @param Chemin the Chemin to set
     */
    public void setChemin(String Chemin)
    {
        this.Chemin = Chemin;
    }
    
}
