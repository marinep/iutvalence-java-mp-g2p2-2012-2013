package fr.iutvalence.java.projet2;

/**
 * La classe Dossier est utilisée pour représenter un ensemble de messages, 
 * regroupés de manière délibérée par l'utilisateur, ou regroupés dans certains cas
 * par l'application elle-même (c'est notamment le cas pour les dossiers messages 
 * envoyés)
 * @author pougem
 *
 */
public class Dossier {	
	
	/**
	 * Nom du Dossier de messages
	 */
	private String nom;
	
	
	
	/**
	 * getter pour utiliser le nom du dossier en dehors de la classe
	 * @return le nom du dossier
	 */
	public String getNom() {
		return this.nom;
	}

	/**
	 * setter pour utiliser le nom du dossier en dehors de la classe
	 * @param nom le nom du dossier
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Les messages présents dans le Dossier
	 */
	private Message[] msgs;
	
	/**
	 * Capacité maximum du dossier de messages
	 */
	public final static int CAPA_MAX = 200;
	
	/**
	 * Nombre d'éléments du tableau de messages correspondant au nombre de messages
	 */
	private int nbMessages;
	
	// FIXME(FIXED) compléter le commentaire
	/**
	 * Constructeur pour la création d'un nouveau Dossier vide, 
	 * avec en paramètre son nom
	 * @param nom Nom du dossier contenant les messages
	 */
	public Dossier(String nom) {
		
		this.nom = nom;
		this.msgs = new Message[0]; 
		
	}
	
	// FIXME(FIXED) compléter le commentaire
	/**
	 * Fonction permettant d'ajouter un message dans le dossier.
	 * @param m message à ajouter dans le dossier
	 * @throws DossierPleinException 
	 */
	public void ajouterMessage(Message m) throws DossierPleinException{
		
		if(this.nbMessages > CAPA_MAX){
			throw new DossierPleinException();
		}
			
		this.nbMessages++;
		this.msgs[this.nbMessages] = m;
		
	}
	
	// FIXME(FIXED) compléter le commentaire
	/**
	 * Fonction permettant de supprimer un message dans le dossier.
	 * @param m message à supprimer du dossier
	 */
	public void supprimerMessage(Message m){		
			
		// FIXME(FIXED) à compléter 
		// FIXME(FIXED) pour que cela marche, il faudrait redéfinir equals dans Message
		int i = 0;
		int j;
		while(i < this.nbMessages && m.equals(this.msgs[i]))
		{
			i++;
		}
		for(j = i;j < this.nbMessages;j++)
		{
			this.msgs[j] = this.msgs[j+1];
		}
		
		this.nbMessages--;
		
		
		
	}
	
	
}