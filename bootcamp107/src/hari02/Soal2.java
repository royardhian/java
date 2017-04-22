package hari02;

public class Soal2 {
	public static void main(String[] args) {
		int n = 9;
		int num = 16;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i + j == n - 1) {
					System.out.print(num + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
			num -= 2;
		}
	}
}
