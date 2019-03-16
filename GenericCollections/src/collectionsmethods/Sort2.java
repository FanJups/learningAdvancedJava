package collectionsmethods;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };

		// Create and display a list containing the suits array elements
		List<String> list = Arrays.asList(suits);

		System.out.println("Unsorted Array Elements :" + list);

		// Descending order using a comparator
		Collections.sort(list, Collections.reverseOrder());

		System.out.println("Sorted Array Elements : " + list);

	}

}
