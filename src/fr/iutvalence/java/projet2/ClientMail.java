package fr.iutvalence.java.projet2;

/**
 * Cette classe représente la classe générale de l'application. Elle permet de
 * gérer sa boite mail (réception, envoi, affichage...)
 * */
public class ClientMail {
	/**
	 * Correspond à tous les comptes mail configurés par l'utilisateur
	 */
	private CompteMail[] comptesMail;

	/**
	 * attribut pour savoir combien il y a de comptes mail (nombre d'éléments
	 * dans le tableau)
	 */
	private int nbComptesMail;

	// FIXME constructeur

	// FIXME méthodes ajout/suppression de comptes ?

	/**
	 * @return
	 */

	public String[] getNomComptes() {
		String[] res = new String[this.nbComptesMail];

		for (int i = 0; i < this.nbComptesMail; i++) {
			res = res + getNomCompte[i].nomCompte;
		}
		return res;
	}

}
