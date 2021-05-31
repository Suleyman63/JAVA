package package2;

import java.util.Scanner;

public class HarfSay {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("bir cumle giriniz");
		String str = scan.nextLine();

		System.out.println("harf giriniz");
		char harf = scan.next().toLowerCase().charAt(0);

		int count = 0;

		for (int i = str.length() - 1; i >= 0; i--) {

			if (str.charAt(i) == harf) {
				count++;

			}
		}
		System.out.println(harf + " " + count);

		
		scan.close();
	}
}