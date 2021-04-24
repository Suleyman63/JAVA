package package1;

public class JavaClass9 {
	
	
	public static void main(String[] args) {
		
		
		int sayi=12345;
		int tersi=0;
		
		for(; sayi !=0; sayi/=10) {
		
			int basamak = sayi%10;
			tersi= tersi*10 + basamak;
		}
		
		System.out.println(tersi);
		
	}

}
