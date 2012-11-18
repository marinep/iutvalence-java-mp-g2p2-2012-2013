package fr.iutvalence.java.projet2;

/**
 * Cette classe représente un compte mail : elle est utilisée pour gérer tous
 * les dossiers liés à une "adresse mail"
 */
public class CompteMail {
	/**
	 * nombre maximum de dossiers pouvant être créés pour un compte mail
	 */
	public static final int CAPA_MAX_DOSSIERS = 30;

	/**
	 * Définit le nom symbolique du compte mail
	 */
	private String nomCompte;

	/**
	 * Correspond à l'adresse mail de l'utilisateur
	 */
	private String adresseCompte;

	/**
	 * Correspond à l'emetteur de messages associé au compte mail Émission des
	 * messages contenant objet, expéditeur, etc... via un serveur distant
	 */
	private EmetteurDeMessages emetteurCompte;

	/**
	 * Correspond au récepteur de messages associé au compte mail Réception des
	 * messages arrivant directement dans le dossier boite de réception. La
	 * réception se fait par un serveur distant
	 */
	private RecepteurDeMessages recepteurCompte;

	/**
	 * Ensemble des dossiers de messages pour ce compte mail
	 */
	private Dossier[] dossiers;

	/**
	 * entier permettant de determiner le nombre de dossiers pour ce compte mail
	 */
	private int nbDossiers;

	// FIXME compléter le commentaire (manque la ligne de résumé)
	/**
	 * @param nomCompte
	 * @param adresseCompte
	 * @param emetteurCompte
	 * @param recepteurCompte
	 */
	public CompteMail(String nomCompte, String adresseCompte,
			EmetteurDeMessages emetteurCompte,
			RecepteurDeMessages recepteurCompte) {
		super();
		this.nomCompte = nomCompte;
		this.adresseCompte = adresseCompte;
		this.emetteurCompte = emetteurCompte;
		this.recepteurCompte = recepteurCompte;
	}

	/**
	 * Obtenir le nom du compte
	 * 
	 * @return le nom du compte
	 */
	public String getNomCompte() {
		return this.nomCompte;
	}

	/**
	 * Obtenir l'adresse du compte
	 * 
	 * @return l'adresse du compte
	 */
	public String getAdresseCompte() {
		return this.adresseCompte;
	}

	// FIXME compléter le commentaire (manque la ligne de résumé)
	/**
	 * @return l'emetteur du compte mail
	 */
	public EmetteurDeMessages getEmetteurCompte() {
		return this.emetteurCompte;
	}

	// FIXME compléter le commentaire (manque la ligne de résumé)
	/**
	 * @return le récepteur du compte mail
	 */
	public RecepteurDeMessages getRecepteurCompte() {
		return this.recepteurCompte;
	}

	// FIXME compléter le commentaire (manque la ligne de résumé)
	/**
	 * @param nomCompte
	 */
	public void setNomCompte(String nomCompte) {
		this.nomCompte = nomCompte;
	}

	// FIXME compléter le commentaire (manque la ligne de résumé)
	/**
	 * @param adresseCompte
	 */
	public void setAdresseCompte(String adresseCompte) {
		this.adresseCompte = adresseCompte;
	}

	// FIXME compléter le commentaire (manque la ligne de résumé)
	/**
	 * @param emetteurCompte
	 */
	public void setEmetteurCompte(EmetteurDeMessages emetteurCompte) {
		this.emetteurCompte = emetteurCompte;
	}

	// FIXME compléter le commentaire (manque la ligne de résumé)
	/**
	 * @param recepteurCompte
	 */
	public void setRecepteurCompte(RecepteurDeMessages recepteurCompte) {
		this.recepteurCompte = recepteurCompte;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CompteMail [nomCompte=" + this.nomCompte + ", adresseCompte="
				+ this.adresseCompte + ", emetteurCompte="
				+ this.emetteurCompte + ", recepteurCompte="
				+ this.recepteurCompte + "]";
	}

	// FIXME compléter le commentaire

	// public static final EmetteurDeMessages EmmeteurCompte= "e";
	// public static final EmetteurDeMessages RecepteurCompte = "r";

	/*	*//**
	 * Permet de déplacer un dossier existant dans le compte mail
	 * 
	 * @param d
	 * @param nom
	 *            Nom du dossier à déplacer
	 * @throws NomDossierInvalideException
	 *             Si le nom du dossier n'existe pas
	 * @throws CapaMaxException
	 *             Si le compte mail a atteint sa capacité maximum de dossiers
	 */
	/*
	 * public void ajouterDossier(Dossier d) throws NomDossierInvalideException,
	 * CapaMaxException {
	 * 
	 * 
	 * if(this.nbDossiers == CAPA_MAX_DOSSIERS) { throw new CapaMaxException();
	 * } this.dossiers[this.nbDossiers] = d; this.nbDossiers++;
	 * 
	 * System.out.println("Dossier ajouté au compte mail : "+d);
	 * 
	 * 
	 * }
	 *//**
	 * Permet de supprimer un dossier de messages
	 * 
	 * @param d
	 *            Le dossier à supprimer
	 * @return
	 * @throws CompteMailInvalideException
	 * @throws NomDossierInvalideException
	 *             Exception renvoyée si le nom du dossier n'existe pas
	 */
	/*
	 * public boolean supprimerDossier(Dossier d) throws
	 * NomDossierInvalideException, CompteMailInvalideException{
	 * 
	 * boolean trouve = false; if(this.nbDossiers == 0) { throw new
	 * CompteMailInvalideException(); } else { for (int i=0; i<this.nbDossiers;
	 * i++) { if ((!trouve) && (d.equals(this.dossiers[i]))) trouve = true; if
	 * ((trouve)&&(i<this.nbDossiers)) this.dossiers[i] = this.dossiers[i+1]; }
	 * if (trouve) this.nbDossiers--; } return trouve; }
	 */
}
