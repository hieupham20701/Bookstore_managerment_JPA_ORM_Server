package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import entity.Sanpham;
import service.SanphamService;

public class SanphamDao implements SanphamService{
	private SessionFactory sessionFactory;

	public SanphamDao(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}

	public Sanpham getSanphamById(int id) {
		Session session = sessionFactory.getCurrentSession();
		Transaction trans = session.getTransaction();
		
		try {
			trans.begin();
			Sanpham sanpham = session.find(Sanpham.class, id);
			trans.commit();
			return sanpham;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			trans.rollback();
			return null;
		}

	}

	
}
