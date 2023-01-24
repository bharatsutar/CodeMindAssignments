package AdvAarrayAssignments;

public class FindDuplicateElement {

	void duplicateArray(int[] arr) {
	
		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					System.out.println(arr[j]);
				}
			}
		}

	}

	public static void main(String[] args) {

		int[] arr = new int[] { 2, 3, 4, 5, 6, 7, 8, 4, 3, 2 };

		FindDuplicateElement f = new FindDuplicateElement();

		f.duplicateArray(arr);

	}

}
