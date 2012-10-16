package fr.iutvalence.java.projet2;

import fr.iutvalence.java.projet2.unused.DossierAdresse;

/**
 *  Un compte mail contient tous les dossiers liés à une "adresse mail"
 */
public class CompteMail 
{
	/**
	 * Définit le nom du conteneur de messages ou de dossiers de messages
	 */
	private String nomCompte; // exemple : boite de réception, messages envoyés...

	
	// FIXME détailler le commentaire, de quelles adresses mails s'agit-il ? (c'est flou)
	/**
	 * Définit la liste des adresses mail configurées par l'utilisateur
	 */
	private DossierAdresse[] listeAdressesMail;
	
	
	// FIXME déplacer la définition de la constante avant celles des attributs
	/**
	 * nombre maximal d'adresses dans le conteneur
	 */
	private static final int NB_MAX_ADRESSES = 20;
	
	// FIXME (WRONGLY FIXED !) il manque un attribut pour savoir combien il y a d'éléments dans le tableau (une constante ne suffit pas)

	
	// FIXME écrire un commentaire
	public CompteMail(String nom){
		this.nomCompte = nom;
		this.listeAdressesMail = new DossierAdresse[NB_MAX_ADRESSES];		
	}
	
	// FIXME méthodes ?
}
