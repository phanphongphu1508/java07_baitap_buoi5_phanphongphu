package bai_tap;
import java.util.Scanner;
public class bai_3 {
	public static void main(String[] args) {
	
		int n;
		int tinhTong = 0;
		
		// Cho phép nhập từ bàn phím
		Scanner banPhim = new Scanner(System.in);
		
		// Số nhập vào lớn hơn 0 thực hiện câu lệnh, nhỏ hơn 0 nhập lại
		do {
			System.out.print("Nhập vào số nguyên dương lớn hơn 0: ");
			n = banPhim.nextInt();
			// Cho giá trị i bắt đầu bằng 1
			// Nếu n > i thực hiện tính tổng
			// Sau mỗi lần tính i tăng 2 giá trị để lấy ra được số lẻ
			for (int i = 1; n > i; i += 2) {
				tinhTong += i;
			}
		} while (n <= 0);
		
		banPhim.close();
		
		// In ra mà hình tổng số lẻ
		System.out.print("Tổng của số lẻ là: " + tinhTong);
	}
}
