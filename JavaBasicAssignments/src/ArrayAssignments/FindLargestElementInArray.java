package ArrayAssignments;

public class FindLargestElementInArray {

	public static void main(String[] args) {

		int[] array = new int[] { 4, 1, 3, 5, 2 };
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);

			if (array[i] > max) {
				max = array[i];
			}

		}
		System.out.println("largest element in array: " + max);

	}

}
