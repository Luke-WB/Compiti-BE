package utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EventoDAO {
    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("GestioneEventi");
    static EntityManager em = emf.createEntityManager();

    public static void main(String[] args) {
	Evento ev = new Evento();
	ev.setTitolo("Meeting choice");
	ev.setDataevento("22-12-2024");
	ev.setDescrizione("Scelte di bilancio");
	ev.setNumeromassimopartecipanti(50);
	ev.setTipoevento(TipoEvento.PRIVATO);

	try {
	    // addEvento(ev);

	    Evento eventoLetto = findEvento(1l);
	    eventoLetto.setTipoevento(TipoEvento.PUBBLICO);
	    eventoLetto.setTitolo("La carica");
	    updateEvento(eventoLetto);

	} catch (Exception ex) {
	    System.out.println(ex);
	} finally {
	    em.close();
	    emf.close();
	}

    }

    public static void addEvento(Evento e) {
	em.getTransaction().begin();
	em.persist(e);
	em.getTransaction().commit();
	System.out.println("Evento salvato nel DB!!!");

    }

    public static Evento findEvento(Long id) {
	em.getTransaction().begin();
	Evento e = em.find(Evento.class, id);
	em.getTransaction().commit();
	return e;
    }

    public static void deleteEvento(Evento e) {
	em.getTransaction().begin();
	em.remove(e);
	em.getTransaction().commit();
	System.out.println("Evento rimosso nel DB!!!");
    }

    public static void updateEvento(Evento e) {
	em.getTransaction().begin();
	em.merge(e);
	em.getTransaction().commit();
	System.out.println("Evento aggiornato nel DB!!!");
    }

}
