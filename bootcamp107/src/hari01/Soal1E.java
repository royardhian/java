package hari01;

public class Soal1E {
	public static void main(String[] args) {
		for (int e = 0; e < 9; e++) {
			for (int f = 0; f < 9; f++) {
				if (e == f) {
					System.out.print("*");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
