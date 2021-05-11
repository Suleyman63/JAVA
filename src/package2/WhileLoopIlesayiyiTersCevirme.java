package package2;

public class WhileLoopIlesayiyiTersCevirme {

	public static void main(String[] args) {
		

		
		int sayi=2937429;
		int temp=0;
		
		while(sayi!=0) {
			
			int basamak=sayi%10;
			sayi/=10;
			temp=temp * 10 + basamak;
		}
		System.out.println(temp);

	}

}
