package fr.iutvalence.java.projet2;


/**
 *  Cette classe représente un compte mail : elle est utilisée pour
 *  gérer tous les dossiers liés à une "adresse mail"
 */
public class CompteMail 
{
	/**
	 * Définit le nom symbolique du compte mail
	 */
	private String nomCompte;
	
	/**
	 * Correspond à l'adresse mail de l'utilisateur
	 */
	private String adresseCompte; 
	
	/**
	 * Correspond à l'emetteur de messages associé au compte mail
	 * Émission des messages contenant objet, expéditeur, etc... via un serveur distant
	 */
	private EmetteurDeMessages emetteurCompte;
	
	/**
	 * Correspond au récepteur de messages associé au compte mail
	 * Réception des messages arrivant directement dans le dossier boite de réception. 
	 * La réception se fait par un serveur distant
	 */
	private RecepteurDeMessages recepteurCompte;
	
	/**
	 * Ensemble des dossiers de messages pour ce compte mail
	 */
	private Dossier[] dossiers;
	
	/**
	 * entier permettant de determiner le nombre 
	 * de dossiers pour ce compte mail
	 */
	private int nbDossiers;
	
	/**
	 * nombre maximum de dossiers pouvant être créés pour un compte mail
	 */
	public static final int CAPA_MAX_DOSSIERS = 30;
	
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
		
		// ..
	}
	// FIXME compléter le commentaire
	/**
	 * 
	 * @param nom
	 */
	
	//public static final EmetteurDeMessages EmmeteurCompte= "e";
	//public static final EmetteurDeMessages RecepteurCompte = "r";
	
	
	
	/**
	 * Permet de supprimer un dossier de messages
	 * @param d Le dossier à supprimer
	 * @throws NomDossierInvalideException Exception renvoyée si le nom du dossier n'existe pas
	 */
	public void supprimerDossier(Dossier d) throws NomDossierInvalideException{
		
		int compteur = 0;
		
		
		
		while ((compteur < this.nbDossiers) && (d.getNom().equals(this.dossiers[compteur].getNom())))
		{
			compteur++;
		}
		
		
		
	}


}
