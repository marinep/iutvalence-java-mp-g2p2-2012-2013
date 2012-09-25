package fr.iutvalence.java.projet2;
/** un mail */
public class Message {
	public String message_objet;
	public String message_expediteur;
	public String message_corps;
	
	public Message()
	{
		this.message_objet = "";
		this.message_expediteur = "";
		this.message_corps = "";	
	}
	
	/**
	 * Fonction permettant la rédaction d'un nouveau mail
	 * (l'envoi sera géré par la classe EmetteurDeMessages)
	 */
	public void redigerNouveauMessage()
	{
		// A compléter
	}
	
	/**
	 * Fonction permettant la suppression d'un mail de la boite de réception
	 * Consiste à réaliser l'action de déplacer le mail dans la BoiteAuxLettres corbeille.
	 */
	public void supprimerMessage()
	{
		// A compléter 
	}
	
}
