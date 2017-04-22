package hari02;

public class Soal05A {
public static void main(String[] args) {
	int n=9;
	int num=1;
	String[][] array2D= new String[n][n];
	
	for (int i = 0; i < array2D.length; i++) {
		for (int j = 0; j < array2D[i].length; j++) {
			if(i>=j){
				array2D[i][j]=num+"";
			}
			else {
				array2D[i][j]="";
			}
			num+=2;
		}num=1;
	}
	for (int i = 0; i < array2D.length; i++) {
		for (int j = 0; j < array2D[i].length; j++) {
			System.out.print(array2D[i][j]+"\t");
		}System.out.println();
	}
}
}
