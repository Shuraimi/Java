
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");   
		int n=sc.nextInt();

		String rem="";//used string
		while(n!=0){
		    rem=(n%8)+rem;//added to string first then added with the remaining string(without reversing)
		    n=n/8;
	}
	System.out.println(rem);
	}
}


	

		

		

	



		

		    

		    

	



	

