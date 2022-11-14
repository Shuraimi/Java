//to check whether a number is palindrome or not
import java.util.*;
class pal{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

System.out.println("Enter the number to check whether palindrome or not");
int n=sc.nextInt();

int k=n;
int dig;
int rev=0; 

while(n!=0){
dig=n%10 ;
rev=rev*10+dig;
n=n/10;
}

if(rev==k)
System.out.println("The given number is palindrome"); 
else
System.out.println("The given number is not palindrome");
}
}
