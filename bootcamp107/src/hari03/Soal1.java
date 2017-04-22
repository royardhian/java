package hari03;

public class Soal1 {
	public static void main(String[] args) {
		int[] dim;
		int n= 9;
		int oldNum= 0;
		int newNum= 1;
		int showNum = 1;
		dim = new int[n];

		for (int i = 0; i < n; i++) {
			dim[i]=showNum;
			System.out.print(dim[i]+"\t");
			showNum=newNum+oldNum;
			oldNum=newNum;
			newNum=showNum;
			
		}
		System.out.println();
	}
}
