package towersofhanoi;

public class TowersOfHanoi {

	// recursively move disks between towers

	public static void solveTowers(int disks, int sourcePeg, int destinationPeg, int tempPeg) {

		// base case --only 1 disk to move
		if (disks == 1) {
			System.out.println(sourcePeg + " --> " + destinationPeg);
			return;

		}

		/*
		 * recursion step -- move ( disks - 1) disks from sourcePeg to tempPg using
		 * destinationPeg
		 */
		solveTowers(disks - 1, sourcePeg, tempPeg, destinationPeg);

		System.out.println(sourcePeg + " --> " + destinationPeg);

		// move (disks - 1) disks from tempPeg to destinationPeg
		solveTowers(disks - 1, sourcePeg, destinationPeg, tempPeg);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int startPeg = 1; // value 1 used to indicate startPeg in output
		int endPeg = 3; // value 3 used to indicate endPeg in output
		int tempPeg = 2; // value 2 used to indicate tempPeg in output
		int totalDisks = 3; // number of disks

		// initial nonrecursive call: move all disks.
		solveTowers(totalDisks, startPeg, endPeg, tempPeg);

	}

}
