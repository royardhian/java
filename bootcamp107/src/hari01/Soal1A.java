package hari01;

public class Soal1A {
	public static void main(String[] args) {
		for (int a = 0; a < 9; a++) {
			for (int b = 0; b < 9; b++) {
				if (a == b) {
					System.out.print("*");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println(" ");
		}
	}
}
