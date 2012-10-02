package fr.iutvalence.java.projet2;

/** 
 * contient des supers dossiers où seront listés tous les mails
 * reçus, envoyés et supprimés (boite de réception, messages envoyés, corbeille...) 
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
	
	/**
	 * contient tous les mails supprimés par l'utilisateur
	 */
	private Message[] corbeille;
	
	// FIXME constructeurs, méthodes ?
	
	public BoiteAuxLettres()
	{
		this.eltsEnvoyes = new Message[100];
		this.corbeille = new Message[100];
	}
}
