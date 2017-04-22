package hari02;

public class Soal9 {
public static void main(String[] args) {
	int n=9;
	int num1=1;
	int num2=2*n-1;
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			if(j<=(n-1)/2){
				System.out.print(num1 + "\t");
				}
			else if (j>=(n-1)/2) {
				System.out.print(num2 + "\t");
				}
			else {
				System.out.print("\t");
			}
			num1+=2;
			num2-=2;
		}System.out.println("");
		num1=1;
		num2=2*n-1;
	}
}
}
