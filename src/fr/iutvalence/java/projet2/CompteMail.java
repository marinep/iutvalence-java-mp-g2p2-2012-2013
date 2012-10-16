package fr.iutvalence.java.projet2;

import fr.iutvalence.java.projet2.unused.DossierAdresse;

/**
 *  Un compte mail contient tous les dossiers liés à une "adresse mail"
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
	
	
	
	// FIXME (FIXED) Constructeur de la classe CompteMail
	/**
	 * 
	 * @param nom
	 */
	public CompteMail(String nom)
	{
		this.nomCompte = nom;
		this.adresseCompte = 
		this.emetteurCompte =
		this.recepteurCompte = 
	}
	
	/**
	 * Permet de supprimer un dossier de messaegs
	 * @param d
	 * @throws NomDossierInvalideException
	 */
	public void supprimerDossier(Dossier d) throws NomDossierInvalideException{
		
		int compteur = 0;
		while ((compteur < nbDossiers) && (Dossier[compteur].nom != d.nom)) 
		{
			compteur++;
		}
		
		
		
	}
}
