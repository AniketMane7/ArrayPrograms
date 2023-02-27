package Arrays_Programs;

import java.util.Arrays;

public class Second_HighestNumber {

	// Step 2 :- write Method for printing
	public static void print2largeValue(int arr[]) {

		// step - 3 :- Size of array
		int size = arr.length;

		// step - 3 :- logic if only two values in arrays

		if (size < 2) {
			System.out.println("Only Two Value Cant Accepted");
			return;
		}

		// step - 4 :- Find 2nd Highest Number In aaray

		Arrays.sort(arr);

		// (If not Same Value in Array)
		// System.out.println("Second Highest Num Is : " +arr[size -2]);

		// If hight value is Dublicated Then

		for (int i = size - 2; i >= 0; i--) {
			if (arr[i] != arr[size - 1]) {
				System.out.println("Highest Num is : " + arr[i]);
				return;
			}
		}

	}

	public static void main(String[] args) {

		// Step - 1 Decleare arrays
		int arr[] = { 12, 15, 16, 30, 40, 45, 50 };

		// step -5 :- Call Method
		print2largeValue(arr);
	}
}
