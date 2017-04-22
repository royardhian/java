package hari03;

public class Soal02D {
	public static void main(String[] args) {
		int n = 9;
		int[] array= new int[n];
		
		for (int i = 0; i < array.length; i++) {
			if (i<3) {
				array[i]=1;
			}
			else {
				array[i]=array[i-3]+array[i-2]+array[i-1];
			}
		}
		utility.Util.printArray1D(array);
	}
}
