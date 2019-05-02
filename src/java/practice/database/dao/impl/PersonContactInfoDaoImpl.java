package practice.database.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import practice.database.dao.PersonContactInfoDao;
import practice.database.entity.PersonContactInfo;

/**
 * 
 * @author Kavitha R
 *
 */
public class PersonContactInfoDaoImpl implements PersonContactInfoDao {
	
	private SessionFactory sessionFactory;
	
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

	@Override
	public void save(PersonContactInfo p) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(p);
		tx.commit();
		session.close();
	}
	
	

	@Override
	public void update(PersonContactInfo p) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.update(p);
		tx.commit();
		session.close();
	}

	@Override
	public void delete(PersonContactInfo p) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.delete(p);
		tx.commit();
		session.close();
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<PersonContactInfo> list() {
		Session session = this.sessionFactory.openSession();
		
		List<PersonContactInfo> personList = session.createCriteria(PersonContactInfo.class).list();
		session.close();
		return personList;
	}

}
