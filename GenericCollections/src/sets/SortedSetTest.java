package sets;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] colors = { "yellow", "green", "white", "black", "tan", "grey", "white", "orange", "red", "green" };

		SortedSet<String> tree = new TreeSet<>(Arrays.asList(colors));

		System.out.println("colors");
		for (String s : colors)
			System.out.print(s + " ");

		System.out.println();

		System.out.println("sorted set");
		printSet(tree);

		// get headset based on orange
		System.out.println("headset (\"orange\") ");
		printSet(tree.headSet("orange"));

		// get tailset based on orange
		System.out.println("tailset (\"orange\") ");
		printSet(tree.tailSet("orange"));

		// get first and last elements
		System.out.println("first :  " + tree.first());
		System.out.println("last :  " + tree.last());

	}

	private static void printSet(SortedSet<String> set) {

		for (String s : set)
			System.out.print(s + " ");

		System.out.println();

	}

}
