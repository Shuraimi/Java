//program which converts binary to hexadecimal
import java.util.*;
public class binaryToHexadecimal {

	//function to convert binary to decimal
	static int convertHex(int n) {
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
			dig = N % 10000;
			deci = convertHex(dig);
			if (deci == 10)
				s = "A" + s;
			else if (deci == 11)
				s = "B" + s;
			else if (deci == 12)
				s = "C" + s;
			else if (deci == 13)
				s = "D" + s;
			else if (deci == 14)
				s = "E" + s;
			else if (deci == 15)
				s = "F" + s;
			else
				s = deci + s;
			N /= 10000; //never forget this statement
		}
		System.out.println(s);

	}
}
