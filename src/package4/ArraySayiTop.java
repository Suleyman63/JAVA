package package4;

public class ArraySayiTop {

	public static void main(String[] args) {
		

		int arr[][] = { { 1, 3, 6 }, { 2, 8 }, { 5, 7, 9, 14 } };
		

		System.out.println("cift elemanlar toplami : " + cifTop(arr));


	}

	public static int cifTop(int[][] arr) {

		int top = 0;

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				if (arr[i][j] % 2 == 0) {
					
					top += arr[i][j];
				}
			}
		}

		return top;

	}

}
