package package3;

import java.util.Scanner;

public class StrinYaz2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir kelime giriniz");
		String str = scan.next();

		if (str.length() > 3) {

			System.out.println((str.substring(str.length() - 2)) + (str.substring(str.length() - 2))
					+ (str.substring(str.length() - 2)));

		} else {
			System.out.println(str);
		}
		scan.close();
	}
}