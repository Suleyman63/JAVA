package package1;

import java.util.Scanner;

public class JavaClass5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 10 dan kucuk bir sayi giriniz");
		int sayi = scan.nextInt();

		for (int i = 1; i <= sayi; i++) {

			for (int k = 1; k <= sayi; k++) {

				System.out.print(i * k + " ");
			}
			System.out.println();

		}

		scan.close();
	}

}
