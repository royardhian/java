package hari01;

public class Soal3 {
public static void main(String[] args) {
	for (int i = 0; i < 9; i++) {
		for (int j = 0; j < 9; j++) {
			if (i+j==8 || i==j) {
				System.out.print("*");
			}
			else {
				System.out.print("  ");
			}
		}System.out.println("");
	}
}
}