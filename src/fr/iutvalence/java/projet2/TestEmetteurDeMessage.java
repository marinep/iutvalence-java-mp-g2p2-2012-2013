package fr.iutvalence.java.projet2;

//FIXME écrire un commentaire
public class TestEmetteurDeMessage {

	// FIXME clarifier le commentaire
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		EmetteurDeMessages emetteur = new EmetteurDeMessages();
		Message m = new Message("test", "moi", "lui", "test...");
		emetteur.envoiMessage(m);
	}

}
