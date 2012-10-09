package fr.iutvalence.java.projet2;

// FIXME (FIXED) corriger le commentaire (faire une phrase)
/** la classe Message est utilisée pour représenter
 * un mail, composé d'un objet, d'un expéditeur, d'un destinataire et d'un corps */
/**
 * @author pougem
 *
 */
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
	 * Destinataire du message (utilisateur "courant") 
	*/ 
	private final String destinataire;
	
	/**
	 * Corps du mail défini par l'expéditeur du mail contenant tout le texte
	*/
	private final String corps;	

	/**
	 * Définition du constructeur message (mail) envoyé par un expéditeur
	 * @param objet l'objet du mail
	 * @param expediteur l'expéditeur du mail
	 * @param destinataire l'adrese mail de destination 
	 * @param corps Le corps du mail (contenu)
	 */
	public Message(String objet, String expediteur, String destinataire,
			String corps) {

		this.objet = objet;
		this.expediteur = expediteur;
		this.destinataire = destinataire;
		this.corps = corps;
	}



	/**
	 * Obtenir l'objet du mail
	 * @return l'objet du mail
	 */
	public String getObjet() {
		return objet;
	}


	/**
	 * Obtenir l'éxpéditeur du mail
	 * @return l'expéditeur du mail
	 */
	public String getExpediteur() {
		return expediteur;
	}

	
	/**
	 * Obtenir le destinataire du mail
	 * @return le destinataire du mail
	 */
	public String getDestinataire() {
		return destinataire;
	}


	/**
	 * Obtenir le corps (contenu) du mail
	 * @return le corps (contenu) du mail
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
