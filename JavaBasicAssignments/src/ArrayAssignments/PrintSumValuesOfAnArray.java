package ArrayAssignments;

public class PrintSumValuesOfAnArray {

	public static void main(String[] args) {

		int[] array = new int[] { 5, 4, 3, 2, 1 };
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
			sum += array[i];
		}
		System.out.println("sum values of an array: " + sum);

	}

}
