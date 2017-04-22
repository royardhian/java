package hari03;

import utility.Util;

public class Soal08 {
	public static void main(String[] args) {
		int n = 9;
		int nT = (n - 1) / 2;
		int angka = 1;
		int angka2 = 1;
		String[][] array2D = new String[n][n];

		for (int i = 0; i < array2D.length; i++) {
			for (int j = 0; j < array2D[i].length; j++) {

				if (i <= j && i + j <= n - 1) {
					if (i % 2 == 0) {
						array2D[i][j] = angka + "";
					} else {
						array2D[i][j] = "";
					}
				} else if (i >= j && i + j >= n - 1) {
					if (i % 2 == 0) {
						array2D[i][j] = angka + "";
					} else {
						array2D[i][j] = "";
					}
				} else if (i > j && i + j < n - 1) {
					if (j % 2 == 0) {
						array2D[i][j] = angka2 + "";
					} else {
						array2D[i][j] = "";
					}
				} else if (i < j && i + j > n - 1) {
					if (j % 2 == 0) {
						array2D[i][j] = angka2 + "";
					} else {
						array2D[i][j] = "";
					}
				}
				if (j < nT) {
					angka2++;
				} else {
					angka2--;
				}

			}
			if (i < nT) {
				angka++;
			} else {
				angka--;
			}
			angka2=1;
		}
		Util.printArray2D(array2D);
	}
}
