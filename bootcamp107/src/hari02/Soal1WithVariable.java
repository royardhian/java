package hari02;

public class Soal1WithVariable {
public static void main(String[] args) {
	int n = 9;
	int num = 1;
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			if (i==j) {
				System.out.print(num+" ");
			}
			else {
				System.out.print("  ");
			}
		}System.out.println();
		num+=2;
	}
}
}
