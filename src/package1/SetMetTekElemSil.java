package package1;

import java.util.HashSet;
import java.util.Set;

public class SetMetTekElemSil {

	public static void main(String[] args) {

		int[] arr = { 2, 3, 4, 5, 6, 6, 7, 7, 8, 8, 4, 9 };

		
		Set<Integer> st1 = new HashSet<>();

		for (int each : arr) {
			st1.add(each);

		}
		System.out.println(st1);

	}

}
