//function to check whether the given input is valid binary or not
import java.util.*;
public class validateBinary {
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
		//loops on untill the input is a valid octal number
		do {
			System.out.println("Enter your binary number");
			N = sc.nextInt();
			k = isBinary(N);
		} while (!(k));
		System.out.println(k);
	}
}
