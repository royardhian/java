package utility;

public class Util {
	public static void printArray1D(String[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + "\t");
		}
	}

	public static void printArray2D(String[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] == null)
					System.out.print("\t");
				else
					System.out.print(array[i][j] + "\t");
			}
			System.out.println("\n");
		}
	}

	public static void printArray1D(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
	}

	public static void printArray2D(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] == 0)
					System.out.print("\t");
				else
					System.out.print(array[i][j] + "\n");
			}
			System.out.println("\n\n");
		}
	}
}
