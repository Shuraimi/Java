import java.util.* ;
import java.io.*;
class LastIndex {

	public static void main(String args[]) {

		// Write code here

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int ele = sc.nextInt();
		int k = -1;
		boolean flag = false;
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] == ele) {
				flag = true;
				k = j;
			}

		}
		if (flag)
			System.out.println(k);
		else
			System.out.println(k);


	}




}
