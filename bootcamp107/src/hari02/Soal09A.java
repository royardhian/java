package hari02;

public class Soal09A {
	public static void main(String[] args) {
		int n = 9;
		int nT = (n - 1) / 2;
		int num = 1;
		String[][] array2D = new String[n][n];

		for (int i = 0; i < array2D.length; i++) {
			for (int j = 0; j < array2D[i].length; j++) {
				array2D[i][j] = num + "";
				if (j < nT) {
					num += 2;
				} else {
					num -= 2;
				}
				
			}num=1;
		}

		for (int i = 0; i < array2D.length; i++) {
			for (int j = 0; j < array2D[i].length; j++) {
				System.out.print(array2D[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
