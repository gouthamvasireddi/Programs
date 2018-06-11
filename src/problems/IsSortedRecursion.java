package problems;

public class IsSortedRecursion {

	public static void main(String[] args) {

		int[] x = { 1,4, 3, 6, 7, 8, 10 };

		System.out.println(isLess(x, x.length - 1));

	}

	public static boolean isLess(int[] x, int index) {

		if (x[index] > x[index - 1]) {

			if (index == 1)
				return true;
			else
				return isLess(x, index - 1);
		} else {
			return false;
		}

	}

}
