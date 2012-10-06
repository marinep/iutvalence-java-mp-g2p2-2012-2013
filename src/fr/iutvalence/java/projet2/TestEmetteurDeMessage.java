// FIXME déplacer cette application de test dans un paquetage différent de celui des autres classes
package fr.iutvalence.java.projet2;

/**
 * Fonction d'émission de message (flan)
 * Envoie un mail à la console
 */
public class TestEmetteurDeMessage {

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
