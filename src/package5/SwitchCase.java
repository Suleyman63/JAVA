package package5;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen harflerden birini seciniz : \nA \nB \nC");
		System.out.println("=====================");
		char secenek = scan.next().toUpperCase().charAt(0);
		
		
		
		switch(secenek) {
		case 'A' :
			System.out.println("java kolay");
			break;
		case 'B' :
			System.out.println("java zor");
			break;
		case 'C' :
			System.out.println("java eglenceli");
			break;
			default:
				System.out.println("Gecerli bir secim yapiniz");
			
		}
		scan.close();
		
	}

}
