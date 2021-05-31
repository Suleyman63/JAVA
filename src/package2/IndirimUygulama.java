package package2;

import java.util.Scanner;

public class IndirimUygulama {

	public static void main(String[] args) {

		/*
		 * SORU 1
		 * 
		 * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
		 * musteri karti olup olmadigini sorun
		 * 
		 * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
		 * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az alirsa %10
		 * indirim yapin
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Urun adedi giriniz");
		int adet = scan.nextInt();

		System.out.println("Musteri kartiniz varsa E' ye yoksa H' ye basiniz");
		char kart = scan.next().toUpperCase().charAt(0);

		System.out.println("Aldiginiz urunun fiyatini giriniz");
		double fiyat = scan.nextDouble();
		double topFiyat;

		if (kart == 'E' && adet > 10) {

			fiyat = adet * 0.80;
			topFiyat=fiyat*adet;
			System.out.println(topFiyat);

		} else if (kart == 'E' && adet < 10) {

			fiyat = adet * 0.85;
			topFiyat=fiyat*adet;
			System.out.println(topFiyat);
		} 
		else if (kart == 'H' && adet > 10) {

			fiyat = adet * 0.85;
			topFiyat=fiyat*adet;
			System.out.println(topFiyat);

		} 
		else if (kart == 'H' && adet < 10) {

			fiyat = adet * 0.90;
			topFiyat=fiyat*adet;
			System.out.println(topFiyat);
		}
		scan.close();

	}

}
