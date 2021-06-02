package package2;

import java.util.Scanner;

public class KartBilgisiGir {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Adinizi giriniz");
		String isim = scan.nextLine();

		System.out.println("Soyisminiz giriniz");
		String soyisim = scan.nextLine();

		System.out.println("Kart no giriniz");
		String kartno = scan.nextLine();

		if (kartno.length() == 16) {
			isim = isim.substring(0, 1).toUpperCase() + isim.substring(1).replaceAll("\\w", "*");
			soyisim = soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1).replaceAll("\\w", "*");
			kartno = ("**** **** ****") + kartno.substring(kartno.length() - 4);
		} else {
			System.out.println("Gecerli bir kart no giriniz");
		}
		System.out.println(isim + " " + soyisim + "  " + kartno);

		scan.close();
	}

}
