package hari01;

public class Soal1F {
	public static void main(String[] args) {
		for (int f = 0; f < 9; f++) {
			for (int g = 0; g < 9; g++) {
				if (f == g) {
					System.out.print("*");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
