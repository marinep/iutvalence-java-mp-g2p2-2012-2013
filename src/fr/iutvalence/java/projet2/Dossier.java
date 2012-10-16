package fr.iutvalence.java.projet2;

/**
 * La classe Dossier est utilisée pour représenter un ensemble de message, 
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
	
	/**
	 * Création d'un nouveau Dossier vide, avec en paramètre son nom
	 * @param nom
	 */
	public Dossier(String nom) {
		
		this.nom = nom;
		this.msgs = new Message[0]; 
		
	}
	
	/**
	 * Fonction permettant d'ajouter un message dans le dossier.
	 * @param m
	 */
	public void ajouterMessage(Message m) throws DossierPleinException{
		
		if(nbMessages > CAPA_MAX){
			throw new DossierPleinException();
		}
			
		nbMessages++;
		msgs[nbMessages] = m;
		
	}
	
	
	/**
	 * Fonction permettant de supprimer un message dans le dossier.
	 * @param m
	 */
	public void supprimerMessage(Message m){		
			
		nbMessages--;
		
	}
	
	
}