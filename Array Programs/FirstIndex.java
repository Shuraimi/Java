
import java.util.*;
class FirstIndex {

	public static void main(String args[]) {

		// Write code here

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean flag = false;
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int ele = sc.nextInt();
		int j;
		for (j = 0; j < arr.length; j++) {
			if (arr[j] == ele) {
				flag = true;
				// System.out.println(i);
				break;
			}


		}
		if (flag == true)
			System.out.println(j);
		else
			System.out.println("-1");
	}
}
