package br.com.welcomeapp.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.welcomeapp.model.PhoneType;
import br.com.welcomeapp.util.HibernateUtil;

public class PhoneTypeDao {

	public void create(PhoneType phoneType) {
		Transaction transaction = null;

		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			session.save(phoneType);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

	public PhoneType readById(int id) {
		Transaction transaction = null;
		PhoneType phoneType = null;

		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			phoneType = session.get(PhoneType.class, id);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return phoneType;
	}

	public void update(PhoneType phoneType) {
		Transaction transaction = null;

		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			session.update(phoneType);
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
			PhoneType phoneType = session.get(PhoneType.class, id);
			if (phoneType != null) {
				session.delete(phoneType);
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
	public List<PhoneType> readAll() {
		Transaction transaction = null;
		List<PhoneType> phoneTypes = null;

		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			phoneTypes = session.createQuery("from phone_type").getResultList();
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return phoneTypes;
	}
}