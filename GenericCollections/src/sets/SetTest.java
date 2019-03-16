package sets;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] colors = { "red", "white", "blue", "green", "gray", "orange", "tan", "white", "cyan", "peach", "gray",
				"orange" };

		List<String> list = Arrays.asList(colors);

		System.out.println("List : " + list);

		printNonDuplicates(list);

	}

	private static void printNonDuplicates(Collection<String> values) {

		Set<String> set = new HashSet<>(values);
		System.out.println("Non duplicates are :");

		for (String value : set)
			System.out.print(value + " ");

		System.out.println();

	}

}
