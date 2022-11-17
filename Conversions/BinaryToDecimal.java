//binary to decimal without validation
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		System.out.println("Enter you number");
		n = sc.nextInt();
		int deci = 0;
		int i = 0;
		int dig;
		while (n != 0) {

			dig = n % 10;
			deci = deci + (dig * (int)Math.pow(2, i));
			n = n / 10;
			i++;

		}
		System.out.println(deci);
	}
}
