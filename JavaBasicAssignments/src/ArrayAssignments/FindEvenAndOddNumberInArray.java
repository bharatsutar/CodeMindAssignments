package ArrayAssignments;

public class FindEvenAndOddNumberInArray {

	public static void main(String[] args) {

		int[] array = new int[] { 5, 4, 3, 2, 1, 6, 7, 8, 9, 89, 56, 34, 12 };
		for (int i = 0; i < array.length; i++) {

			if (array[i] % 2 == 0) {

				System.out.println("Even number: " + array[i]);
			} else {
				System.out.println("Odd number: " + array[i]);
			}
		}
	}

}
