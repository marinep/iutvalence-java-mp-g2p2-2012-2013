package fr.iutvalence.java.projet2;

import fr.iutvalence.java.projet2.unused.DossierAdresse;

/**
 *  Dans le cas ou l'utilisateur configure plusieurs adresses mail 
 *  différentes sur son client mail, il contient tous les dossiers 
 *  "adresse mail" et va permettre de trier les mails de la boite de 
 *  réception et les placer dans le bon dossier (i.e. l'adresse mail 
 *  correspondante)
 */
public class CompteMail 
{
	/**
	 * Définit le nom du conteneur de messages ou de dossiers de messages
	 */
	// FIXME (FIXED)respecter les conventions d'écriture
	private String nomCompte; // exemple : boite de réception, messages envoyés...

	/**
	 * Définit la liste des adresses mail configurées par l'utilisateur
	 */
	// FIXME (FIXED) respecter les conventions d'écriture
	private DossierAdresse[] listeAdressesMail;
	
	/**
	 * nombre maximal d'adresses dans le conteneur
	 */
	private static final int NB_MAX_ADRESSES = 20;
	
	// FIXME (FIXED) il manque un attribut pour savoir combien il y a d'éléments dans le tableau

	public CompteMail(String nom){
		this.nomCompte = nom;
		// FIXME (FIXED) définir la capacité par défaut du tableau sous forme de constante
		this.listeAdressesMail = new DossierAdresse[NB_MAX_ADRESSES];		
	}
	
	// FIXME méthodes ?
}
