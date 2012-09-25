package fr.iutvalence.java.projet2;
/** un mail */
public class Message {
	public String objet;
	public String expediteur;
	public String destinataire;
	public String corps;
	
	public Message()
	{
		this.objet = "";
		this.expediteur = "";
		this.destinataire = "";
		this.corps = "";	
	}
	


	/**
	 * @param objet
	 * @param expediteur
	 * @param destinataire
	 * @param corps
	 */
	public Message(String objet, String expediteur, String destinataire,
			String corps) {
		super();
		this.objet = objet;
		this.expediteur = expediteur;
		this.destinataire = destinataire;
		this.corps = corps;
	}



	public String getObjet() {
		return objet;
	}



	public void setObjet(String objet) {
		this.objet = objet;
	}



	public String getExpediteur() {
		return expediteur;
	}



	public void setExpediteur(String expediteur) {
		this.expediteur = expediteur;
	}



	public String getDestinataire() {
		return destinataire;
	}



	public void setDestinataire(String destinataire) {
		this.destinataire = destinataire;
	}



	public String getCorps() {
		return corps;
	}



	public void setCorps(String corps) {
		this.corps = corps;
	}



	@Override
	public String toString() {
		return "Message [objet=" + objet + ", expediteur=" + expediteur
				+ ", destinataire=" + destinataire + ", corps=" + corps + "]";
	}



	
	
	

	
}
