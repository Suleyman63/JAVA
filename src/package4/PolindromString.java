package package4;

import java.util.Scanner;

public class PolindromString {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("bir string giriniz");
		String str = scan.nextLine();

		String ters = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			ters += str.charAt(i);

		}
		if (ters.equals(str)) {
			System.out.println("polindrom");
		} else {
			System.out.println("polindrom degil");
		}
		scan.close();

	}

}
