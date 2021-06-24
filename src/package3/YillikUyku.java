package package3;

import java.util.Scanner;

public class YillikUyku {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("gunluk uyku surenizi giriniz");
		double uyku = scan.nextDouble();
		
		double ay = (uyku*30)/24;
		double yil = (uyku*365)/24;
		
		System.out.println("aylik : " + ay + "\n" + "yillik :" + yil);
		
		scan.close();
	}

}
