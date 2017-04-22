package hari02;

public class Soal8 {
public static void main(String[] args) {
	int n=9;
	int num1=1;
	int num2=0;
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			if (i>j&&i+j<8) {
				System.out.print("A\t");
			}
			else if (i<j&&i+j>8) {
				System.out.print("B\t");
			}
			else if (i==j) {
				System.out.print(num1+"\t");
			}
			else if (i+j==8) {
				System.out.print(num2+"\t");
			}
			else {
				System.out.print(" \t");
			}
			num1+=2;
			num2+=2;
		}System.out.println();
		num1=1;
		num2=0;
	}
}
}
