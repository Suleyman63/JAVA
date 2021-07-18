package package4;

import java.util.Scanner;

public class MaasZam {

	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		
		System.out.println("lutfen calisma yilinizi giriniz");
		int yil=scan.nextInt();
		
		System.out.println("Lutfen maas miktarinizi giriniz");
		int maas=scan.nextInt();
		
		if(yil>=5) {
			System.out.println("yeni maas =" + (maas*0.05) + maas);
		}
		else {
			System.out.println("zam yok");
		}
		scan.close();

	}

}
