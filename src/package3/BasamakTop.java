package package3;

import java.util.Scanner;

public class BasamakTop {

	public static void main(String[] args) {
		

		Scanner scan=new Scanner(System.in);
		System.out.println("dort basamakli sayi giriniz");
		int sayi=scan.nextInt();
		
		int birler = sayi%10;
		int onlar = (sayi/100)%10;
		int yuzler = (sayi/10)%10;
		int binler = sayi/1000;
		
		System.out.println(birler+onlar+yuzler+binler);

		scan.close();
	}

}
