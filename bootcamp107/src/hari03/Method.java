package hari03;

public class Method {
	public static void main(String[] args) {
		cetakData();
		int bil1 = 10;
		int bil2 = 20;
		System.out.println("bagi\t: "+bagi(bil1, bil2));
		System.out.println("kali\t: "+kali(bil1, bil2));
		System.out.println("tambah\t: "+jumlah(bil1, bil2));
		System.out.println("kurang\t: "+kurang(bil1, bil2));
		System.out.println(namaLengkap());
	}

	public static void cetakData() {
		System.out.println("nama\t: Roy Ardhian Priambodo");
		System.out.println("Alamat\t: Jakarta");
		System.out.println("Hoby\t: Gaming");
		
		
	}

	public static String namaLengkap() {
		return "\n\ncreated by Roy Ardhian Priambodo";
	}

	public static int jmlGaji() {
		return 7000000;
	}

	public static double luarAlas() {
		return 1.5;
	}

	// parameter
	public static int kali(int a, int b) {
		return a * b;
	}

	public static int jumlah(int a, int b) {
		return a + b;
	}

	public static int bagi(int a, int b) {
		return a / b;
	}

	public static int kurang(int a, int b) {
		return a - b;
	}

}
