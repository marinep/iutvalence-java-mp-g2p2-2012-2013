package fr.iutvalence.java.projet2.tests;

import fr.iutvalence.java.projet2.DossierCollection;
import fr.iutvalence.java.projet2.DossierManager;
import fr.iutvalence.java.projet2.DossierPleinException;
import fr.iutvalence.java.projet2.DossierTableau;
import fr.iutvalence.java.projet2.DossierVideException;
import fr.iutvalence.java.projet2.Message;
import java.util.Iterator;
import java.util.List;

/**
 * Cette classe permet de tester l'ajout d'un message (ou plusieurs) dans un
 * dossier
 */
public class TestOperationsDossierMessages
{

    /**
     * Cette fonction renvoie les messages effectivements ajoutés. Si le dossier
     * est plein (exception DossierPleinException), on renvoie une erreur
     *
     * @param args
     * @throws DossierPleinException
     */
    public static void main(String[] args)
    {
        DossierManager dossTest = new DossierTableau("mesTps");
        Message m1 = new Message("test", "moi", "lui", "test...");
        Message m2 = new Message("bli", "bla", "bla", "blablabla...");
        Message m3 = new Message("sdfsd", "sdfsdf", "sdfsdf", "tesqsdqst...");
        Message m4 = new Message("sdqsdqsdfsd", "sdfsdgf", "db", "cbb...");
        Message m5 = new Message("bli", "blob", "beffla", "bleeeeablabla...");



        try
        {
            dossTest.ajouterMessage(m1);
        }
        catch (DossierPleinException e)
        {
            System.out.println("Le message n'a pas pu être ajouté.\n");
        }
        try
        {
            dossTest.ajouterMessage(m2);
        }
        catch (DossierPleinException e)
        {
            System.out.println("Le message n'a pas pu être ajouté.\n");
        }
        try
        {
            dossTest.ajouterMessage(m3);
        }
        catch (DossierPleinException e)
        {
            System.out.println("Le message n'a pas pu être ajouté.\n");
        }
        try
        {
            dossTest.ajouterMessage(m4);
        }
        catch (DossierPleinException e)
        {
            System.out.println("Le message n'a pas pu être ajouté.\n");
        }

        System.out.println(dossTest);

        try
        {
            dossTest.supprimerMessage(m4);
        }
        catch (DossierVideException e)
        {
            System.out.println("Le message n'a pas pu être supprimé.\n");
        }

        System.out.println(dossTest);

        try
        {
            dossTest.ajouterMessage(m5);
        }
        catch (DossierPleinException e)
        {
            System.out.println("Le message n'a pas pu être ajouté.\n");
        }

        System.out.println(dossTest);

        List<Message> res;
        res = dossTest.rechercherMessageObjet("bli");
        if (res.isEmpty())
        {
            System.err.println("AUCUN MESSAGE CORRESPONDANT\n");
        }
        else
        {
            Iterator<Message> i = res.iterator();
            while (i.hasNext())
            {
                Message m = i.next();
                System.out.println(m);
            }

            /*
             for(int j = 0; j<res.size();j++)
             {
             System.out.println(res.get(j));
             }*/

        }
        System.out.println("\n######## Test avec DossierCollection ########\n");

        DossierManager dossTest2 = new DossierCollection("mesTps2");

        try
        {
            dossTest2.ajouterMessage(m1);
        }
        catch (DossierPleinException e)
        {
            System.out.println("Le message n'a pas pu être ajouté.\n");
        }
        try
        {
            dossTest2.ajouterMessage(m2);
        }
        catch (DossierPleinException e)
        {
            System.out.println("Le message n'a pas pu être ajouté.\n");
        }
        try
        {
            dossTest2.ajouterMessage(m3);
        }
        catch (DossierPleinException e)
        {
            System.out.println("Le message n'a pas pu être ajouté.\n");
        }
        try
        {
            dossTest2.ajouterMessage(m4);
        }
        catch (DossierPleinException e)
        {
            System.out.println("Le message n'a pas pu être ajouté.\n");
        }

        System.out.println(dossTest2);

        try
        {
            dossTest2.supprimerMessage(m4);
        }
        catch (DossierVideException e)
        {
            System.out.println("Le message n'a pas pu être supprimé.\n");
        }

        System.out.println(dossTest2);

        try
        {
            dossTest2.ajouterMessage(m5);
        }
        catch (DossierPleinException e)
        {
            System.out.println("Le message n'a pas pu être ajouté.\n");
        }

        System.out.println(dossTest2);

        List<Message> res2;
        res2 = dossTest2.rechercherMessageObjet("bli");
        if (res2.isEmpty())
        {
            System.err.println("AUCUN MESSAGE CORRESPONDANT\n");
        }
        else
        {
            Iterator<Message> i = res2.iterator();
            while (i.hasNext())
            {
                Message m = i.next();
                System.out.println(m);
            }
        }

    }
}
