package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import entity.Nhacungcap;
import service.NhacungcapService;

public class NhacungcapDao implements NhacungcapService{

	public NhacungcapDao(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}
	private SessionFactory sessionFactory;
	public Nhacungcap getNhaCCById(String id) {
		Session session = sessionFactory.getCurrentSession();
		Transaction trans = session.getTransaction();
		try {
			trans.begin();
			Nhacungcap nhacungcap = session.find(Nhacungcap.class, id);
			trans.commit();
			return nhacungcap;
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
			return null;

		}
		
	}

}
