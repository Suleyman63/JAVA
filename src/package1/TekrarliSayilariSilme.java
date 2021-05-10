package package1;

public class TekrarliSayilariSilme {

	public static void main(String[] args) {

		int[] sayilar = { 2, 3, 4, 5, 2, 6, 7, 6, 8, 5, 9 };

		int[] sayi = new int[11];

		for (int i = 0; i < sayilar.length; i++) {

			sayi[sayilar[i] - 1]++;

			if (sayi[sayilar[i] - 1] > 1)
				sayilar[i] = 0;
		}
		for (int i = 0; i < sayi.length; i++) {
			if (sayilar[i] != 0)
				System.out.print(sayilar[i] + " ");
		}

	}

}
