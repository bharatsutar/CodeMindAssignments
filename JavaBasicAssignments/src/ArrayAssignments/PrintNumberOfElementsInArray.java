package ArrayAssignments;

public class PrintNumberOfElementsInArray {

	public static void main(String[] args) {

		int[] array = new int[] { 5, 4, 3, 2, 1 };
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
			count++;
		}
		System.out.println("Number of element in array: " + count);
	}

}
