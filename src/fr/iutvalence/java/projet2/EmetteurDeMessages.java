package fr.iutvalence.java.projet2;

/**
 * Service d'émission de messages
 * implémentation naive - affiche les messages sur la console
 */
public class EmetteurDeMessages 
{	
	/**
	 * Référence pour identifier l'emetteur
	 */
	private String ref;
	
	/** 
	 * getter pour utiliser la référence en dehors de la classe
	 * @return la référence de l'émetteur
	 */
	public String getRef() {
		return this.ref;
	}

	/**
	 * setter pour utiliser la référence en dehors de la classe
	 * @param ref la référence de l'émetteur
	 */
	public void setRef(String ref) 
	{
		this.ref = ref;
	}
	
	/**
	 * 
	 * @param s
	 */
	public EmetteurDeMessages(String s)
	{
		this.ref = s;
	}

	
	@Override
	public String toString() {
		return "EmetteurDeMessages [ref=" + ref + "]";
	}

	/**
	 * Cette fonction est du flan<br/> 
	 * Envoi de message 
	 * @param m le message à envoyer
	 */
	public void envoiMessage(Message m)
	{
		System.out.println("Envoi du message : "+m);
	}

}
