package fr.iutvalence.java.projet2;

import java.io.IOException;

/**
 * Classe permettant de gérer l'exception liée à un dossier plein.
 * 
 * @author pougem
 */
public class StorageException extends Exception {

	public StorageException(IOException e) {
		super(e);
	}

	public StorageException() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
