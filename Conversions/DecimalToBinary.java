import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");     
		int n=sc.nextInt();

		String rem="";//used string
		while(n!=0){
		    rem=(n%2)+rem;
		    n=n/2;
	}
	System.out.println(rem);
	}
}
