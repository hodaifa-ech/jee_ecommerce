package ma.fstt.persistance;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import ma.fstt.persistance.Client;

public class Test {

    public static void main(String[] args) {

        Client client = new Client();
        client.setNom("hodaifa");
        client.setAddresse("echffani");
        client.setTelephone("0867833833");

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("default");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        System.out.println("COMIITING");
        em.persist(client);
        em.getTransaction().commit();

    }
}
