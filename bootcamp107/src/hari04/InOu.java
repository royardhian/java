package hari04;

import java.util.Scanner;

public class InOu {

	protected static Scanner scn;

	public static void main(String[] args) {
		scn = new Scanner(System.in);

		System.out.print("Masukkan nama\t: ");
		String nama = scn.nextLine();
		System.out.print("Masukkan umur\t: ");
		int n = scn.nextInt();
		
		System.out.println("\nNama \t: " + nama);
		System.out.println("Umur \t: " + n);

	}
}
