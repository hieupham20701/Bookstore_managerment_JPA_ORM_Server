package app;

import java.util.List;

import dao.ChitietHoadonDao;
import dao.HoadonDao;
import dao.KhachhangDao;
import entity.ChitietHoadon;
import service.ChitietHoadonService;
import service.HoadonService;
import service.KhachhangService;

public class App {
	public static void main(String[] args) {
		KhachhangService khachhangService = new KhachhangDao();
		HoadonService hoadonService = new HoadonDao();
		
		ChitietHoadonService chitietHoadonService = new ChitietHoadonDao();
		
//		Hoadon hoadon = hoadonService.getHoadonbyId(88);
//		System.out.println(hoadon.toString());
		List<ChitietHoadon> cthd = chitietHoadonService.getChitietHoadonById(88);
		
		cthd.forEach(ct ->{
			System.out.println(ct.toString());
		});
		
		
//		System.out.println(khachhangService.getKhachhangById(1).toString());
//		Calam calam = calamService.getCalamById("CA1");
////		System.out.println(calam.toString());
//		Calam calam = new Calam();
//		ChitietCalam ctcl = chitietCalamDao.getChitietCalamById("CA1",calam);
//		System.out.println(ctcl.getCalam().toString());
		
		
	}
}
