import java.util.* ;
import java.io.*;
class PowerOfNumber {

	public static void main(String args[]) {

		// Write code here

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int power = 1;
		if (n < 0 || x < 0)
			System.out.println("Invalid");
		else if (n == 0 && x == 1)
			power = 0;
		else if (n == 0 && x == 0)
			power = 1;
		else if (n > 0 && x == 0)
			power = 1;

		else {
			for (int i = 1; i <= x; i++) {
				power = power * n;
			}
		}
		System.out.println(power);
	}
}
