package hari03;

public class Soal03A {
public static void main(String[] args) {
	int n=9;
	int nT=(n-1)/2;
	int cad=nT-2;
	int[] array = new int[n];
	
	for (int i = 0; i < array.length; i++) {
		if(i<2||i==array.length-1){
			array[i]=1;
		}
		else if(i<=nT){
			array[i]=array[i-2]+array[i-1];
		}
		else {
			array[i]=array[i-1]-array[cad];
			cad--;
		}

	}
	utility.Util.printArray1D(array);
}
}
