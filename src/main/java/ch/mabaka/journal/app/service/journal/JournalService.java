package ch.mabaka.journal.app.service.journal;

import java.util.Collection;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

import ch.mabaka.journal.app.persistence.journal.Journal;

@RequestScoped
@Transactional
public class JournalService {

	@Inject
	EntityManager em;

	public Journal addJournal(Journal journal) {
		em.persist(journal);
		return journal;
	}

	@SuppressWarnings("unchecked")
	public Collection<Journal> readAllJournal() {
		Query query = em.createQuery("SELECT e FROM Journal e");
		return (Collection<Journal>) query.getResultList();
	}

}
