package package4;

import java.util.Scanner;

public class AmstrongSayi {

	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		System.out.println("3 haneli bir sayi giriniz");
		int sayi = scan.nextInt();
		
		int sonuc = 0;
		
		for(int i=100; i<1000; i++) {
			

		}
		
			int bir=sayi%10;
			int on=(sayi%100)/10;
			int yuz=sayi/100;
		
			sonuc = (int) (Math.pow(bir, 3) + Math.pow(on, 3) + Math.pow(yuz, 3));
			
				
			if(sayi==sonuc) {
				System.out.println("Amstrong sayi");
			}
			else {
				System.out.println("Amstrong sayi degil");
			
		}
			scan.close();
	}

}