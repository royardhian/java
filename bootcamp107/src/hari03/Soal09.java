package hari03;

import utility.Deret;
import utility.Util;

public class Soal09 {
	public static void main(String[] args) {
		int n = 10;
		int nD = (n+1)/2;
		int[] array1D = Deret.fibonaci2(nD);
		String[][] array2D = new String[n][n];
		
		for (int i = 0; i < array2D.length; i++) {
			for (int j = 0; j < array2D[i].length; j++) {
				if (i<=j&&i+j<=n-1) {
					if(i%2==0){
						array2D[i][j]=array1D[i/2]+"";
					}
					else {
						array2D[i][j]="";
					}
				}
				else if (i>=j&&i+j>=n-1) {
					if(i%2==0){
						array2D[i][j]=array1D[i/2]+"";
					}
					else {
						array2D[i][j]="";
					}
				}
				else if (i>j&&i+j<n-1) {
					if(j%2==0){
						array2D[i][j]=array1D[j/2]+"";
					}
					else {
						array2D[i][j]="";
					}
				}
				else if (i<j&&i+j>n-1) {
					if(j%2==0){
						array2D[i][j]=array1D[j/2]+"";
					}
					else {
						array2D[i][j]="";
					}
				}
			}
		}
Util.printArray2D(array2D);
	}
}
