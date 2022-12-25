import java.util.*;
public class sieveOfEratosthenes {
	public static void main(String[] args) {
		//int n = 40;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n till where you want to print prime numbers");
		int n = sc.nextInt();
		//size of boolean array is 'n+1' since to include 40 number
		boolean primes[] = new boolean[n + 1];

//this loop iterates just as we use while checking for prime number (omitting the repeated factors)
		for (int i = 2; i * i <= n; i++) {
			//if a number is prime , it converts all its factors to true so that the values which are false are prime numbers
			if (!primes[i]) {
				for (int j = i * 2; j <= n; j += i) {
					primes[j] = true;
				}
			}
		}
		//we print the indices of the values which are false the indices are prime numbers
		for (int k = 2; k <= n; k++) {
			if (!primes[k])
				System.out.print(k + " ");
		}

	}
}
