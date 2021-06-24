package package3;

import java.util.Scanner;

public class FiyatTernary {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Urun fiayti giriniz");
		int fiyat = scan.nextInt();

		String sonuc = (fiyat >= 1 && fiyat < 10) ? "ucuz" : fiyat < 20 ? "normal" : "pahali";

		System.out.println(sonuc);
		
		scan.close();

	}

}
