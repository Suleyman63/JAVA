package package3;

import java.util.Scanner;

public class DortIslem {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen yapmak istediginiz islemi seciniz..."
				+ "\n1.Toplama...\n2.Cikarma...\n3.Carpma...\n4.Bolme...");
		int secim = scan.nextInt();

		System.out.println("Lutfen 2 adet sayi giriniz");
		double sayi1 = scan.nextDouble();
		double sayi2 = scan.nextDouble();

		if (secim == 1) {
			System.out.println(sayi1 + sayi2);
		} else if (secim == 2) {
			System.out.println(sayi1 - sayi2);

		} else if (secim == 3) {
			System.out.println(sayi1 * sayi2);
		} else if (secim == 4) {
			System.out.println(sayi1 / sayi2);

		} else {
			System.out.println("Yanlis islem yaptiniz");
		}
		scan.close();
	}
}
