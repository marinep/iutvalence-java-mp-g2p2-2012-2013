// FIXME trouver un nom plus évocateur pour le package (fr.iutvalence.java.projets.clientmail) ?
package fr.iutvalence.java.projet2.unused;

import fr.iutvalence.java.projet2.Message;

// FIXME corriger le commentaire (faire des phrases)
/** 
 * Cette classe contient les dossiers principaux du client mail : 
 * mails reçus, envoyés et supprimés (boite de réception, messages envoyés, corbeille) 
 * Cette classe permettra de naviguer entre les différents comptes pour afficher ensuite 
 * tous les mails ou un mail particulier. 
 * */
public class BoiteAuxLettres {
	
	/**
	 * désigne le dossier par défaut, qui contient tous les mails recus
	*/
	private ConteneurAdresses boiteReception;
	

	/**
	 * désigne le dossier qui contient tous les mails envoyés
	*/
	private Message[] eltsEnvoyes;
	
	// FIXME il manque un attribut pour savoir combien il y a d'éléments dans le tableau
	
	/**
	 * contient tous les mails supprimés par l'utilisateur
	 */
	private Message[] corbeille;

	// FIXME il manque un attribut pour savoir combien il y a d'éléments dans le tableau
	
	// FIXME constructeurs, méthodes ?
	
	public BoiteAuxLettres()
	{
		// FIXME définir la capacité par défaut du tableau sous forme d'une constante
		this.eltsEnvoyes = new Message[100];
		this.corbeille = new Message[100];
		
		// FIXME tous les attributs doivent être initialisés
	}
	
	// FIXME méthodes ?
}
