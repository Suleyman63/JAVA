package package1;

public class StringIcindeHarfSayma {

	public static void main(String[] args) {

		String str = "Java cok guzel java adamdir";
		char harf = 'a';
		int sayac = 0;

		for (int i = 0; i < str.length(); i++) {

			if (harf == str.charAt(i)) {
				sayac++;

			}
		}

		System.out.println("String icinde a harfi" + " " + sayac + " " + " defa kullanilmistir");
	}

}
