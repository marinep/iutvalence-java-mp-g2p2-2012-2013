package fr.iutvalence.java.projet2.unused;

import fr.iutvalence.java.projet2.Message;

/** 
 * Cette classe contient dossier la liste des objets des messages présents dans le dossier
 * */
public class DossierMessages {
	

	/**
	 * Nom du dossier contenant des messages
	 */
	// FIXME(FIXED) respecter les conventions d'écriture
	private String nomDossier;

	/**
	 * Affichage de la liste des mails présents dans le dossier
	 */
	// FIXME (FIXED) respecter les conventions d'écriture
	private Message[] listeMessages;
	
	// FIXME (FIXED)il manque un attribut pour savoir combien il y a d'éléments dans le tableau
	/**
	 * correspond aux nombre d'éléments (c'est-à-dire le nombre de mails)
	 * présents dans le dossier
	 */
	private int nbMessages;
	
	// FIXME méthodes ?
	public DossierMessages()
	{
		// FIXME définir la capacité par défaut du tableau sous forme de constante
		this.listeMessages = new Message[100];
		
		// FIXME tous les attributs doivent être initialisés
	}
	
}
