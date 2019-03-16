package collectionsmethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import time.Time2;
import time.TimeComparator;

public class Sort3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Time2> list = new ArrayList<>();

		list.add(new Time2(6, 24, 34));
		list.add(new Time2(18, 14, 58));
		list.add(new Time2(6, 05, 34));
		list.add(new Time2(12, 14, 58));
		list.add(new Time2(6, 24, 22));

		System.out.println("Unsorted Array Elements :" + list);

		Collections.sort(list, new TimeComparator());

		System.out.println("Sorted Array Elements : " + list);

	}

}
