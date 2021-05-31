package package2;

import java.util.Scanner;

public class Pramit {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Pramitin yuksekligini giriniz");
		int sayi = scan.nextInt();

		int bosluk = 1;

		for (int i = 1; i <= sayi; i++) {
			for (int j = i; j < 10; j++) {
				System.out.print(" ");

			}
			for (int k = 1; k <= bosluk; k++) {
				if (k % 2 == 0) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
			bosluk = bosluk + 2;

		}
		scan.close();

	}

}
