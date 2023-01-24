package ArrayAssignments;

public class FindSmallestNumberInArray {

	public static void main(String[] args) {

		int[] array = new int[] { 5, 4, 1, 3, 2 };
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);

			if (array[i] < min) {
				min = array[i];
			}

		}
		System.out.println("Smallest element in array: " + min);

	}

}
