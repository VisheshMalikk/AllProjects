package CollectionFrameworkRelatedProgram.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReturnPeakElementsFromArray {

	public static void main(String[] args) {

		// Return array of peak elements
		int[] marks = { 45, 67, 34, 94, 10, 25, 18 };
		List<Integer> list = new ArrayList<Integer>();

		for (int num : marks) {
			list.add(num);
		}

		List<Integer> peakElements = new ArrayList<Integer>();

		for (int i = 0; i < list.size(); i++) {
			if (i == 0 && list.get(i) >= list.get(i + 1)) {
				peakElements.add(list.get(i));
			} else if (i == list.size() - 1 && list.get(i) >= list.get(i - 1)) {
				peakElements.add(list.get(i));
			} else if (i > 0 && i < list.size() - 1 && list.get(i) >= list.get(i + 1) && list.get(i) >= list.get(i - 1)) {
				peakElements.add(list.get(i));
			}
		}

		Collections.sort(peakElements);
		System.out.println(peakElements);

	}

}
