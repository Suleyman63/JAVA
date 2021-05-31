package package2;

import java.util.Scanner;

public class TryException {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("2 adet tam sayi giriniz");
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();

		try {
			System.out.println(sayi1 / sayi2);

		} catch (ArithmeticException e) {
			System.out.println("sayiyi 0 a bolemezsin");
		}

		scan.close();
	}

}
