package collectionsmethods;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Algorithms1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Character[] letters = { 'P', 'C', 'M' };
		List<Character> list = Arrays.asList(letters);
		System.out.println("list contains : ");
		output(list);

		Collections.reverse(list);
		System.out.println("After calling reverse, list contains : ");
		output(list);

		Character[] lettersCopy = new Character[3];
		List<Character> copyList = Arrays.asList(lettersCopy);
		Collections.copy(copyList, list);
		System.out.println("After calling copy, copyList contains : ");
		output(copyList);

		Collections.fill(list, 'R');
		System.out.println("After calling fill, list contains : ");
		output(list);

	}

	private static void output(List<Character> listRef) {

		System.out.println();

		System.out.println("The list is :");

		for (Character element : listRef)
			System.out.print(element + " ");

		System.out.println();

		System.out.println("Max : " + Collections.max(listRef));

		System.out.println("Min : " + Collections.min(listRef));

	}

}
