package package3;

import java.util.Scanner;

public class StrinYazdirma {

	public static void main(String[] args) {
		
		
		//Bir string verildiğinde, 0,1, 4,5, 8,9 dizinlerindeki 
		//karakterlerden oluşan bir string yazdiralim
		// ornegin java =>> ja
		//hayat=>> hat
		// harita=>> hata 
		
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("dokuz rakamli bir isim giriniz");
		String str=scan.nextLine().toLowerCase();
		
		
		System.out.println( (str.charAt(0)) +" "+ (str.charAt(1))  +" "+ (str.charAt(4))  +" "+ (str.charAt(5)) +" "+ (str.charAt(8)) +" "+ (str.charAt(9)));
		
		
		scan.close();
		
		}
		
	}

