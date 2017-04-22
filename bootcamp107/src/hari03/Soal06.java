package hari03;

import utility.Deret;

public class Soal06 {
	public static void main(String[] args) {
		int n = 9;
		int[] array1D = Deret.fibonaci(n);
		String[][] array2D = new String[n][n];
		
		for (int i = 0; i < array2D.length; i++) {
			for (int j = 0; j < array2D[i].length; j++) {
				if(i==j||i+j==8) {
					array2D[i][j]= array1D[j]+"";
				}
				else if (i>j&&i+j<n-1) {
					array2D[i][j]= "D";
				}
				else if (i<j&&i+j>n-1) {
					array2D[i][j]= "B";
				}
				else if (i>j&&i+j>n-1) {
					array2D[i][j]= "C";
				}
				else {
					array2D[i][j]= "A";
				}
			}
		}
		utility.Util.printArray2D(array2D);
	}
}
