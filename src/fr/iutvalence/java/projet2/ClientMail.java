package fr.iutvalence.java.projet2;

/** 
 * Classe générale permettant de gérer sa boite mail (réception, envoi, affichage...)
 * */
public class ClientMail {
	
	/**
	 * Différentes boites aux lettres 
	 */
	private BoiteAuxLettres[] boitesAuxLettres;
	
	// FIXME (FIXED) il manque un attribut pour savoir combien il y a d'éléments dans le tableau
	
	/**
	 * correspond aux nombre d'éléments (c'est-à-dire le nombre de mails)
	 * présents dans la boîte aux lettres
	 */
	private int nbElements;
	/**
	 * Émission des messages contenant objet, expéditeur, etc... via un serveur distant
	 */
	private EmetteurDeMessages emetteurDeMessages ;

	/**
	 * Réception des messages arrivant directement dans le dossier boite de réception. 
	 * La réception se fait par un serveur distant
	 */
	private RecepteurDeMessages recepteurDeMessages ;

	// FIXME constructeurs, méthodes ?
}
