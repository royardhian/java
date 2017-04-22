package hari04;

import java.util.Scanner;

import utility.Deret;
import utility.Util;

public class SoalTestVersiMudah {
	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		System.out.print("masukaan jumalh dimanesi (bilangan ganjil) = ");
		int n = in.nextInt();
		int nT = (n - 1) / 2;
		String[] arrayH = Deret.deretHuruf();
		String[][] array2D = new String[n][n];

		System.out.println("\n");

		for (int i = 0; i < array2D.length; i++) {
			for (int j = 0; j < array2D[i].length; j++) {
				if (i <= j && j <= nT) {
					array2D[i][j] = arrayH[nT - i];
					array2D[n - 1 - i][n - 1 - j] = arrayH[nT - i];
					array2D[j][n - 1 - i] = arrayH[nT - i];
					array2D[n - 1 - j][i] = arrayH[nT - i];
				}
			}
		}
		Util.printArray2D(array2D);
	}
}
