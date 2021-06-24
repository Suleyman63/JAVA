package package4;

import java.util.Scanner;

public class StringMetod {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir String giriniz");
		String str = scan.nextLine();
		System.out.println("Lutfen bir sayi giriniz");
		int sayi = scan.nextInt();

		System.out.println(ilkson(str, sayi));
		
		scan.close();

	}

	public static String ilkson(String str1, int sayi1) {

		String a = str1.substring(0, 1) + str1.substring(str1.length() - 1);

		String b = "";

		for (int i = 1; i <= sayi1; i++) {

			b = b + a;
		}

		return b;

	}

}
