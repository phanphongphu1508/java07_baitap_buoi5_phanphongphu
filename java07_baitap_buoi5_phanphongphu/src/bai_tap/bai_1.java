package bai_tap;
import java.util.Scanner;
public class bai_1 {
	public static void main(String[] args) {
		
		int nguoiChoi, mayChoi;
		int tiSoNguoiChoi = 0, tiSoMayChoi = 0;
		String nguoiChoiNhap = "", mayNhap = "";
		String ketQuaNguoiChoi = "", ketQuaMay = "";

		// Cho phép người chơi nhập vào
		Scanner banPhim = new Scanner(System.in);
		
		do {
			// Máy random số nhập vào
			mayChoi = (int)(Math.random() * 3 + 1);
			
			//Nhập vào 1, 2, 3 tương ứng bao, kéo, búa
			System.out.println("Vui lòng chọn số tương ứng:\n1. Bao\n2. Kéo\n3. Búa");
			System.out.print("Lựa chọn của bạn: ");
			nguoiChoi = banPhim.nextInt();
			
			// Lấy dữ liệu người dùng nhập vào để tìm bao, kéo, búa tương ứng
			if (nguoiChoi == 1) {
				nguoiChoiNhap = "Bao";
			}
			if (nguoiChoi == 2) {
				nguoiChoiNhap = "Kéo";
			}
			if (nguoiChoi == 3) {
				nguoiChoiNhap = "Búa";
			}
			// Lấy dữ liệu máy random để tìm bao, kéo, búa tương ứng
			if (mayChoi == 1) {
				mayNhap = "Bao";
			}
			if (mayChoi == 2) {
				mayNhap = "Kéo";
			}
			if (mayChoi == 3) {
				mayNhap = "Búa";
			}
			// Kiểm tra điều kiện người chơi nhập vào
			if (nguoiChoi <= 0 || nguoiChoi > 3) {
				// Người chơi nhập vào số nhỏ hơn 0 hoặc lớn hơn 3 sẽ báo và cho nhập lại
				if (nguoiChoi < 0 || nguoiChoi > 3) {
					System.out.println("Vui lòng nhập lại (1. Bao, 2. Kéo, 3. Búa) để chơi Oẳn Tù Tì.");
				}
				// Người chơi nhập 0 dừng chương trình
				if (nguoiChoi == 0) {
					System.out.println("Đã dừng chương trình Oẳn Tù Tì!!");
					break;
				}
			}
			else {
				// Điều kiện người chơi và máy bằng nhau
				if (nguoiChoi == mayChoi) {
					ketQuaNguoiChoi = nguoiChoiNhap;
					ketQuaMay = mayNhap;
					System.out.println("Người chơi: " + ketQuaNguoiChoi +  " - Máy: " + ketQuaMay);
					System.out.println("Người chơi và máy hòa");
				} 
				// Điều kện người chơi thắng
				else if (nguoiChoi == 1 && mayChoi == 3 || nguoiChoi == 2 && mayChoi == 1 || nguoiChoi == 3 && mayChoi == 2) {
					ketQuaNguoiChoi = nguoiChoiNhap;
					ketQuaMay = mayNhap;
					tiSoNguoiChoi += 1;
					System.out.println("Người chơi: " + ketQuaNguoiChoi + " - Máy: " + ketQuaMay);
					System.out.println("Người chơi thắng");
				} 
				// Điều kện máy thắng
				else if (mayChoi == 2 && nguoiChoi == 1 || mayChoi == 3 && nguoiChoi == 2 || mayChoi == 1 && nguoiChoi == 3) {
					ketQuaNguoiChoi = nguoiChoiNhap;
					ketQuaMay = mayNhap;
					tiSoMayChoi += 1;
					System.out.println("Người chơi: " + ketQuaNguoiChoi + " - Máy: " + ketQuaMay);
					System.out.println("Máy thắng");
				}
			}
		} while (nguoiChoi != 0);
		
		banPhim.close();
		
		// In ra màn hình tỉ số thắng của người chơi
		System.out.println("Tỉ số của người chơi và máy");
		System.out.print("Người chơi " + tiSoNguoiChoi + " - " + tiSoMayChoi + " Máy");
	}
}
