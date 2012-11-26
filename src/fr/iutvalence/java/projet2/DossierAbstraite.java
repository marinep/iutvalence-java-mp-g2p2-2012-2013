package fr.iutvalence.java.projet2;

import java.util.List;

/**
 * @author pougem
 * 
 */
public abstract class DossierAbstraite implements DossierManager {

	/**
	 * Nom du Dossier de messages
	 */
	private String nom;

	
	/**
	 * Permet de "factoriser" nom de dossiertableau et dossiercollection
	 * @param nom
	 */
	public DossierAbstraite(String nom){
		this.nom = nom;
	}
	/**
	 * @return le nom du dossier
	 */
	public String getNom() {
		return this.nom;
	}

	/**
	 * @param m le message à ajouter
	 * @throws DossierPleinException permet l'ajout d'un message dans un dossier
	 */
	public abstract void ajouterMessage(Message m) throws DossierPleinException;

	/**
	 * @param m le message à supprimer
	 * @return les messages contenant
	 * @throws DossierVideException permet de supprimer un message d'un dossier
	 */
	public abstract boolean supprimerMessage(Message m)
			throws DossierVideException;

	/**
	 * @param keyword mot-clé pour rechercher un message selon son objet
	 * @return Permet de rechercher un message
	 */
	public abstract List<Message> rechercherMessageObjet(String keyword);

	/**
	 * @param keyword mot-clé pour rechercher un message selon son expéditeur
	 * @return Permet de rechercher un message
	 */
	public abstract List<Message> rechercherMessageExp(String keyword);

	/**
	 * @param keyword mot-clé pour rechercher un message selon son destinataire
	 * @return Permet de rechercher un message
	 */
	public abstract List<Message> rechercherMessageDest(String keyword);

	/**
	 * @param keyword mot-clé pour rechercher un message selon son corps
	 * @return Permet de rechercher un message
	 */
	public abstract List<Message> rechercherMessageCorps(String keyword);
}
