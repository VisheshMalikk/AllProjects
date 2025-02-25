package ArrayPrograms;

import java.util.HashSet;
import java.util.Set;

public class FindCommonElementsInTwoArrays {

	public static void main(String[] args) {
		
		int[] a1 = {45, 67, 33, 23, 43, 90};
		int[] a2 = {67, 55, 22, 56, 33, 45};
		
		Set<Integer> set = returnCommonItemsArray(a1, a2);
		System.out.println("Common elements in two arrays are : " + set);
	}
	
	
	public static Set<Integer> returnCommonItemsArray(int[] a1, int[] a2) {
		
		Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
		
        for (int a : a1) {
			set1.add(a);
		}
        
        for (int a : a2) {
			set2.add(a);
		}
        
        set1.retainAll(set2);
        
       return set1;
		
	}

}
