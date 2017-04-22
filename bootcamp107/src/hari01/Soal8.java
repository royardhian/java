package hari01;


public class Soal8 {
	public static void main(String[] args) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if ((j <= i && i + j >= 8) || (j >= i && i + j <= 8)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
