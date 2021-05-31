package package2;

import java.util.Scanner;

public class SayiBasBol {

	public static void main(String[] args) {
		

		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen 4 haneli bir sayi giriniz");
		int sayi = scan.nextInt();
		
		
		int bin=sayi/1000;
		int yuz=(sayi/100)%10;
		int on=(sayi/10)%10;
		int bir=sayi%10;
		System.out.println(bin+", "+yuz+", "+on+", "+bir);
		System.out.println(bir+on+yuz+bin);

		
		scan.close();
	}

}
