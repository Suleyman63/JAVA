package package1;

import java.util.Scanner;

public class Faktoryel {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir tam sayi giriniz");
		int sayi=scan.nextInt();
		
		int faktoryel=1;
		for(int i=1; i<=sayi; i++){
		
		faktoryel=faktoryel*i;
			
		
		}
			System.out.println(faktoryel);
			
			scan.close();
	}

}
