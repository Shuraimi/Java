import java.util.Scanner;

public class kthLargestOfArray {

    static int nextLargest(int arr[], int currentLargest) {

        int presentLargest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > presentLargest && arr[i] < currentLargest)
                presentLargest = arr[i];
        }
        return presentLargest;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("The the avlue of k for which you wanna find the kth largest element of the array");
        int k = sc.nextInt();

        int arr[] = { 1, 7, 0, 4, 10 };

        // for finding the largest element of the array if(arr[i]>largest)

        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest)
                largest = arr[i];

        }

        int nextLargestElement = largest;
        if (k == 1)
            System.out.println("The largest element of the array is " + largest);

        else {
            for (int i = 2; i <= k; i++) {
                nextLargestElement = nextLargest(arr, nextLargestElement);
            }
            System.out.println("The " + k + "th largest element is " + nextLargestElement);
        }
    }
}
