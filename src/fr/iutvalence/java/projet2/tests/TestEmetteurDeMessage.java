
package fr.iutvalence.java.projet2.tests;

import fr.iutvalence.java.projet2.EmetteurDeMessages;
import fr.iutvalence.java.projet2.Message;

/**
 * Fonction d'émission de message (flan)
 * Envoie un mail à la console
 */
public class TestEmetteurDeMessage {

	// FIXME le commentaire n'est pas génial (dire ce que l'on veu tester)
	/**
	 * Fonction principale qui retourne tous les tests dans la console
	 */
	public static void main(String[] args) 
	{
		EmetteurDeMessages emetteur = new EmetteurDeMessages();
		Message m = new Message("test", "moi", "lui", "test...");
		emetteur.envoiMessage(m);
	}

}
