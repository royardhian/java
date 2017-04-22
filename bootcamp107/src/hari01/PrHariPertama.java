package hari01;

public class PrHariPertama {
	public static void main(String[] args) {
		int n=9;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == i || i == (n-1)/2 || i + j == n-1) {
					System.out.print((2 * j + 1) + "\t");
				}

				else if (j == (n-1)/2) {
					System.out.print((2 * i + 1) + "\t");
				}

				else {
					System.out.print("\t");
				}
			}
			System.out.println();

		}
	}
}