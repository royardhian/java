package hari02;

public class PostTestArray {
public static void main(String[] args) {
	int n =9;
	int nT=(n-1)/2;
	int num = 1;
	int numOld=0;
	int numNew=1;
	String[][] array2D = new String[n][n];

	for (int i = 0; i < array2D.length; i++) {
		for (int j = 0; j < array2D[i].length; j++) {
			if(j==4||((i+j==n-1||i==j)&&i>nT)){
				array2D[i][j]=num+"";
			}
			else {
				array2D[i][j]="";
			}
		}
		num=numOld+numNew;
		numOld=numNew;
		numNew=num;
	}
	
	for (int i = 0; i < array2D.length; i++) {
		for (int j = 0; j < array2D[i].length; j++) {
			System.out.print(array2D[i][j] + "\t");
		}
		System.out.println();
	}
}

}
