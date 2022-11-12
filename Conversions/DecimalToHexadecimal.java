import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");      
		int n=sc.nextInt();
		String rem="";//used string
		while(n!=0){
		    if(n%16==10)
		    rem='A'+rem;//remainder
		    else if(n%16==11)
		    rem='B'+rem;
		    else if(n%16==12)
		    rem='C'+rem;
		    else if(n%16==13)
		    rem='D'+rem;
		    else if(n%16==14)
		    rem='E'+rem;
		    else if(n%16==15)
		    rem='F'+rem;
		    else
		    rem=(n%16)+rem;
		    n=n/16;//quotient
	}
	System.out.println(rem);
	}
}
