package bai_tap;

public class bai_2 {

	public static void main(String[] args) {
		
		int tong = 0;
		int n = 0;
		
		// Điều kiện tổng phải nhỏ hơn 10000
		while (tong < 10000) {
			n++;
			tong += n;
		}
		System.out.println("Tổng là: " + tong);
		System.out.println("Số nguyên dương nhỏ nhất là: " + n);
	}
}
