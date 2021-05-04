package package1;

import java.util.Scanner;

public class SifreSorgula {

	public static void main(String[] args) {

		// kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki sartlara
		// gore kontrol edin ve sifredeki hatalari yazdirin.
		// Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve gecerli
		// sifre girdiginde “Sifreniz Kabul edilmistir” yazdirin.

		// - Sifre kucuk harf icermelidir
		// - Sifre buyuk harf icermelidir
		// - Sifre ozel karakter icermelidir
		// - Sifre en az 8 karakter olmalidir.

		Scanner scan = new Scanner(System.in);
		String sifre = "";
		int sonuc = 0;

		do {

			System.out.println("Lutfen bir sifre giriniz");
			sifre = scan.nextLine();

			sonuc = kucukHarfVarMi(sifre) + buyukHarfVarMi(sifre) + ozelKarekterVarMi(sifre) + uzunlukUygunMu(sifre);

		} while (sonuc != 4);

		System.out.println("Sifreniz basari ile kaydedildi");

		scan.close();

	}

	private static int buyukHarfVarMi(String sifre) {
		int flagbuyuk = 0;
		int index = 0;

		while (index < sifre.length()) {
			if (sifre.charAt(index) >= 'A' && (sifre.charAt(index) <= 'Z')) {
				flagbuyuk = 1;
			}
			index++;
		}
		if (flagbuyuk == 0) {
			System.out.println("Sifre buyuk harf icermelidir");
		}

		return flagbuyuk;
	}

	private static int ozelKarekterVarMi(String sifre) {
		int flagkarakter = 0;
		int index = 0;

		while (index < sifre.length()) {
			if (sifre.charAt(index) >= ' ' && (sifre.charAt(index) <= '/')) {
				flagkarakter = 1;
			}
			index++;
		}
		if (flagkarakter == 0) {
			System.out.println("Sifreniz ozel karakter icermelidir");
		}

		return flagkarakter;
	}

	public static int uzunlukUygunMu(String sifre) {
		int sonucuzunluk = 0;
		if (sifre.length() < 8) {
			System.out.println("Lutfen 8 haneli sifre girin");
		} else {
			sonucuzunluk = 1;
		}
		return sonucuzunluk;
	}

	public static int kucukHarfVarMi(String sifre) {
		int flagkucuk = 0;
		int index = 0;

		while (index < sifre.length()) {
			if (sifre.charAt(index) >= 'a' && (sifre.charAt(index) <= 'z')) {
				flagkucuk = 1;
			}
			index++;
		}
		if (flagkucuk == 0) {
			System.out.println("Sifre kucuk harf icermelidir");
		}

		return flagkucuk;

	}

}
