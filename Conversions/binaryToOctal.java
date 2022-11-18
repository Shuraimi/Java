//program which converts a binary number to octal
import java.util.*;
public class binaryToOctal {

	//function to convert binary to decimal
	static int convertDecimal(int n) {
		int dig = 0, Deci = 0, k = 0;
		while (n != 0) {
			dig = n % 10;
			Deci = Deci + dig * (int)Math.pow(2, k);
			n = n / 10;
			k++;
		}
		return Deci;
	}

	//function to check whether the given input is valid binary or not
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

		//loops on untill the input is a valid octal number
		do {
			System.out.println("Enter your binary number");
			N = sc.nextInt();
		} while (!(isBinary(N)));

		int dig = 0;
		int deci = 0;
		String s = "";
		while (N != 0) {
			dig = N % 1000;
			deci = convertDecimal(dig);
			s = deci + s;
			N /= 1000; //never forget this statement
		}
		System.out.println(s);

	}
}
