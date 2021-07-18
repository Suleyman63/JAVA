package package4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class KullaniciAdiOlusturma {

	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
        System.out.println("Kullanici adi giriniz");
        String userName = scan.nextLine().trim();
        
        
        
        List<String> veriTabanindakiKullanicilar = new ArrayList<>();
        
        veriTabanindakiKullanicilar.add("Ayse");
        veriTabanindakiKullanicilar.add("Ahmet");
        veriTabanindakiKullanicilar.add("Hasan");
        veriTabanindakiKullanicilar.add("Ali");
        veriTabanindakiKullanicilar.add("Mehmet");
        veriTabanindakiKullanicilar.add("Derya");
        
        boolean ad = veriTabanindakiKullanicilar.contains(userName);
        
        if(ad) {
        	System.out.println("bu ismi kullanamzasiniz");
        }
        else {
        	System.out.println("bu ismi kullanabilirsiniz");
        }
        
        if(ad) {
        	int rastgeleSayi = new Random().nextInt(100000);
            userName = userName + ""+rastgeleSayi;
            System.out.println("kullanici adi:" + userName);
        }else {
            System.out.println("kullanici adi : " + userName);
        }
        scan.close();
        }

}
