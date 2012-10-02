package fr.iutvalence.java.projet2;

/**
 *  Dans le cas ou l'utilisateur configure plusieurs adresses mail différentes sur son client mail, 
 *  il contient tous les dossiers "adresse mail" et va permettre 
 *  de trier les mails de la boite de réception et les placer dans les bons dossiers 
 */
public class ConteneurAdresses 
{

	/**
	 * Définit le nom du conteneur de messages ou de dossiers de messages
	 */
	private String nom_conteneur; // exemple : boite de réception, messages envoyés...

	/**
	 * Définit la liste des adresses mail configurées par l'utilisateur
	 */
	private DossierAdresse[] liste_adresses_mail; 
	
	// FIXME méthodes ?
	public ConteneurAdresses(String nom){
		this.nom_conteneur = nom;
		this.liste_adresses_mail = new DossierAdresse[20];	
	}
}
