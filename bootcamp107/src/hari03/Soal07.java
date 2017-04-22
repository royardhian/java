package hari03;

import utility.Deret;

public class Soal07 {
	public static void main(String[] args) {
		int n = 9;
		int[] array1D = Deret.fibonaci2(n);
		String[][] array2D = new String[n][n];
		
		for (int i = 0; i < array2D.length; i++) {
			for (int j = 0; j < array2D[i].length; j++) {
				if (i<=j&&i+j<=n-1) {
					array2D[i][j]=array1D[i]+"";
				}
				else if (i>=j&&i+j>=n-1) {
					array2D[i][j]=array1D[i]+"";
				}
				else if (i>j&&i+j<n-1) {
					array2D[i][j]=array1D[j]+"";
				}
				else {
					array2D[i][j]=array1D[j]+"";
				}
			}
		}
		utility.Util.printArray2D(array2D);
	}
}
