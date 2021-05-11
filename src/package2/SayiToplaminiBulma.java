package package2;

import java.util.Scanner;

public class SayiToplaminiBulma {

	public static void main(String[] args) {
	

		Scanner scan=new Scanner(System.in);
		System.out.println("100 buyuk sayi giriniz");
		int sayi=scan.nextInt();
		
		int toplam=0;
		
		
		while(sayi>0) {
			
			toplam=sayi%10 + toplam;
			sayi/=10;
		}
		System.out.println(toplam);
		scan.close();
	}

}
