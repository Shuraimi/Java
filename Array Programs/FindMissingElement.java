import java.util.*;
public class FindMissingEle {
	public static void main(String[] args) {
		//	int arr[] = {6, 1, 2, 8, 3, 4, 7, 10, 5};
		Scanner sc = new Scanner(System.in);
              //  System.out.println("Enter the size of the array.");
//int size=sc.nextInt();
//int arr[]=new int[size];
		//int arr[] = {1, 3, 4, 5, 6};
//System.out.println("Enter the size of the array");
		//int n=sc.nextInt();
		int n = 2;
		int ele = 1;
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		if (arr.length == 1)
			System.out.println(++ele);
		else {
			int i = 0;
			while (ele <= n) {
				if (arr[i] != ele)
					System.out.println(ele);
				i++;
				ele++;
			}
		}
	}
}
