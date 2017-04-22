package hari03;

public class Soal04 {
	public static void main(String[] args) {
		int n= 9;
		int nT = (n-1)/2;
		int[] array = new int[n];
		
		for (int i = 0; i < array.length; i++) {
			if(i<=nT){
				if (i<3) {
					array[i]=1;
				}
				else {
					array[i]=array[i-3]+array[i-2]+array[i-1];
				}
			}
			else {
				array[i]=array[n-1-i];
			}
		}
		utility.Util.printArray1D(array);
	}
}
