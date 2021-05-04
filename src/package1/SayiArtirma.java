package package1;

import java.util.Scanner;

public class SayiArtirma {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("1. Sayiyi giriniz");
		int sayi1 = scan.nextInt();

		System.out.println("2. Sayiyi giriniz");
		int sayi2 = scan.nextInt();
		
		scan.close();

		for (; sayi1 < sayi2;) {
			sayi1 += sayi1;

		}
		System.out.println(sayi1);

		
	}

}
