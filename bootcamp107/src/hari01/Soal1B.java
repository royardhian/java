package hari01;

public class Soal1B {
	public static void main(String[] args) {
		for (int b = 0; b < 9; b++) {
			for (int c = 0; c < 9; c++) {
				if (b == c) {
					System.out.print("*");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
	}
}
