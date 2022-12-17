import java.util.*; 
public class prime {
public static void main(String[] args) { Scanner sc=new Scanner(System.in); 
System.out.println("Enter your number");

int n=sc.nextInt(); 
if(n<=1)
System.out.println("The given number "+n+" is not prime number.");
int count=0;
//i can also be less than or equal to n
//i*i<=n can be used
for(int i=2;i<=Math.sqrt(n);i++){

if(n%i==0)
count++;
}
//System.out.println(count);
if(n>1){
if(count==0)
System.out.println("The given number "+n+" is Prime number.");
else
System.out.println("The given number "+n+" is not a Prime number.");
}
}
}
