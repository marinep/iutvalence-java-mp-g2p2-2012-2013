package fr.iutvalence.java.projet2;

import java.util.List;

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
	 * @param m le message à ajouter
	 * @throws DossierPleinException
	 * permet l'ajout d'un message dans un dossier
	 */
	public void ajouterMessage(Message m) throws DossierPleinException;
	
	/**
	 * @param m le message à supprimer
	 * @return les messages contenant 
	 * @throws DossierVideException
	 * permet de supprimer un message d'un dossier
	 */
	public boolean supprimerMessage(Message m) throws DossierVideException;
	
	/**
	 * @param keyword mot-clé pour rechercher un message selon son objet
	 * @return
	 * Permet de rechercher un message
	 */
	public List<Message> rechercherMessageObjet(String keyword);
    /**
     * @param keyword mot-clé pour rechercher un message selon son expéditeur
     * @return Permet de rechercher un message
     */
    public List<Message> rechercherMessageExp(String keyword);
    /**
     * @param keyword mot-clé pour rechercher un message selon son destinataire
     * @return Permet de rechercher un message
     */
    public List<Message> rechercherMessageDest(String keyword);
    /**
     * @param keyword mot-clé pour rechercher un message selon son corps
     * @return Permet de rechercher un message
     */
    public List<Message> rechercherMessageCorps(String keyword);
    	
	
}
