package package3;

import java.util.Scanner;

public class Vki {

	public static void main(String[] args) {
		

		Scanner scan=new Scanner(System.in);
		System.out.println("boyunuzu giriniz");
		double boy=scan.nextDouble();
		System.out.println("kilonuzu giriniz");
		double kilo=scan.nextDouble();
		
		
		double vke=boy/(kilo*kilo);
		
		System.out.println("VKE=" + vke);
		
		scan.close();
	}

}
