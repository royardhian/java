package hari03;

import utility.Deret;

public class Soal05 {
	public static void main(String[] args) {
		// insialiasasi besar dimensi
		int n = 9;
		// inisialisasi nilai tengah
		
		int[] array = Deret.fibonaci2(n);
		// inisialisasi array 2 D dengan tipe data String karena akan diisi
		// spasi
		String[][] array2D = new String[n][n];

		
		// membuat baris 2D
		for (int i = 0; i < array2D.length; i++) {
			// membuat kolom 2D
			for (int j = 0; j < array2D[i].length; j++) {
				// membuat pengecualian kondisi pada segitiga sisi kiri
				// dengan menggabungkan 2 buah bidang segitiga
				if (i > j && i + j < n - 1) {
					array2D[i][j] = "";
				}
				// mengisi bagian selain dari kondisi diatas
				else {
					array2D[i][j] = array[j] + "";
				}
			}
		}
		// mencetak hasil dengan memanggil fungsi pada class Util
		// dengan memasukan parameter array2D
		utility.Util.printArray2D(array2D);
	}
}
