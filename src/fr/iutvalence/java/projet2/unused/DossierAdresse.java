package fr.iutvalence.java.projet2.unused;



// FIXME corriger le commentaire (écrire une phrase)
/** 
 * Va contenir tous les dossiers relatifs à l'adresse mail DossierAdresse 
 * */
public class DossierAdresse 
{
	/**
	 * Définit le nom (donné par l'utilisateur lors de la création de la boite mail)
	 * du dossier adresse mail
	 */
	// FIXME respecter les conventions d'écriture
	private String nom_adresse_mail;
	
	/**
	 * Définit un dossier pour classer des mails contenus dans une boite mail. 
	 * Ces dossiers peuvent être créés par l'utilisateur
	 */
	private DossierMessages[] dossier;
	
	// FIXME il manque un attribut pour savoir combien il y a d'éléments dans le tableau
	
	public DossierAdresse(){
		
		// FIXME définir la capacité par défaut du tableau sous forme de constante
		this.dossier = new DossierMessages[20];
		
		// FIXME tous les attributs doivent être initialisés
	
	}
	
	// FIXME méthodes ?
	
}
