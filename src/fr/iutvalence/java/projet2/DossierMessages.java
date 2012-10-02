package fr.iutvalence.java.projet2;

/** 
 * dossier contenant la liste des objets des messages présents dans le dossier
 * */
public class DossierMessages {
	

	/**
	 * Nom du dossier contenant des messages
	 */
	private String nom_dossier;

	/**
	 * Affichage de la liste des mails présents dans le dossier
	 */
	private Message[] liste_messages;
	
	// FIXME constructeurs, méthodes ?
	public DossierMessages()
	{
		this.liste_messages = new Message[100];
	}
	
}
