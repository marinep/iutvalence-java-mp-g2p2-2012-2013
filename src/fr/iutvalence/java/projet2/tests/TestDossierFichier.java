package fr.iutvalence.java.projet2.tests;

import java.io.IOException;

import fr.iutvalence.java.projet2.DossierFichier;
import fr.iutvalence.java.projet2.DossierManager;
import fr.iutvalence.java.projet2.StorageException;
import fr.iutvalence.java.projet2.DossierTableau;
import fr.iutvalence.java.projet2.Message;

/**
 * Classe de test pour la classe DossierFichier
 * @author pougem
 *
 */
public class TestDossierFichier {
	
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException{
		DossierManager dossTest = new DossierFichier("testDir");
		Message m1 = new Message("truc@mail.com", "moi@mail.fr", "coucou", "what's up...?");
		try {
			dossTest.ajouterMessage(m1);
		} catch (StorageException e) {
			e.printStackTrace();
			System.out.println("oupsss");
		}
		
	}
}
