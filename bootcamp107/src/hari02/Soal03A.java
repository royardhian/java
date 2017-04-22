package hari02;

public class Soal03A {
public static void main(String[] args) {
	int n = 9;
	int num1=1;
	int num2=0;
	String[][] array2D = new String[n][n];
	
	for (int i = 0; i < array2D.length; i++) {
		for (int j = 0; j < array2D[i].length; j++) {
			if (i==j) {
				array2D[i][j]=num1+"";
			}
			else if (i+j==n-1) {
				array2D[i][j]=num2+"";
			}
			else {
				array2D[i][j]="";
			}
			num2+=2;
		}
		num1+=2;
		num2=0;
	}
	for (int i = 0; i < array2D.length; i++) {
		for (int j = 0; j < array2D[i].length; j++) {
			System.out.print(array2D[i][j]+"\t");
		}System.out.println();
	}
}
}
