package mygitpackage;

public class JavaClass2 {

	public static void main(String[] args) {
		
/*
		String isim="Kenan";
		
		for(int i=isim.length()-1; i>=0; i--) {
			
			System.out.print(isim.charAt(i));
			
			
*/			
			//StringBuilder str=new StringBuilder("Kenan");
			//str.reverse();
			
			//System.out.println(str);
	
		
		
		String str="Kenan";
		String cevrilen=cevir(str);
		System.out.println(cevrilen);
		
		
	}

	private static String cevir(String str) {
		
		
		if(str.isEmpty())
			return str;
		

	

return cevir(str.substring(1) + str.charAt(0));
	
	}
	}
	

