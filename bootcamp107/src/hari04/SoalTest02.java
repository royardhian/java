package hari04;

import java.util.Scanner;

import utility.Util;

public class SoalTest02 {
	protected static Scanner in;

	public static void main(String[] args) {
		System.out.println("masukkan angka jumlah bilangan ganjil = ");
		in = new Scanner(System.in);
		int num = 1;
		int d = (in.nextInt() - 1) * 4 + 1;
		String[][] array2D = new String[d][d];

		for (int i = 0; i < array2D.length; i++) {
			for (int j = 0; j < array2D[i].length; j++) {
				if (i <= j && i + j <= d - 1) {
					if (i % 2 == 0) {
						array2D[i][j] = num + "";
						array2D[d - 1 - i][j] = num + "";
						array2D[j][d - 1 - i] = num + "";
						array2D[j][i] = num + "";

					}
				}
			}
			if(i%2==0){
				num*=3;
			}
		}
		Util.printArray2D(array2D);
	}
}
