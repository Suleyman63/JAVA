package package1;

import java.util.Scanner;

public class CarpimTablosu {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 10 dan kucuk bir sayi giriniz");
		int sayi = scan.nextInt();

		for (int i=1; i<=sayi; i++) {

			for (int j=1; j<= sayi; j++) {

				System.out.print(i * j + " ");
			}
			System.out.println();

		}

		scan.close();
	}

}
