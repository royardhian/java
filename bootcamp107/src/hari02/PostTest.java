package hari02;

public class PostTest {
	public static void main(String[] args) {
		int n = 9;
		int num = 1;
		int numO = 1;
		int numN = 0;
		int nt = (n - 1) / 2;
		for (int i = 0; i < n; i++) {
			num = numO + numN;
			numO = numN;
			numN = num;
			for (int j = 0; j < n; j++) {
				if (j == 4 || ((i == j || i + j == 8) && i >= nt)) {
					System.out.print(num + "\t");
				} else {
					System.out.print(" \t");
				}
			}
			System.out.println();

		}
	}
}
