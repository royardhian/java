package hari01;

//soal 1 bikin miring dari pojok atas kiri ke pojok kanan bawah

public class Soal1 {
	public static void main(String[] args) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if(i==j){
					System.out.print("*");
				}
				else{
					System.out.print("  ");
				}
			}System.out.println();
		}
	}
}
