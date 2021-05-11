package package2;

import java.util.Scanner;

public class VizeFinalNot {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen vize notunuzu giriniz");
		double vize = scan.nextDouble();

		System.out.println("lutfen final notunuzu giriniz");
		double finall = scan.nextDouble();

		double ortalama = (vize * 0.40 + finall * 0.60);

		if (ortalama > 50) {
			System.out.println("gecti" + ortalama);
		} else {
			System.out.println("kaldi" + ortalama);

		}
		scan.close();
	}
	

}
