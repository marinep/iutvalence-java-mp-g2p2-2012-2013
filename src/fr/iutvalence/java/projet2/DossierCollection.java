package fr.iutvalence.java.projet2;

import java.util.ArrayList;
// import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author pougem
 * 
 */
public class DossierCollection extends DossierAbstraite {
	
	/**
	 * Les messages présents dans le DossierTableau
	 */
	private List<Message> msgs;

	/**
	 * Nombre d'éléments du tableau de messages correspondant au nombre de
	 * messages
	 */
	// private int nbMessages; inutile car msgs.size()
	/**
	 * Constructeur pour la création d'un nouveau DossierTableau vide, avec en
	 * paramètre son nom
	 * 
	 * @param nom
	 *            Nom du dossier contenant les messages
	 */
	// TODO vérifier
	public DossierCollection(String nom) {
		super(nom);
		this.msgs = new ArrayList<Message>();

	}

	/**
	 * Fonction permettant d'ajouter un message dans le dossier.
	 * 
	 * @param m
	 *            message à ajouter dans le dossier
	 */
	public void ajouterMessage(Message m) {
		this.msgs.add(m);
		// this.nbMessages++; inutile car on a size()

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

		if (this.msgs.isEmpty()) {
			throw new DossierVideException();
		}
		// boolean trouve = false; devenu inutile car il existe la méthode de
		// recherche contains

		// Si le dossier contient le message
		if (this.msgs.contains(m)) {
			return this.msgs.remove(m);
		}
		return false;

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

	/**
	 * 
	 * @param s
	 * @return Permet de rechercher un message
	 */
	/*
	 * public Message[] rechercherMessage(String s){
	 * 
	 * //String[] res = new String[this.nbMessages]; String res = new String();
	 * for (int i = 0; i < this.nbMessages; i++) { String obj =
	 * this.msgs[i].getObjet(); if(s.equals(obj)) { res = res + obj; } }
	 * System.out.println(res); return res; }
	 */
	public List<Message> rechercherMessageObjet(String keyword) {
		List<Message> collec = new ArrayList<Message>();

		for (Message m : this.msgs) {
			if (m.getObjet().toLowerCase().contains(keyword.toLowerCase())) {
				collec.add(m);
			}
		}

		// Iterator<Message> i = this.msgs.iterator();
		//
		// while (i.hasNext())
		// { if (m.getObjet().toLowerCase().contains(keyword.toLowerCase()))
		// {
		// collec.add(m);
		// }
		//
		// Message m = i.next();
		// if (m.getObjet().toLowerCase().contains(keyword.toLowerCase()))
		// {
		// collec.add(m);
		// }
		// }

		return collec;
	}

	@Override
	public String toString() {
		return "\nLe dossier " + this.getNom() + " contient ces messages : \n"
				+ this.msgs.toString() + "\nIl contient " + this.msgs.size()
				+ " messages.";
	}

	@Override
	public List<Message> rechercherMessageExp(String keyword) {
		List<Message> collec = new ArrayList<Message>();

		Iterator<Message> i = this.msgs.iterator();

		while (i.hasNext()) {
			Message m = i.next();
			if (m.getExpediteur().toLowerCase().contains(keyword.toLowerCase())) {
				collec.add(m);
			}
		}

		return collec;
	}

	@Override
	public List<Message> rechercherMessageDest(String keyword) {
		List<Message> collec = new ArrayList<Message>();

		Iterator<Message> i = this.msgs.iterator();

		while (i.hasNext()) {
			Message m = i.next();
			if (m.getDestinataire().toLowerCase()
					.contains(keyword.toLowerCase())) {
				collec.add(m);
			}
		}

		return collec;
	}

	@Override
	public List<Message> rechercherMessageCorps(String keyword) {
		List<Message> collec = new ArrayList<Message>();

		Iterator<Message> i = this.msgs.iterator();

		while (i.hasNext()) {
			Message m = i.next();
			if (m.getCorps().toLowerCase().contains(keyword.toLowerCase())) {
				collec.add(m);
			}
		}

		return collec;
	}

}
