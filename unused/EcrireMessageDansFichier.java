package fr.iutvalence.java.projet2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**Classe permettant l'écriture d'un Message 
 * dans un fichier texte
 * @author pougem
 *
 */
public class EcrireMessageDansFichier {
	
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		try{
		//	File monFichier = new File("pougem/java_projet/clientmail/mes_mails");
		//	FileOutputStream fos;
		//	fos = new FileOutputStream(monFichier);
		}
		catch (FileNotFoundException e){
			System.out.println("Le fichier n'a pas pu être trouvé.");
		}
		

		
	}

}
