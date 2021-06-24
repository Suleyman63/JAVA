package package4;

import java.util.Scanner;

public class Metotlar {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir string giriniz");
		String str = scan.nextLine().toLowerCase();

		System.out.println(abc(str));

		scan.close();

	}

	public static boolean abc(String str1) {

		if (str1.contains("abc")) {
			return true;
		} else {
			return false;
		}

	}

}
