package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class WordTypeCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> myMap = new HashMap<>();
		createMap(myMap);
		displayMap(myMap);

	}

	// create map from user input

	private static void createMap(Map<String, Integer> map) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String input = scanner.nextLine();

		// tokenize the inputs
		String[] tokens = input.split(" ");

		// processing input text
		for (String token : tokens) {
			String word = token.toLowerCase();

			if (map.containsKey(word)) {
				int count = map.get(word); // get current count

				map.put(word, count + 1); // increment count
			} else
				map.put(word, 1);
		}

	}

	// display map content

	private static void displayMap(Map<String, Integer> map) {
		Set<String> keys = map.keySet();

		// sort keys

		TreeSet<String> sortedKeys = new TreeSet<>(keys);

		System.out.printf("%n Map contains : %n Key\t\t Value %n");

		// generate output for each key in map

		for (String key : sortedKeys)
			System.out.printf("%-10s%10s%n", key, map.get(key));

		System.out.printf("%nsize: %d%nisEmpty: %b%n", map.size(), map.isEmpty());

	}

}
