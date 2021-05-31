package package2;

import java.util.Scanner;

public class StringYazdirma {

	public static void main(String[] args) {

		// bir string alalim string 3 karakterden fazla ise ilk 3karakteri kullanicinin
		// istedigi kadar yan yana yazdiralim 3 den az ise
		// yine kullanicinin istedigi kadar yan yana yazdiralim (for ile)
		// java 5 tekrar=>javjavjavjavjav
		// run 2 tekra=> runrun
		// al 4 tekrar => alalalal

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir string giriniz");
		String str = scan.nextLine();

		if (str.length() >= 3) {
			for (int i = 0; i < str.length(); i++) {

				System.out.print(str.substring(0, 3));
			}
		} else if (str.length() < 3) {
			for (int i = 0; i < str.length(); i++) {

				System.out.print(str);
			}
		}
		scan.close();
	}

}
