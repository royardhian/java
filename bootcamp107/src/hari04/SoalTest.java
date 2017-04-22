package hari04;

import java.util.Scanner;

import utility.Deret;
import utility.Util;

public class SoalTest {
	protected static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		 System.out.print("masukaan jumalh dimanesi (bilangan ganjil) = ");
		 int n = in.nextInt();
		//int n = 11;
		int nT = (n - 1) / 2;
		String[] arrayH = Deret.deretHuruf();
		String[][] array2D = new String[n][n];

		System.out.println("\n");

		for (int i = 0; i < array2D.length; i++) {
			for (int j = 0; j < array2D[i].length; j++) {
				if (i <= j && i + j <= n - 1 && j <= nT) {
					array2D[i][j] = arrayH[i];
				} else if (i + j >= n-1 && i <= j && i <= nT) {
					array2D[i][j] = arrayH[n - 1 - j];
				} else if (i >= j && i + j >= n - 1 && j >= nT) {
					array2D[i][j] = arrayH[n - 1 - i];
				} else if (i >= j && i + j <= n - 1 && i >= nT) {
					array2D[i][j] = arrayH[j];
				} else {
					array2D[i][j] = "";
				}
			}
		}
		Util.printArray2D(array2D);
	}
}
