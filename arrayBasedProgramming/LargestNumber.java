package arrayBasedProgramming;

public class LargestNumber {
	public static void main(String[] args) {
		int arr[] = { 1, 18, 2, 28, 20, 8, 40 };
		int largest = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (largest < arr[i]) {
				largest = arr[i];
			}
		}
		System.out.println(largest);
	}

}
