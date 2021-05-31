package package2;

import java.util.Scanner;

public class Fibbonaci {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen pozitif bir tam sayi giriniz");
		int sayi = scan.nextInt();

		int sayi1 = 1;
		int sayi2 = 1;
		int sayi3;

		System.out.print(sayi1 + " " + sayi2);

		for (int i = 2; i < sayi; i++) {

			sayi3 = sayi1 + sayi2;
			sayi1 = sayi2;
			sayi2 = sayi3;

			System.out.print(" " + sayi3);

		}
		scan.close();

	}

}
