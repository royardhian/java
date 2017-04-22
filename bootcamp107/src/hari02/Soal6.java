package hari02;

public class Soal6 {
public static void main(String[] args) {
	int n=9;
	int num=16;
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			if (i+j>=8) {
				System.out.print(num+"\t");
			}
			else {
				System.out.print(" \t");
			}
		}System.out.println();
		num-=2;
	}
}
}
