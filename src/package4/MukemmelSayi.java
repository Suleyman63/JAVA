package package4;

import java.util.Scanner;

public class MukemmelSayi {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		int sayi = scan.nextInt();

		mukemmelsayi(sayi);
		
		scan.close();
	
	}
	public static void mukemmelsayi(int sayi) {

		int top = 0;

		for (int i = 1; i < sayi; i++) {

			if (sayi % i == 0) {
				top += i;
			}

			if (sayi == top) {
				System.out.println(sayi + "mukemmel sayidir");
			} else {
				System.out.println(sayi + "mukemmel degil");
			}
		}

	}

}
