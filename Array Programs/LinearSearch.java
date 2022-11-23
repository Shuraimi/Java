//linear search
import java.util.*;
public class LinearSearch {
	static int linear(int arr[], int ele) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ele) {
				//  System.out.println("Element is present at index "+i);
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();

		int arr[] = new int[size];

		//inputting arrray elements
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the element of the array");
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter the element you want to search for ");
		int ele = sc.nextInt();
		int index = linear(arr, ele);
		if (index != -1)
			System.out.println("The given element is at index " + index);
		else
			System.out.println("The given element is not present, therefore index = " + index);


	}
}
