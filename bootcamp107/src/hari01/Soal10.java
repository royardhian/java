package hari01;

public class Soal10 {
	public static void main(String[] args) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if ((j <= i && i < 5) || (j >= i && i > 3)) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
