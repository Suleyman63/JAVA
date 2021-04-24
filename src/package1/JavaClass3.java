package package1;

public class JavaClass3 {

	public static void main(String[] args) {

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
