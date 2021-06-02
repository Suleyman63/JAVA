package package3;

import java.util.Scanner;

public class AmstrongSayi {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("uc basamakli sayi giriniz");
		int sayi = scan.nextInt();

		int yuzler, onlar, birler, toplam;

		for (int i = 100; i < 1000; i++) {

			yuzler = sayi / 100;
			onlar = (sayi % 100) / 10;
			birler = sayi % 10;

			toplam = (int) (Math.pow(yuzler, 3) + Math.pow(onlar, 3) + Math.pow(birler, 3));

			if (sayi == toplam) {
				System.out.println(toplam + "Amstrong sayidir");

			} else {
				System.out.println("Amstrong sayi degil");
			}

		}
		scan.close();
	}
}