package fr.iutvalence.java.projet2;

import java.util.*;

/**
 * La classe Dossier est utilisée pour représenter un ensemble de messages,
 * regroupés de manière délibérée par l'utilisateur, ou regroupés dans certains
 * cas par l'application elle-même (c'est notamment le cas pour les dossiers
 * messages envoyés)
 * 
 * @author pougem
 * 
 */
public class DossierTableau extends DossierAbstraite {
	
	/**
	 * Capacité maximum du dossier de messages
	 */
	public final static int CAPA_MAX = 5;

	/**
	 * Les messages présents dans le Dossier
	 */
	private Message[] msgs;

	/**
	 * Nombre d'éléments du tableau de messages correspondant au nombre de
	 * messages
	 */
	private int nbMessages;

	/**
	 * Constructeur pour la création d'un nouveau Dossier vide, avec en
	 * paramètre son nom
	 * 
	 * @param nom Nom du dossier contenant les messages
	 */

	// TODO vérifier
	public DossierTableau(String nom) {
		super(nom);
		this.msgs = new Message[CAPA_MAX];

	}

	/**
	 * Fonction permettant d'ajouter un message dans le dossier.
	 * 
	 * @param m message à ajouter dans le dossier
	 * @throws StorageException si le dossier est déjà plein
	 */
	public void ajouterMessage(Message m) throws StorageException {

		if (this.nbMessages == CAPA_MAX) {
			throw new StorageException();
		}
		this.msgs[this.nbMessages] = m;
		this.nbMessages++;

		// TODO debug
		System.out.println("Message ajouté : " + m);

	}

	/**
	 * Fonction permettant de supprimer un message dans le dossier.
	 * 
	 * @param m message à supprimer du dossier
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
	
	/**
	 * @param s
	 * @return Permet de rechercher un message
	 */
	/*	public Message[] rechercherMessage(String s){
	
			//String[] res = new String[this.nbMessages];
			String res = new String();
			for (int i = 0; i < this.nbMessages; i++)
			{
				String obj = this.msgs[i].getObjet();
				if(s.equals(obj))
				{
					res = res + obj;
				}
			}
			System.out.println(res);
			return res;
		}
	*/
	
	public List<Message> rechercherMessageObjet(String keyword)
	{
		List<Message> collec = new ArrayList<Message>(); 
                
		for(int i = 0; i < this.nbMessages; i++)
        {
			if (this.msgs[i].getObjet().toLowerCase().contains(keyword.toLowerCase()))
			{
                            
				collec.add(this.msgs[i]);
				
			}
		}
        return collec;
	}
	


    @Override
    public List<Message> rechercherMessageExp(String keyword)
    {
        List<Message> collec = new ArrayList<Message>(); 
                
		for(int i = 0; i < this.nbMessages; i++)
        {
			if (this.msgs[i].getExpediteur().toLowerCase().contains(keyword.toLowerCase()))
			{
                            
				collec.add(this.msgs[i]);
				
			}
		}
        return collec;
    }

    @Override
    public List<Message> rechercherMessageDest(String keyword)
    {
        List<Message> collec = new ArrayList<Message>(); 
                
		for(int i = 0; i < this.nbMessages; i++)
        {
			if (this.msgs[i].getDestinataire().toLowerCase().contains(keyword.toLowerCase()))
			{
                            
				collec.add(this.msgs[i]);
				
			}
		}
		return collec;
    }

    @Override
    public List<Message> rechercherMessageCorps(String keyword)
    {
    	List<Message> collec = new ArrayList<Message>(); 

    	for(int i = 0; i < this.nbMessages; i++)
    	{
    		if (this.msgs[i].getCorps().toLowerCase().contains(keyword.toLowerCase()))
    		{

    			collec.add(this.msgs[i]);

    		}
    	}
    	return collec;
    }

	@Override
	public String toString() {
		return "Le dossier " + this.getNom() + " contient ces messages : \n"
				+ Arrays.toString(this.msgs) + "\nIl contient "
				+ this.nbMessages + " messages.";
	}
}