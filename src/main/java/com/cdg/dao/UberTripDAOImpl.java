package com.cdg.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

import com.cdg.model.UberTrip;

public class UberTripDAOImpl implements UberTripDAO {

	private static final Logger logger = LoggerFactory.getLogger(UberTripDAOImpl.class);

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	@Override
	@Transactional
	public void addUberTrip(UberTrip p) {
		Session session = this.sessionFactory.getCurrentSession();
		Transaction tx = session.beginTransaction();
		session.save(p);
		tx.commit();
	}

	@Override
	public List<UberTrip> listUberTrip() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UberTrip getUberTrip(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		session.beginTransaction();
		UberTrip p = (UberTrip)session.load(UberTrip.class, id);
		return p;
	}

}
