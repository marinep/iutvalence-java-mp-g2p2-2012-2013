package fr.iutvalence.java.projet2;

/**
 * @author pougem
 * Interface pour récupérer les informations "essentielles" d'un dossier de messages
 */
public interface DossierManager {
	
	/**
	 * Permet de récupérer le nom d'un dossier
	 * @return nom du dossier
	 */
	public String getNom();
	
	/**
	 * @param m
	 * @throws DossierPleinException
	 * permet l'ajout d'un message dans un dossier
	 */
	public void ajouterMessage(Message m) throws DossierPleinException;
	
	/**
	 * @param m
	 * @return
	 * @throws DossierVideException
	 * permet de supprimer un message d'un dossier
	 */
	public boolean supprimerMessage(Message m) throws DossierVideException;
	
	/**
	 * @return
	 * Permet de rechercher un message
	 */
	public Message[] rechercherMessage();
	//fonctions de recherches à ajouter...
	
	
	
}
