package com.cdg.dao;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.StatelessSession;
import org.hibernate.Transaction;
import org.springframework.transaction.annotation.Transactional;

import com.cdg.model.UberTrip;

public class UberTripDAOImpl implements UberTripDAO {


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

	@Override
	@Transactional
	public void batchTrip(List<UberTrip> tripList) throws Exception {

	
		/*
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		int i = 0 ;
		
			for( UberTrip trip : tripList ){
				session.save(trip);

				if ( ++i % 3000 == 0 ) { 
					session.flush();
					session.clear();
				}
			}
*/
		int i = 0 ;
		StatelessSession session = sessionFactory.openStatelessSession();
		Transaction tx = session.beginTransaction();
		try{
		for( UberTrip trip : tripList ){
			session.insert(trip);
			i++;
			if( i > 1000){
				tx.commit();
				tx = session.beginTransaction();
				i = 0;
			}
		}
			
			tx.commit();
		} catch(Exception e) {
			throw new Exception(e);
		} finally {
			session.close();
		}


	}

}
