package fr.iutvalence.java.projet2;

/** 
 * Va contenir tous les dossiers relatifs à l'adresse mail DossierAdresse 
 * */
public class DossierAdresse 
{
	/**
	 * Défini le nom (donné par l'utilisateur lors de la création de la boite mail)
	 * du dossier adresse mail
	 */
	private String nom_adresse_mail;
	
	/**
	 * Définit un dossier pour classer des mails contenus dans une boite mail. 
	 * Ces dossiers peuvent être créés par l'utilisateur
	 */
	private DossierMessages[] dossier;
	
	// FIXME méthodes ?
	public DossierAdresse(){
		this.dossier = new DossierMessages[20];
	}
	
}
