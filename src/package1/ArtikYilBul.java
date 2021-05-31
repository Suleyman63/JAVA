package package1;

import java.util.Scanner;

public class ArtikYilBul {

	public static void main(String[] args) {
		

		Scanner scan=new Scanner(System.in);
		System.out.println("Bir yil giriniz");
		int yil=scan.nextInt();
		
		
		if(yil%4==0 && yil%100!=0) {
			System.out.println("artik yil");
		}
		else if(yil%4==0 && yil%100==0 && yil%400==0) {
			System.out.println("artik yil");
		}
		else {
			System.out.println("artik yil degil");
		}
		scan.close();
	}

}
