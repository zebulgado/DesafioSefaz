package br.com.welcomeapp.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.welcomeapp.model.Ddd;
import br.com.welcomeapp.util.HibernateUtil;

public class DddDao {

	public void create(Ddd ddd) {
		Transaction transaction = null;
		
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			session.save(ddd);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}
	
	public Ddd readById(int id) {
		Transaction transaction = null;
		Ddd ddd = null;
		
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			ddd = session.get(Ddd.class, id);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return ddd;
	}
	
	public void update(Ddd ddd) {
		Transaction transaction = null;
		
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			session.update(ddd);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}
	
	public void delete(int id) {
		Transaction transaction = null;
		
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			Ddd ddd = session.get(Ddd.class, id);
			if (ddd != null) {
				session.delete(ddd);
			}
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<Ddd> readAll() {
		Transaction transaction = null;
		List<Ddd> dddList = null;
		
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			dddList = session.createQuery("from ddd").getResultList();
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return dddList;
	}
}