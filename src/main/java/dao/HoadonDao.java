package dao;

import javax.persistence.EntityManager;

import entity.Hoadon;
import service.HoadonService;
import utils.HibernateUtils;

public class HoadonDao implements HoadonService  {
	
	private EntityManager em;
	public HoadonDao() {
		// TODO Auto-generated constructor stub
		this.em = HibernateUtils.getInstance().getEntityManager();
	}
	@Override
	public Hoadon getHoadonbyId(int id) {
		// TODO Auto-generated method stub
		Hoadon hoadon = new Hoadon();
		
		try {
			hoadon = em.find(Hoadon.class, id);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return hoadon;
	}

}
