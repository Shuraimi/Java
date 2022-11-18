import java.util.*;
public class LargestElement {

	public static int largest(int arr[]) {
		int large = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > large)
				large = arr[i];
		}
		return large;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements you want to add in your array");
		int size = sc.nextInt();
		int arr[] = new int[size];//dont forget the [] bracket
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the element ");
			arr[i] = sc.nextInt();
		}
		System.out.print("The largest element in the array is " + (largest(arr)));
	}
}
