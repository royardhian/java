package hari02;

public class PostTest2 {
public static void main(String[] args) {
	int n = 9;
	int num = 0;
	int numN = 1;
	int numO = 0;
	int nt = (n-1)/2;
	
	for (int i = 0; i < n; i++) {
		numO = numN;
		numN = num;
		num = numN+numO;
		for (int j = 0; j < n; j++) {
			if (j==nt || ((i==j)||(i+j==n-1))&&i>nt) {
				System.out.print(num+"\t");
			}
			else {
				System.out.print(" \t");
			}
		}System.out.println();
	}
}
}
