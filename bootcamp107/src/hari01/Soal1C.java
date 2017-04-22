package hari01;

public class Soal1C {
	public static void main(String[] args) {
		for (int c = 0; c < 9; c++) {
			for (int d = 0; d < 9; d++) {
				if (c == d) {
					System.out.print("*");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
