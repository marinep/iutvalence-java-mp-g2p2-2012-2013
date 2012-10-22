
package fr.iutvalence.java.projet2.tests;

import fr.iutvalence.java.projet2.EmetteurDeMessages;
import fr.iutvalence.java.projet2.Message;

/**
 * Fonction d'émission de message (flan)
 * Envoie un mail à la console
 */
public class TestEmetteurDeMessage {

	/**
	 * Fonction de test qui affiche dans la console un message.
	 * Cela permet de tester si le message a été créé correctement.
	 */
	public static void main(String[] args) 
	{
		EmetteurDeMessages emetteur = new EmetteurDeMessages();
		Message m = new Message("test", "moi", "lui", "test...");
		emetteur.envoiMessage(m);
	}

}
