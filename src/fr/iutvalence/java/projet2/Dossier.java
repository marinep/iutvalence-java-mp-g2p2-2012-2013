package fr.iutvalence.java.projet2;

import java.util.Arrays;

/**
 * La classe Dossier est utilisée pour représenter un ensemble de messages,
 * regroupés de manière délibérée par l'utilisateur, ou regroupés dans certains
 * cas par l'application elle-même (c'est notamment le cas pour les dossiers
 * messages envoyés)
 * 
 * @author pougem
 * 
 */
public class Dossier {

	/**
	 * Nom du Dossier de messages
	 */
	private String nom;

	/**
	 * getter pour utiliser le nom du dossier en dehors de la classe
	 * 
	 * @return le nom du dossier
	 */
	public String getNom() {
		return this.nom;
	}

	/**
	 * setter pour utiliser le nom du dossier en dehors de la classe
	 * 
	 * @param nom
	 *            le nom du dossier
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Les messages présents dans le Dossier
	 */
	private Message[] msgs;

	/**
	 * Capacité maximum du dossier de messages
	 */
	public final static int CAPA_MAX = 5;

	/**
	 * Nombre d'éléments du tableau de messages correspondant au nombre de
	 * messages
	 */
	private int nbMessages;

	@Override
	public String toString() {
		return "Le dossier " + this.nom + " contient ces messages : \n"
				+ Arrays.toString(this.msgs) + "\nIl contient "
				+ this.nbMessages + " messages.";
	}

	/**
	 * Constructeur pour la création d'un nouveau Dossier vide, avec en
	 * paramètre son nom
	 * 
	 * @param nom
	 *            Nom du dossier contenant les messages
	 */

	// TODO vérifier
	public Dossier(String nom) {

		this.nom = nom;
		this.msgs = new Message[CAPA_MAX];

	}

	/**
	 * Fonction permettant d'ajouter un message dans le dossier.
	 * 
	 * @param m
	 *            message à ajouter dans le dossier
	 * @throws DossierPleinException
	 *             si le dossier est déjà plein
	 */
	public void ajouterMessage(Message m) throws DossierPleinException {

		if (this.nbMessages == CAPA_MAX) {
			throw new DossierPleinException();
		}
		this.msgs[this.nbMessages] = m;
		this.nbMessages++;

		// TODO debug
		System.out.println("Message ajouté : " + m);

	}

	/**
	 * Fonction permettant de supprimer un message dans le dossier.
	 * 
	 * @param m
	 *            message à supprimer du dossier
	 * @return <tt>true</tt> si le message a été supprimé, <tt>false</tt> sinon
	 * @throws DossierVideException
	 */
	public boolean supprimerMessage(Message m) throws DossierVideException {

		if (this.nbMessages == 0) {
			throw new DossierVideException();
		}

		boolean trouve = false;

		for (int i = 0; i < this.nbMessages; i++) {
			if ((!trouve) && (m.equals(this.msgs[i])))
				trouve = true;
			if ((trouve) && (i < this.nbMessages))
				this.msgs[i] = this.msgs[i + 1];
		}
		if (trouve)
			this.nbMessages--;

		return trouve;

		/*
		 * public boolean supprimerMessage(Message m){
		 * 
		 * int i = 0; int j; while(i < this.nbMessages &&
		 * m.equals(this.msgs[i])) { i++; } for(j = i;j < this.nbMessages;j++) {
		 * this.msgs[j] = this.msgs[j+1]; }
		 * 
		 * this.nbMessages--; return true;
		 */

	}

}