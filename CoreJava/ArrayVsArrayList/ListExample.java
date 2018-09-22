package ArrayVsArrayList;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(Integer.valueOf(10));
		list.add(20);
		list.add(30);

		System.out.println("Traversing List...");
		for (Integer i : list) {
			System.out.println(i);
		}

	}// main()
}
