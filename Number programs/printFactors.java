//print all the factors of the given number
import java.util.*;
public class div {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");

		int num = sc.nextInt();

		int i = 1;
		System.out.println("The factors of the given number are ");

		while (i <= num) {
			if (num % i == 0)
				System.out.print(i + " ");
			i++;
		}
	}
}
