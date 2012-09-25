package fr.iutvalence.java.projet2;

public class TestEmetteurDeMessage {

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
