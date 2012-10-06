package fr.iutvalence.java.projet2;

/** 
 * dossier contenant la liste des objets des messages présents dans le dossier
 * */
public class DossierMessages {
	

	/**
	 * Nom du dossier contenant des messages
	 */
	// FIXME respecter les conventions d'écriture
	private String nom_dossier;

	/**
	 * Affichage de la liste des mails présents dans le dossier
	 */
	// FIXME respecter les conventions d'écriture
	private Message[] liste_messages;
	
	// FIXME il manque un attribut pour savoir combien il y a d'éléments dans le tableau
	
	// FIXME méthodes ?
	public DossierMessages()
	{
		// FIXME définir la capacité par défaut du tableau sous forme de constante
		this.liste_messages = new Message[100];
		
		// FIXME tous les attributs doivent être initialisés
	}
	
}
