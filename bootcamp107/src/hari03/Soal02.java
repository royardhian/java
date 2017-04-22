package hari03;

public class Soal02 {
	public static void main(String[] args) {
		int n = 9;
		int[] array = new int[n];

		for (int i = 0; i < array.length; i++) {
			if (i < 3) {
				array[i] = 1;
			} else {
				array[i] = array[i - 1] + array[i - 2] + array[i - 3];
			}
		}
		utility.Util.printArray1D(array);
	}
}
