package hari03;


public class Array2D {
	public static void main(String[] args) {
		String[][] array2D = new String[3][5];
		// cara mengisi
		array2D[0][0] = "*";
		array2D[0][1] = "*";
		array2D[0][2] = "*";
		array2D[0][3] = "*";
		array2D[0][4] = "*";

		array2D[1][0] = "*";
		array2D[1][1] = "*";
		array2D[1][2] = "*";
		array2D[1][3] = "*";
		array2D[1][4] = "*";

		array2D[2][0] = "*";
		array2D[2][1] = "*";
		array2D[2][2] = "*";
		array2D[2][3] = "*";
		array2D[2][4] = "*";
		// replace or rewrite data
		array2D[0][0] = "A";
		array2D[0][1] = "B";
		array2D[0][2] = "C";
		array2D[0][3] = "D";
		array2D[0][4] = "E";

		array2D[1][0] = "F";
		array2D[1][1] = "G";
		array2D[1][2] = "H";
		array2D[1][3] = "I";
		array2D[1][4] = "J";

		System.out.print(array2D[0][0]);
		System.out.print(array2D[0][1]);
		System.out.print(array2D[0][2]);
		System.out.print(array2D[0][3]);
		System.out.print(array2D[0][4]);
		System.out.println();

		System.out.print(array2D[1][0]);
		System.out.print(array2D[1][1]);
		System.out.print(array2D[1][2]);
		System.out.print(array2D[1][3]);
		System.out.print(array2D[1][4]);
		System.out.println();

		System.out.print(array2D[2][0]);
		System.out.print(array2D[2][1]);
		System.out.print(array2D[2][2]);
		System.out.print(array2D[2][3]);
		System.out.print(array2D[2][4]);
		System.out.println();
		
		for (int i = 0; i < array2D.length; i++) {
			for (int j = 0; j < array2D[i].length; j++) {
				System.out.print(array2D[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
