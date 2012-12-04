package fr.iutvalence.java.projet2;
import java.util.List;
import java.io.*;


/**
 * @author pougem
 *
 */
public class DossierFichier extends DossierAbstraite {

	/**
	 * @param nom
	 */
	public DossierFichier(String nom) {
		super(nom);
		new File(nom).mkdir();
	}

	@Override
	public void ajouterMessage(Message m) throws StorageException {
		try{FileWriter f = new FileWriter(new File(this.getNom(), "message"+m.hashCode()));
		
			f.write(m.getDestinataire()+"\n");
			f.write(m.getExpediteur()+"\n");
			f.write(m.getObjet()+"\n");
			f.write(m.getCorps()+"\n");
			f.close();
		}
		catch(IOException e){
			throw new StorageException(e);
		}


	}

	@Override
	public boolean supprimerMessage(Message m) throws DossierVideException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Message> rechercherMessageObjet(String keyword) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Message> rechercherMessageExp(String keyword) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Message> rechercherMessageDest(String keyword) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Message> rechercherMessageCorps(String keyword) {
		// TODO Auto-generated method stub
		return null;
	}

}
