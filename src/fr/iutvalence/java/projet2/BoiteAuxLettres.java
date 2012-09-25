package fr.iutvalence.java.projet2;
/** contient des supers dossiers 
 * (boite de réception, messages envoyés, corbeille...) */
public class BoiteAuxLettres {
	public ConteneurAdresses boiteReception;
	public Message[] eltsEnvoyes = new Message[100];
	public Message[] corbeille = new Message[100];
}
