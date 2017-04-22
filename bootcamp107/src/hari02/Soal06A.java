package hari02;

public class Soal06A {
public static void main(String[] args) {
	int n = 9;
	int num= (n-1)*2;
	String[][] array2D = new String[n][n];
	
	for (int i = 0; i < array2D.length; i++) {
		for (int j = 0; j < array2D[i].length; j++) {
			if (i+j>=n-1) {
				array2D[i][j]=num+"";
			}
			else {
				array2D[i][j]="";
			};
		}num-=2;
	}
	for (int i = 0; i < array2D.length; i++) {
		for (int j = 0; j < array2D[i].length; j++) {
			System.out.print(array2D[i][j]+"\t");
		}System.out.println();
	}
}
}
