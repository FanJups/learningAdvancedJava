package concurrency;

import java.security.SecureRandom;
import java.text.NumberFormat;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

public class SortComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SecureRandom random = new SecureRandom();

		// create array of random ints , then copy it

		int[] array1 = random.ints(15_000_000).toArray();
		int[] array2 = new int[array1.length];

		System.arraycopy(array1, 0, array2, 0, array1.length);

		// time the sorting of array1 with Arrays method sort
		System.out.println("Starting sort");

		Instant sortStart = Instant.now();
		Arrays.sort(array1);
		Instant sortEnd = Instant.now();

		// display timing results

		long sortTime = Duration.between(sortStart, sortEnd).toMillis();

		System.out.println("Total time in milliseconds : " + sortTime);

		// time the sorting of array2 with Arrays method parallelSort
		System.out.println("Starting parallelSort");

		Instant parallelSortStart = Instant.now();

		Arrays.parallelSort(array2);
		Instant parallelSortEnd = Instant.now();

		// display timing results

		long parallelSortTime = Duration.between(parallelSortStart, parallelSortEnd).toMillis();

		System.out.println("Total time in milliseconds : " + parallelSortTime);

		// display time difference as percentage

		String percentage = NumberFormat.getPercentInstance().format((double) sortTime / parallelSortTime);

		System.out.println("sort took " + percentage + " more time than parallelSort");

	}

}
