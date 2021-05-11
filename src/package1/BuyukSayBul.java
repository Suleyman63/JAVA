package package1;

import java.util.Scanner;

public class BuyukSayBul {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("1. sayiyi giriniz");
		int sayi1 = scan.nextInt();

		System.out.println("2. sayiyi giriniz");
		int sayi2 = scan.nextInt();

		System.out.println("3. sayiyi giriniz");
		int sayi3 = scan.nextInt();

		if (sayi1 > sayi2 && sayi1 > sayi3) {
			System.out.println(sayi1 + "buyuktur");

		}
		if (sayi2 > sayi1 && sayi2 > sayi3) {
			System.out.println(sayi2 + "buyuktur");

		}
		else {
			System.out.println(sayi3 + "buyuktur");

		}
		scan.close();
	}
	
}