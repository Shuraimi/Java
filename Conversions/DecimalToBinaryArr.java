//using arrays
import java.util.*;
public class DecimalToBinaryArr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		int q;
		int rem[] = new int[32]; //used array
		int i = 0;
		while (n != 0) {
			rem[i] = n % 2;
			i++;
			n = n / 2;
		}
		//printing the array in reverse
		for (int j = rem.length - 1; j >= 0; j--)
			System.out.print(rem[j]);

	}
}
