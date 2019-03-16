package collectionsmethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Algorithms2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] colors = { "red", "white", "yellow", "blue" };
		List<String> list1 = Arrays.asList(colors);
		ArrayList<String> list2 = new ArrayList<>();

		list2.add("black");
		list2.add("red");
		list2.add("green");

		System.out.println("Before addAll list2 contains :");

		for (String s : list2)
			System.out.print(s + " ");

		System.out.println();

		// adding colors strings to list2

		Collections.addAll(list2, colors);

		System.out.println("After addAll list2 contains :");

		for (String s : list2)
			System.out.print(s + " ");

		System.out.println();

		int frequency = Collections.frequency(list2, "red");
		System.out.println("frequency of red in list2 : " + frequency);

		// check whether list1 and list2 have elements in common
		boolean disjoint = Collections.disjoint(list1, list2);

		System.out.println("list 1 and list2  " + (disjoint ? "do not have" : "have") + " elements in common");

	}

}
