package utility;

public class Deret {
	public static int[] fibonaci(int n) {
		// deklarasi array
		int[] array = new int[n];
		// pengisian array dengan looping
		for (int i = 0; i < array.length; i++) {
			// buat kondisi jika 0 dan 1 diberi nilai 1
			if (i < 2) {
				array[i] = 1;
			}
			// selebihnya maka akan dijumlahkan 2 angka sebelumnya
			else {
				array[i] = array[i - 1] + array[i - 2];
			}
		}
		return array;
	}

	public static int[] fibonaci2(int x) {
		int nT = (x - 1) / 2;
		int[] array1D = new int[x];

		for (int i = 0; i < array1D.length; i++) {
			if (i <= nT) {
				if (i < 2) {
					array1D[i] = 1;
				} else {
					array1D[i] = array1D[i - 2] + array1D[i - 1];
				}
			} else {
				array1D[i] = array1D[x - 1 - i];
			}
		}
		return array1D;
	}
	
	public static String[] deretHuruf(){
		String[] array = {"A","B","C","D","E","F","G","H"
							,"I","J","K","L","M","N","N","O"
							,"P","Q","R","S","T","U","V","W"
							,"X","Y","Z"};
		/*for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]+" ");
		}*/
		return array;
		
	}
}
