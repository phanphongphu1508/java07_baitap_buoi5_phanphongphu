package bai_tap;
import java.util.Scanner;
public class bai_4 {
	public static void main(String[] agrs) {

		Scanner banPhim = new Scanner(System.in);
		
		// Nhập vào số nguyên n
		System.out.print("Nhập vào số x: ");
		double x = banPhim.nextDouble();
		// Nhập vào số x
		System.out.print("Nhập vào số n: ");
		int n = banPhim.nextInt();
		
		banPhim.close();
		
		double ketQua = tong(x, n);
		
		System.out.print("Kết quả là: " + ketQua);
	}		
	public static double tong(double x, int n) {
		double s = 0;
		for (int i = 1; i <= n; i++) {
			s = s + luyThua(x, i);
	}
		return s;
	}
	public static double luyThua(double x, int n) {
		double t = 1;
		for (int i = 1; i <= n; i++) {
			t = t * x;
		}
		return t;
	}	
}
