package hari03;

import utility.Deret;
import utility.Util;

public class Soal05A {
	public static void main(String[] args) {
		int n = 9;
		String[][] deret2D = new String[n][n];
		int[] deret1D = Deret.fibonaci2(n);
		
		for (int i = 0; i < deret2D.length; i++) {
			for (int j = 0; j < deret2D[i].length; j++) {
				if (i>j&&i+j<n-1) {
					deret2D[i][j]="";
				}
				else {
					deret2D[i][j]=deret1D[j]+"";	
				}
				
			}
		}
		Util.printArray2D(deret2D);
	}
}
