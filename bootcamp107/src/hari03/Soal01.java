package hari03;

import utility.Util;

public class Soal01 {
	public static void main(String[] args) {
		int n = 9;
		//deklarasi array
		int[] array = new int[n];
		//pengisian array dengan looping
		for (int i = 0; i < array.length; i++) {
			//buat kondisi jika 0 dan 1 diberi nilai 1
			if(i<2){
				array[i]=1;
			}
			//selebihnya maka akan dijumlahkan 2 angka sebelumnya
			else {
				array[i]=array[i-1]+array[i-2];
			}
		}
		
		Util.printArray1D(array);
	}
}
