package fr.iutvalence.java.projet2;

/** 
 * Classe générale permettant de gérer sa boite mail (réception, envoi, affichage...)
 * */
public class ClientMail {
	
	/**
	 * Différentes boites aux lettres 
	 */
	private BoiteAuxLettres[] boitesAuxLettres;
	
	// FIXME il manque un attribut pour savoir combien il y a d'éléments dans le tableau
	
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
