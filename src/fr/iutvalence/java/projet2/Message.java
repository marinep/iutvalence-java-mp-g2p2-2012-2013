package fr.iutvalence.java.projet2;

// FIXME clarifier le commentaire
/** un mail */
public class Message {
	
	// FIXME écrire un commentaire 
	// FIXME réfléchir à la visibilité des attributs
	public String objet;
	
	// FIXME écrire un commentaire 
	// FIXME réfléchir à la visibilité des attributs
	public String expediteur;

	// FIXME écrire un commentaire 
	// FIXME réfléchir à la visibilité des attributs
	public String destinataire;
	
	// FIXME écrire un commentaire 
	// FIXME réfléchir à la visibilité des attributs
	public String corps;
	
	// FIXME écrire un commentaire 
	public Message()
	{
		this.objet = "";
		this.expediteur = "";
		this.destinataire = "";
		this.corps = "";	
	}
	

	// FIXME clarifier le commentaire
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


	// FIXME écrire un commentaire
	public String getObjet() {
		return objet;
	}


	// FIXME écrire un commentaire
	public void setObjet(String objet) {
		this.objet = objet;
	}


	// FIXME écrire un commentaire
	public String getExpediteur() {
		return expediteur;
	}


	// FIXME écrire un commentaire
	public void setExpediteur(String expediteur) {
		this.expediteur = expediteur;
	}


	// FIXME écrire un commentaire
	public String getDestinataire() {
		return destinataire;
	}


	// FIXME écrire un commentaire
	public void setDestinataire(String destinataire) {
		this.destinataire = destinataire;
	}


	// FIXME écrire un commentaire
	public String getCorps() {
		return corps;
	}


	// FIXME écrire un commentaire
	public void setCorps(String corps) {
		this.corps = corps;
	}



	@Override
	public String toString() {
		return "Message [objet=" + objet + ", expediteur=" + expediteur
				+ ", destinataire=" + destinataire + ", corps=" + corps + "]";
	}
	
}
