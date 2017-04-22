package hari02;

public class Soal9FastMode {
public static void main(String[] args) {
	int n=9;
	int num=1;
	int nt=(n-1)/2;
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			System.out.print(num+"\t");
			if(j<nt){
				num+=2;
			}else {
				num-=2;
			}
		}System.out.println();
		num=1;
	}
}
}
