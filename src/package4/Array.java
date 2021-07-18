package package4;

import java.util.Scanner;

public class Array {
	
	public static void main(String[] args) {
	
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Array uzunlugunu giriniz");
		int arrLen = scan.nextInt();
		
		
		int arr [] = new int [arrLen];
	
		
		System.out.println("Array elemanlarini giriniz");
		
		for(int i=0; i<arrLen; i++) {
			
			arr[i] = scan.nextInt();
			
			
			arrTop(arr);
			scan.close();
		}
	}
	public static void arrTop(int[] arr) {
	

		int top = 0;
		
		for(int each : arr) {
			
			top+= each;
		}
		System.out.println(top);
		
	}

}
