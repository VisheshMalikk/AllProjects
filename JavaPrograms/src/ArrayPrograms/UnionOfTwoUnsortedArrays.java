package ArrayPrograms;

import java.util.HashSet;

public class UnionOfTwoUnsortedArrays {

	public static void main(String[] args) {

		int[] a = { 1, 3, 2, 7, 5, 4 };
		int[] b = { 7, 3, 6, 9, 4, 1 };

		HashSet<Integer> union = fnGetUnion(a, b);
		System.out.println(union.toString());
	}

	private static HashSet<Integer> fnGetUnion(int[] a, int[] b) {

		HashSet<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}

		for (int j = 0; j < b.length; j++) {
			set.add(b[j]);
		}

		return set;

	}

}
