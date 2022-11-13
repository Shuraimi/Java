import java.util.*;
public class armstrong {
	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any number to check for arm strong");
	int n = sc.nextInt();
	int k = n;

//for counting the number of digits
	int count = 0;
	while (n != 0) {
		n = n / 10;
		count++;
	}

	n = k;
	int dig;
	int Dig = 0;

//to check whether armstrong or not

	while (n != 0) {

		dig = n %10;
		Dig = Dig + ((int)Math.pow(dig, count));
		n = n / 10;
	}
		if (Dig == k)

			System.out.println("Given number is Arm Strong");

		else

			System.out.println("Given number is not Arm Strong");
	
}
}
