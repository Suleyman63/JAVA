package package1;

public class StringTersCevirme {

	public static void main(String[] args) {

		StringBuilder str = new StringBuilder("Kenan");
		str.reverse();

		System.out.println(str);

	
//====================================================//
		
		
		String a = "java";
		String cevrilen = cevir(a);
		System.out.println(cevrilen);

	}

	private static String cevir(String a) {

		if (a.isEmpty())
			return a;

		return cevir(a.substring(1)) + a.charAt(0);

	}
}
