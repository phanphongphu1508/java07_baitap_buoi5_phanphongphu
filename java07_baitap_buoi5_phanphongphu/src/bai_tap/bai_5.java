package bai_tap;
import java.util.Scanner;

public class bai_5 {
	public static void main(String[] args) {
		
		Scanner banPhim = new Scanner(System.in);
		
		System.out.print("Nhập số tiền cần gửi tiết kiệm: ");
		double tienGuiTietKiem = banPhim.nextDouble();
		
		System.out.print("Nhập số tiền mong muốn trong tương lai: ");
		double tienMuonCo = banPhim.nextDouble();
		
		System.out.print("Nhập lãi suất tiết kiệm (%/năm): ");
		double laiSuat = banPhim.nextDouble();
		
		banPhim.close();
		
		double tyLe = laiSuat / 100;
		
		// Gọi hàm tinhNam gián vào biến soNam
		int soNam = tinhNam(tienGuiTietKiem, tienMuonCo, tyLe);
		// In ra màn hình số năm cần chờ
		System.out.print("Số năm chờ đợi ít nhất để đạt được số tiền mong muốn là: " + soNam + " năm");
	}
	
	public static int tinhNam(double tienGuiTietKiem, double tienMuonCo, double tyLe) {
		int soNam = 0;
		/*
		 * Tiền lãi = tiền gửi * lãi suất
		 * Tổng tiền = tiền gửi + tiền lãi
		 *  => tiền gửi + (tiền gửi * lãi suất)
		 *  
		 *  Dùng tham số tienGuiTietKiem được truyền vào
		 *  từ bàn phím lưu tạm số tiền tích lũy
		 *  
		 *  Sau mỗi vòng lặp soNam sẽ tăng lên 1 đơn vị
		 * */
		while (tienGuiTietKiem < tienMuonCo) {
			tienGuiTietKiem += (tienGuiTietKiem * tyLe);
			soNam ++;
		}
		return soNam;
	}	
}
