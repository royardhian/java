package hari02;

public class Soal5 {
public static void main(String[] args) {
	int num = 1;
	int n = 9;
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			if (i>=j) {
				System.out.print(num+"\t");
			}
			else {
				System.out.print(" \t");
			}
			num+=2;
		}System.out.println();
		num=1;
	}
}
}
