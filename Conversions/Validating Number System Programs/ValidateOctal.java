//Program to validate whether a given number is ocatl or not
import java.util.*;
public class ValidateOctal {
	static boolean isOctal(int N) {
		int dig;
		while (N != 0) {
			dig = N % 10;
			if (dig > 7)
				return false;
			N = N / 10;
		}
		return true;

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		boolean k;

		do {
			System.out.println("Enter you number");
			n = sc.nextInt();
			k = isOctal(n);
		} while (!(k));
		System.out.println(k);
	}
}
