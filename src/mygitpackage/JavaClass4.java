package mygitpackage;

public class JavaClass4 {

	public static void main(String[] args) {
		
		int sayi = 1234, tersi = 0;
        int yedek=sayi;
 
        while(sayi != 0) {
            int basamak = sayi % 10; tersi = tersi * 10 + basamak; sayi /= 10;
        }
        System.out.println("Sayı     : " + yedek);
        System.out.println("Sayının Tersi: " + tersi);
        

	}

}
