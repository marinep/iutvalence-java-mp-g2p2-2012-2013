package fr.iutvalence.java.projet2.tests;

import fr.iutvalence.java.projet2.CompteMail;
import fr.iutvalence.java.projet2.EmetteurDeMessages;
import fr.iutvalence.java.projet2.RecepteurDeMessages;

/**
 * @author pougem
 * 
 */
public class TestCreationCompte {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EmetteurDeMessages e = new EmetteurDeMessages("gmailEmetteur");
		RecepteurDeMessages r = new RecepteurDeMessages("gmailRecepteur");
		CompteMail compteTest = new CompteMail("gmail", "moi@gmail.com", e, r);

		System.out.println(compteTest);

	}
}
