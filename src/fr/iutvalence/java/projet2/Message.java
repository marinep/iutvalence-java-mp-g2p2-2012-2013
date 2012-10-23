package fr.iutvalence.java.projet2;

/** 
 * La classe Message est utilisée pour représenter un mail, composé :
 *  d'un objet, 
 *  d'un expéditeur, 
 *  d'un destinataire 
 *  et d'un corps
 * 
 * @author pougem
 *
 */
public class Message {

	/**
	 * Objet du message
	*/
	private final String objet;
	
	/**
	 * Adresse mail de l'expéditeur 
	*/
	private final String expediteur;

	/**
	 * Adresse mail du destinataire du message
	*/ 
	private final String destinataire;
	
	/**
	 * Corps du mail (contenu)
	*/
	private final String corps;	

	/**
	 * Création d'un nouveau message avec l'objet, l'expéditeur, le destinataire
	 * et le corps du message passés en paramètre
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
	 * Obtenir l'objet du message
	 * @return l'objet du message
	 */
	public String getObjet() {
		return this.objet;
	}


	/**
	 * Obtenir l'éxpéditeur du mail
	 * @return l'expéditeur du mail
	 */
	public String getExpediteur() {
		return this.expediteur;
	}

	
	/**
	 * Obtenir le destinataire du mail
	 * @return le destinataire du mail
	 */
	public String getDestinataire() {
		return this.destinataire;
	}


	/**
	 * Obtenir le corps (contenu) du mail
	 * @return le corps (contenu) du mail
	 */
	public String getCorps() {
		return this.corps;
	}

	@Override
	public String toString() {
		return "Message [objet=" + this.objet + ", expediteur=" + this.expediteur
				+ ", destinataire=" + this.destinataire + ", corps=" + this.corps + "]";
	}
	
	//FIXME(FIXED) redéfinir equals et hashCode

	
	/** 
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.corps == null) ? 0 : this.corps.hashCode());
		result = prime * result
				+ ((this.destinataire == null) ? 0 : this.destinataire.hashCode());
		result = prime * result
				+ ((this.expediteur == null) ? 0 : this.expediteur.hashCode());
		result = prime * result + ((this.objet == null) ? 0 : this.objet.hashCode());
		return result;
	}

	/**
	 * Deux objets sont considérés comme égaux s'ils ont le même objet,
	 * le même expéditeur, le même destinataire et le même corps
	 * 
	 * NB : nous sommes pour l'heure obligés de comparer les corps des
	 * messages pour l'égalité; sinon, il faudrait introduire une notion
	 * de date / heure d'envoi du message
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Message other = (Message) obj;
		if (this.corps == null) {
			if (other.corps != null)
				return false;
		} else if (!this.corps.equals(other.corps))
			return false;
		if (this.destinataire == null) {
			if (other.destinataire != null)
				return false;
		} else if (!this.destinataire.equals(other.destinataire))
			return false;
		if (this.expediteur == null) {
			if (other.expediteur != null)
				return false;
		} else if (!this.expediteur.equals(other.expediteur))
			return false;
		if (this.objet == null) {
			if (other.objet != null)
				return false;
		} else if (!this.objet.equals(other.objet))
			return false;
		return true;
	}
	
	

	

	
}
