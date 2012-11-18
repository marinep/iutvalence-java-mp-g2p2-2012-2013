package fr.iutvalence.java.projet2;

/**
 * Réception des messages : Connexion au serveur + récupération des messages (et
 * déplacement des messages dans les bonnes boites/dossiers)
 */
public class RecepteurDeMessages {

	/**
	 * Référence pour identifier le récepteur
	 */
	private String ref;

	public RecepteurDeMessages(String s) {
		this.ref = s;

	}

	/**
	 * getter pour utiliser la référence en dehors de la classe
	 * 
	 * @return la référence du récepteur
	 */
	public String getRef() {
		return this.ref;
	}

	/**
	 * setter pour utiliser la référence en dehors de la classe
	 * 
	 * @param ref
	 *            la référence du récepteur
	 */
	public void setRef(String ref) {
		this.ref = ref;
	}

	@Override
	public String toString() {
		return "RecepteurDeMessages [ref=" + ref + "]";
	}

	/**
	 * un message constant permettant de tester une réception de message
	 * contenant expéditeur, destinataire, objet et corps
	 */
	private final static Message MESSAGE_NAIF = new Message("moi", "toi",
			"test", "ceci est un test de réception");

	/**
	 * Permet de tester la réception d'un message
	 * 
	 * @return un message naif
	 */
	public Message recevoirMessage() {
		return MESSAGE_NAIF;
	}

	/*
	 * 
	 */
}
