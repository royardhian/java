package hari02;

public class Soal4 {
	public static void main(String[] args) {
		int n = 9;
		int num1 = 1;
		int num2 = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j || j == 4) {
					System.out.print(num1 + "\t");
				} else if (i + j == n - 1) {
					System.out.print(num2 + "\t");
				} else if (i == 4) {
					System.out.print(num2 + "\t");
				} else {
					System.out.print(" \t");
				}
				num2 += 2;
			}
			System.out.println();
			num1 += 2;
			num2 = 0;
		}
	}
}
