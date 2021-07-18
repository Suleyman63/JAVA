package package5;

import java.util.Scanner;

public class SayiTop {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen uc basamakli bir sayi giriniz");
		int sayi = scan.nextInt();

		
		int yuz, on, bir;
		
		yuz=sayi/100; on=sayi/10%10; bir=sayi%10;
		
		System.out.println("sayilar toplami = " + (yuz+on+bir));
		scan.close();
	}

}
