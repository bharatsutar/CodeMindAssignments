package AdvAarrayAssignments;

public class SecondLargestNumInArray {

	public static void main(String[] args) {

		int[] arr = new int[] { 8, 7, 6, 5, 4, 9, 1, 2, 3 };
		int temp = 0;
		int size = arr.length;
		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {

					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}

		}

		System.out.println("second largest number is:" +arr[size-2]);
	}
}
