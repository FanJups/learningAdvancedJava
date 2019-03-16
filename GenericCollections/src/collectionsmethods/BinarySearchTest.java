package collectionsmethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] colors = { "red", "white", "blue", "black", "yellow", "purple", "tan", "pink" };

		List<String> list = new ArrayList<>(Arrays.asList(colors));

		Collections.sort(list);

		printSearchResults(list, "black");
		printSearchResults(list, "red");
		printSearchResults(list, "pink");
		printSearchResults(list, "aqua");
		printSearchResults(list, "gray");
		printSearchResults(list, "teal");

	}

	// perform search and display result
	private static void printSearchResults(List<String> list, String key) {

		int result = 0;
		System.out.println(" Searching for : " + key);
		result = Collections.binarySearch(list, key);

		if (result >= 0)
			System.out.println("Found at index " + result);
		else
			System.out.println("Not found  " + result);

	}

}
