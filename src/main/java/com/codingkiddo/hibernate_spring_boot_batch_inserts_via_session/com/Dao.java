package com.codingkiddo.hibernate_spring_boot_batch_inserts_via_session.com;

import java.io.Serializable;
import java.util.logging.Logger;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
@Transactional
public class Dao<T, ID extends Serializable> implements GenericDao<T, ID> {

	private static final Logger logger = Logger.getLogger(Dao.class.getName());
    private static final int BATCH_SIZE = 30;
    
    @PersistenceContext
    private EntityManager entityManager;
    
	@Override
	public <S extends T> void saveInBatch(Iterable<S> entites) {
	
		if ( entites == null ) {
			throw new IllegalArgumentException("The given Iterable of entities cannot be null!");
		}
		
		int i=0;
		
		Session session = entityManager.unwrap(Session.class);
	}
    
}
