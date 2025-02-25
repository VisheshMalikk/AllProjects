package Practice;

import java.util.ArrayList;
import java.util.List;

public class c8 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.set(1, "C");
		list.add("D");
		System.out.println(list);

	}

}
