package fr.iutvalence.java.projet2;

/** un mail composé d'un objet, d'un expéditeur, d'un destinataire et d'un corps */
public class Message {
	
	/**
	 * Objet d'un message spécifié par l'expéditeur du mail
	*/
	private final String objet;
	
	/**
	 * adresse mail de l'expéditeur définie lors de l'envoi du mail par l'expéditeur
	*/
	private final String expediteur;

	/**
	 * Destinataire du message (utilisateur "courant" 
	*/ 
	private final String destinataire;
	
	/**
	 * Corps du mail défini par l'expéditeur du mail contenant tout le texte
	*/
	private final String corps;	

	/**
	 * Définition du constructeur message (mail) envoyé par un expéditeur
	 * @param objet
	 * @param expediteur
	 * @param destinataire
	 * @param corps
	 */
	public Message(String objet, String expediteur, String destinataire,
			String corps) {

		this.objet = objet;
		this.expediteur = expediteur;
		this.destinataire = destinataire;
		this.corps = corps;
	}


	/**
	 * Accesseur en lecture de l'objet d'un mail
	 */
	public String getObjet() {
		return objet;
	}

	/**
	 * Accesseur en lecture de l'expéditeur d'un mail
	 */
	public String getExpediteur() {
		return expediteur;
	}

	/**
	 * Accesseur en lecture du destinataire d'un mail
	 */
	public String getDestinataire() {
		return destinataire;
	}

	/**
	 * Accesseur en lecture du corps d'un mail
	 */
	public String getCorps() {
		return corps;
	}

	@Override
	public String toString() {
		return "Message [objet=" + objet + ", expediteur=" + expediteur
				+ ", destinataire=" + destinataire + ", corps=" + corps + "]";
	}
	
}
