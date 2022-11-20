import java.util.*;
public class ArraySortedOrNot {
	static boolean arraySortedOrNot(int[] arr) {
		boolean flag = false;
		int j = 1;
		if (arr.length == 1)
			flag = true;

		else {
			int i = 0;
			while (i < arr.length - 1) {
				if (arr[i] <= arr[i + 1])
					flag = true;
				else {
					flag = false;
					break;
				}
				i++;
			}

		}
		return flag;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < arr.length; i++) {

			System.out.println("Enter your element of the array");
			arr[i] = sc.nextInt();
		}
		System.out.println(arraySortedOrNot(arr));

	}
}
