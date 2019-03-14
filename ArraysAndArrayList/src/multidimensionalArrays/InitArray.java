package multidimensionalArrays;

public class InitArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] array1 = { { 1, 2, 3 }, { 4, 5, 6 } };

		int[][] array2 = { { 1, 2 }, { 3 }, { 4, 5, 6 } };

		System.out.println("Values in array 1 by row are");

		outputArray(array1);

		System.out.println("Values in array 2 by row are");

		outputArray(array2);

	}

	// output rows and arrays of 2 dimensional array
	public static void outputArray(int[][] array) {

		// loop through array's rows
		for (int row = 0; row < array.length; row++) {

			// loop through columns of current row
			for (int column = 0; column < array[row].length; column++) {
				System.out.print(array[row][column] + " ");

			}

			System.out.println();

		}

	}

}
