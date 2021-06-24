package package3;

import java.util.Scanner;

public class NotHesaplama {

	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		System.out.println("vize notunuzu giriniz");
		double vize = scan.nextDouble();
		
		System.out.println("final notunuzu giriniz");
		double finall = scan.nextDouble();
		
		System.out.println("proje notunuzu giriniz");
		double proje = scan.nextDouble();
		
		
		double not=(vize*0.3)+(finall*0.5)+(proje*0.2);
		System.out.println("Not ortalamaniz: " + not);
		scan.close();

	}

}
