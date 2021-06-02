package package3;

import java.util.Scanner;

public class TersPramit {

	public static void main(String[] args) {
		

		
		Scanner scan=new Scanner(System.in);
		System.out.println("Ters pramit icin sayi girin");
		int sayi=scan.nextInt();
		
		
		for(int i=sayi; i>1; i--) {
			for(int j=1; j<i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		scan.close();
	}

}
