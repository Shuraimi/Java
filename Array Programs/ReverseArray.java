import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element of the aray");
            arr[i] = sc.nextInt();
        }
        int temp;

        int count = 1;

        System.out.println("Initially the array before reversing is ");

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

        // System.out.println();

        for (int i = 0; i < arr.length / 2; i++) {
            // System.out.println(arr[i]+"+arr[arr.length-count]);

            temp = arr[i];

            arr[i] = arr[arr.length - count];

            arr[arr.length - count] = temp;

            count++;

        }
        System.out.println("\nFinally the array after reversing is");

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
