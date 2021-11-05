package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import entity.Sanpham;
import service.SanphamService;
import utils.HibernateUtils;

public class SanphamDao implements SanphamService{
	private EntityManager em;

	public SanphamDao() {
		this.em = HibernateUtils.getInstance().getEntityManager();
	}

	public Sanpham getSanphamById(int id) {
		
		EntityTransaction trans = em.getTransaction();
		
		try {
			trans.begin();
			Sanpham sanpham = em.find(Sanpham.class, id);
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
