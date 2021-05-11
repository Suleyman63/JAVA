package package1;

import java.util.Scanner;

public class MutlakDeger {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		int sayi = scan.nextInt();

		if (sayi > 0) {
			System.out.println(sayi);
		} else if (sayi < 0) {
			System.out.println(sayi * -1);
		} else {
			System.out.println("0 Degeri giremezsiniz");
		}
		scan.close();

	}

}
