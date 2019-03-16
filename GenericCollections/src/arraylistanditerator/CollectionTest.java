package arraylistanditerator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// add elements in colors array to list
		String[] colors = { "MAGENTA", "RED", "WHITE", "BLUE", "CYAN" };

		List<String> list = new ArrayList<String>();

		for (String color : colors)
			list.add(color); // adds color to end of list

		String[] removeColors = { "RED", "WHITE", "BLUE" };
		List<String> removeList = new ArrayList<String>();

		for (String color : removeColors)
			removeList.add(color);

		System.out.println("ArrayList ");

		for (int count = 0; count < list.size(); count++)
			System.out.print(list.get(count) + " ");

		System.out.println();

		// remove from list the colors contained in removeList

		removeColors(list, removeList);

		System.out.println("ArrayList after calling removeColors");

		for (String color : list)
			System.out.print(color + " ");

	}

	// remove colors specified in collection2 from collection1
	private static void removeColors(Collection<String> collection1, Collection<String> collection2) {

		Iterator<String> iterator = collection1.iterator();

		// loop while collection has items
		while (iterator.hasNext())
			if (collection2.contains(iterator.next()))
				iterator.remove();// remove current element

	}

}
