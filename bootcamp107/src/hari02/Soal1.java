package hari02;

public class Soal1 {
	public static void main(String[] args) {
		int n =9;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i==j){
					System.out.print(2*j+1+" ");
				}
				else {
					System.out.print("  ");
				}
			}System.out.println();
		}
	}
}
