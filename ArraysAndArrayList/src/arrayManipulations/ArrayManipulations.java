package arrayManipulations;

import java.util.Arrays;

public class ArrayManipulations {

	public static void main(String[] args) {

		// sort doubleArray into ascending order

		double[] doubleArray = { 8.4, 9.3, 0.2, 7.9, 3.4 };
		Arrays.sort(doubleArray);
		System.out.println("doubleArray");

		for (double value : doubleArray)
			System.out.print(value + " ");

		System.out.println();

		// fill 10-element array with 7s
		int[] filledIntArray = new int[10];
		Arrays.fill(filledIntArray, 7);
		displayArray(filledIntArray, "filledIntArray");

		// copy array intArray into array intArrayCopy
		int[] intArray = { 1, 2, 3, 4, 5, 6 };
		int[] intArrayCopy = new int[intArray.length];
		System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);
		displayArray(intArray, "intArray");
		displayArray(intArrayCopy, "intArrayCopy");

		// compare intArray and intArrayCopy for equality
		boolean b = Arrays.equals(intArray, intArrayCopy);
		System.out.println("intArray & intArrayCopy ");
		System.out.println(b ? "==" : "!=");

		// compare intArray and filledIntArray for equality
		b = Arrays.equals(intArray, filledIntArray);
		System.out.println("intArray & filledIntArray ");
		System.out.println(b ? "==" : "!=");

		// search intArray for the value 5
		int location = Arrays.binarySearch(intArray, 5);

		if (location >= 0)
			System.out.println("found 5 at element " + location + " in intArray");
		else
			System.out.println("5 not found in intArray");

		// search intArray for the value 8763
		location = Arrays.binarySearch(intArray, 8763);

		if (location >= 0)
			System.out.println("found 8763 at element " + location + " in intArray");
		else
			System.out.println("8763 not found in intArray");

	}

	public static void displayArray(int[] array, String description) {
		System.out.println(description);

		for (int value : array)
			System.out.print(value + " ");

		System.out.println();

	}

}
