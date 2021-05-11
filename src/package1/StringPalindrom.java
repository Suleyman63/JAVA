package package1;

import java.util.Scanner;

public class StringPalindrom {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir string giriniz");
		String str = scan.nextLine().toLowerCase().replaceAll(" ", "");

		polindrom(str);

		scan.close();
	}

	private static void polindrom(String str) {

		String ters = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			ters = ters + str.charAt(i);

		}
		if (str.equals(ters)) {
			System.out.println("Polindrom");
		} else {
			System.out.println("Polindrom degil");
		}
	}

}
