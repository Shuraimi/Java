//binary to decimal after validating the input
import java.util.*;
public class binaryToDecimal {
        //function which validates the input 
	static boolean isBinary(int n) {
		int dig = 0;
		while (n != 0) {
			dig = n % 10;
			if (dig > 1)
				return false;
			n = n / 10;
		}
		return true;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N;
		boolean k;
		//System.out.println(isBinary(N));
		//taking input untill the given number is a valid binary number
		do {
			System.out.println("Enter number");
			N = sc.nextInt();

			k = isBinary(N);
			if (k == false) {
				System.out.println("enter a binary number");

			}
		} while (k != true);
		//The above do....while loop goes on untill the input is a valid binary number

		//converting binary to decimal
		int deci = 0;
		int i = 0;
		int dig;
		while (N != 0) {

			dig = N % 10;
			deci = deci + (dig * (int)Math.pow(2, i));
			N = N / 10;
			i++;

		}
		System.out.println(deci);

	}
}
