//neon number
//sum of square of the digits is the number itself

import java.util.*;

public class neonNumber {

public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter number whether Neon or not");
int n=sc.nextInt();
int neon=n;

n=(int)Math.pow(n, 2); 
int sum=0;

while(n!=0){

int dig=n%10;
sum+=dig;
n=n/10;
}

if(sum==neon)
System.out.println( "The given number is a Neon Number");

else
System.out.println("The given number is not a Neon number");
}
}
