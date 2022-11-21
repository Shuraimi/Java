//program which rotates array by n places 
import java.util.*;
public class LeftRotate {
	
    static void leftRotate(long arr[], int k)
    {
        int j=1;
        int rotateTimes=k;
        

        while(j<=rotateTimes){
            int i=0;
            long temp=0;
            while(i<arr.length-1){
                temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                i++;
            }
            j++;
        
    }
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		long arr[] = new long[size];
		for (int i = 0; i < arr.length; i++) {

			System.out.println("Enter your element of the array");
			arr[i] = sc.nextLong();
		}
		System.out.print("Enter the index to be moved ");
		int n=sc.nextInt();
		leftRotate(arr,n);
		for (int k = 0; k< arr.length; k++)
			System.out.print(arr[k] + " ");
	}
}
