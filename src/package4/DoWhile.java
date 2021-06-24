package package4;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("sayi tahmin oyununa geldiniz");

		int sayi = 1, poz = 0, neg = 0, top = 0;
		
		scan.close();

		do {
			System.out.println("sayi tahmin oyunu icin pozitif bir sayi giriniz");
			sayi = scan.nextInt();

			if (sayi > 0) {
				poz++;
				top += sayi;

			}
			if (sayi < 0) {
				neg++;

				System.out.println("negatif sayi giremezsiniz");
			}

		} while (sayi != 0);

		System.out.println(top +" "+ "toplam");
		System.out.println(neg +" "+ "negatif adedi");
		System.out.println(poz +" "+ "pozitif sayi adedi");

	}

}
