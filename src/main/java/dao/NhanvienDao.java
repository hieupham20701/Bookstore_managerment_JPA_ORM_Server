package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import entity.Nhanvien;
import service.NhanvienService;

public class NhanvienDao implements NhanvienService{

	private SessionFactory sessionFactory;
	
	public NhanvienDao(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}

	public Nhanvien getNhanvienById(String id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Transaction trans = session.getTransaction();
		
		try {
			trans.begin();
			Nhanvien nhanvien = session.find(Nhanvien.class, id);
			trans.commit();
			return nhanvien;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			trans.rollback();
		}
		return null;
	}

}
