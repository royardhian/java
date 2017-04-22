package hari02;

public class PostTest3 {
public static void main(String[] args) {
	int n=9;
	int num=0;
	int numOld=0;
	int numNew=1;
	int med=(n-1)/2;
	for (int i = 0; i < n; i++) {
		numOld=numNew;
		numNew=num;
		num=numOld+numNew;
		for (int j = 0; j < n; j++) {
			if(j==4||((i==j||i+j==n-1)&&i>med)){
				System.out.print(num+"\t");
			}
			else {
				System.out.print(" \t");
			}
		}System.out.println();
	}
}
}
