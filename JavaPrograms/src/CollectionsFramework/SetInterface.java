package CollectionsFramework;

import java.util.*;

public class SetInterface {

	public static void main(String[] args) {

		int[] a = { 2, 7, 3, 9, 1, 6, 0, 1 };

		// HashSet, LinkedHashSet classes implement Set Interface

		// HashSet does not maintain the insertion order but if you need fast operations then go with HashSet
		System.out.println("----------------- HashSet -------------------");
		Set<Integer> hashset = new HashSet<>();
		for (int e : a) {
			hashset.add(e);
		}
		System.out.println("HashSet does not maintain order : " + hashset);

		// Linked HashSet : it maintains the insertion order
		System.out.println("----------------- LinkedHashSet -------------------");
		Set<Integer> linkedhashset = new LinkedHashSet<>();
		for (int e : a) {
			linkedhashset.add(e);
		}
		System.out.println("LinkedHashSet : It maintains the insertion order : " + linkedhashset);
		
		// For sorting of the elements then go with TreeSet, it sorts the elements in natural way
		// TreeSet class implements SortedSet Interface
		System.out.println("----------------- TreeSet -------------------");
		Set<Integer> treeset = new TreeSet<>();
		for (int e : a) {
			treeset.add(e);
		}
		System.out.println("TreeSet : it maintains the sorted order : " + treeset);
	}

}
