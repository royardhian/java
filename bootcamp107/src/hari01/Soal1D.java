package hari01;

public class Soal1D {
public static void main(String[] args) {
	for (int d = 0; d < 9; d++) {
		for (int e = 0; e < 9; e++) {
			if (d==e) {
				System.out.print("*");
			}
			else {
				System.out.print("  ");
			}
		}System.out.println();
	}
}
}
