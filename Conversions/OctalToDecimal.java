//Octal to decimal after validating input
import java.util.*;
public class OctalToDecimal {
        //Function which is used to validate the input whether octal or not
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

		do {
			System.out.println("Enter you number");
			n = sc.nextInt();
		} while (!(isOctal(n)));
                //Above do..while loop goes on untill the given input is a valid octal  
                
		int deci = 0;
		int i = 0;
		int dig;
		while (n != 0) {

			dig = n % 10;
			deci = deci + (dig * (int)Math.pow(8, i));
			n = n / 10;
			i++;

		}
		System.out.println(deci);
	}
}
