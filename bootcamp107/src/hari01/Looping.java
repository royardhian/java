package hari01;

public class Looping {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}

		for (int i = 0; i < 10; i++) {
			System.out.print(i);
		}

		System.out.println("kotak bilangan");
		// looping baris
		for (int i = 0; i < 10; i++) {
			// setiap satu baris, looping kotak kesamping
			for (int j = 0; j < 10; j++) {
				System.out.print("{" + i + "," + j + "}  ");
			}
			// selesai kesamping maka pinfah baris
			System.out.print("\n");
		}
	}
}
