package hari02;

public class Soal7 {
	public static void main(String[] args) {
		int n = 9;
		int num1 = 1;
		int num2 = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i <= j - 1 && i + j < n-1) {
					System.out.print("A ");
				} else if (i >= j + 1 && i + j > n-1) {
					System.out.print("B ");
				} else if (i == j) {
					System.out.print(num1 + " ");
				} 
				else if (i+j==8) {
					System.out.print(num2+" ");
				}else {
					System.out.print("  ");
				}num2+=2;
			}
			System.out.println();
			num1 += 2;
			num2=0;
		}
	}
}
