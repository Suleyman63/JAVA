package package3;

import java.util.Scanner;

public class YarimPramit {

	public static void main(String[] args) {
		

		Scanner scan=new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		int sayi=scan.nextInt();
		
		scan.close();
		
		yarimPramit(sayi);

	}
	public static void yarimPramit(int sayi) {
		
		for(int i=1; i<sayi; i++) {
			for(int j=1; j<i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	
		
	}

}
