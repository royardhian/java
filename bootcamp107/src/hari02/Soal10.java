package hari02;

public class Soal10 {
public static void main(String[] args) {
	int n=9;
	int num1=0;
	int num2=(n-1)*2;
	int nt = (n-1)/2;
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			if (i<=nt) {
				System.out.print(num1+"\t");
			}
			else if (i>=nt) {
				System.out.print(num2+"\t");
			}
			else {
				System.out.print(" \t");
			}
		}System.out.println();
		num1+=2;
		num2-=2;
	}
}
}
