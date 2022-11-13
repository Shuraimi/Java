import java.util.*; 
public class prime {
public static void main(String[] args) { Scanner sc=new Scanner(System.in); 
System.out.println("Enter your number");

int n=sc.nextInt(); 
int count=0;
//i can also be less than or equal to n
for(int i=2;i<Math.sqrt(n);i++){

if(n%i==0)
count++;
}
System.out.println(count);
if(count==0)
System.out.println("Prime number");
else
System.out.println("Not a Prime number");
}
}
