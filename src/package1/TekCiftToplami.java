package package1;

import java.util.Scanner;

public class TekCiftToplami {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen sayilar giriniz ve cikmak istediginizde 0 a giriniz");

		int sayi;
		int tek = 0;
		int cift = 0;
		int sayac = 0;

		do {

			sayi = scan.nextInt();
			sayac++;

			if (sayi % 2 == 0) {
				cift += sayi;
			}
			if (sayi % 2 == 1) {
				tek += sayi;
			}
		} while (sayi != 0);

		System.out.println("tek sayilar toplami:" + tek);
		System.out.println("cift sayilar toplami:" + cift);
		System.out.println("Girdiginiz sayi adedi:" + sayac);

		scan.close();
	}

}
