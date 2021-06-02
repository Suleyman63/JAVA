package package3;

import java.util.Scanner;

public class MukemmelSayi {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		int sayi = scan.nextInt();

		
		
		scan.close();
		mukemmelSayi(sayi);

	}

	public static void mukemmelSayi(int sayi) {

		int toplam = 0;

		for (int i = 1; i < sayi; i++) {

			if (sayi % i == 0) {
				toplam = toplam + i;

			}

		}
		if (sayi == toplam) {
			System.out.println(sayi +" " + "Mukkemel sayi");
		} else {
			System.out.println(sayi +" " + "Mukemmel sayi degil");

		}
	}

}
