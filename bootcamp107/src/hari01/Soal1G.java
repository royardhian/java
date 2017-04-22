package hari01;

public class Soal1G {
	public static void main(String[] args) {
		for (int g = 0; g < 9; g++) {
			for (int h = 0; h < 9; h++) {
				if (g == h) {
					System.out.print("*");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
