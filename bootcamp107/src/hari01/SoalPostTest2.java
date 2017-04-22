package hari01;

public class SoalPostTest2 {
public static void main(String[] args) {
int n = 9;
int nt = (n-1)/2;
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			if (((i==j||i+j==n-1) && i >= nt) || j==4) {
				System.out.print("* ");
			}
			else {
				System.out.print("  ");
			}
		}System.out.println();
	}
}
}
