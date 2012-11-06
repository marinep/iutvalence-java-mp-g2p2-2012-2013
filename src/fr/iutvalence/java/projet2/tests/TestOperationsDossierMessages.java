package fr.iutvalence.java.projet2.tests;

import fr.iutvalence.java.projet2.Dossier;
import fr.iutvalence.java.projet2.DossierPleinException;
import fr.iutvalence.java.projet2.DossierVideException;
import fr.iutvalence.java.projet2.Message;

/**
 * Cette classe permet de tester l'ajout d'un message (ou plusieurs) dans un dossier
 */
public class TestOperationsDossierMessages {
	
	/**
	 * Cette fonction renvoie les messages effectivements ajoutés.
	 * Si le dossier est plein (exception DossierPleinException), on renvoie une erreur
	 * @param args
	 * @throws DossierPleinException
	 */
	public static void main(String[] args)
	{
		Dossier dossTest = new Dossier("mesTps");
		Message m1 = new Message("test", "moi", "lui", "test...");
		Message m2 = new Message("bli", "bla", "bla", "blablabla...");
		Message m3 = new Message("sdfsd", "sdfsdf", "sdfsdf", "tesqsdqst...");
		Message m4 = new Message("sdqsdqsdfsd", "sdfsdgf", "db", "cbb...");
		
		try {
			dossTest.ajouterMessage(m1);
		} catch (DossierPleinException e) {
			System.out.println("Le message n'a pas pu être ajouté.");
		}
		try {
			dossTest.ajouterMessage(m2);
		} catch (DossierPleinException e) {
			System.out.println("Le message n'a pas pu être ajouté.");
		}
		try {
			dossTest.ajouterMessage(m3);
		} catch (DossierPleinException e) {
			System.out.println("Le message n'a pas pu être ajouté.");
		}
		try {
			dossTest.ajouterMessage(m4);
		} catch (DossierPleinException e) {
			System.out.println("Le message n'a pas pu être ajouté.");
		}

	System.out.println(dossTest);
	
	try {
		dossTest.supprimerMessage(m4);
	} catch (DossierVideException e) {
		System.out.println("Le message n'a pas pu être supprimé.");
	}
	
	System.out.println(dossTest);
	
	}
	
}
