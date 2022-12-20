import java.util.*;
class Factorial {
	
	public static void main(String args[]) {
		
		// Write code here
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fact=1;
        if(n==0){
            System.out.println(1);
        }
        else if(n<0){
            System.out.println("Error");
        }
           else{ 
        for(int i=n;i>=1;i--){
            fact*=i;
        }
               System.out.println(fact);
           }
	}
}
