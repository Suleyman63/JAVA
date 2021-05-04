package package2;

import java.util.Scanner;

public class WhileIleSayiyiTersCevirme {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen pozitif bir sayi giriniz");
		int sayi = scan.nextInt();

		while (sayi > 0) {

			System.out.print(sayi % 10);

			sayi /= 10;

		}
		scan.close();

	}

}
