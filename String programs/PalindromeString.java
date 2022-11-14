//string palindrome or not 
import java.util.*;

public class PalindromeString{

public static void main(String args[]) {

Scanner sc=new Scanner(System.in); 
System.out.println("Enter your string");

String str=sc.nextLine();

String r="";
for(int i=str.length()-1;i>=0; i--){ 
    r+=str.charAt(i);
}

if(r.equals(str))

System.out.println("The given string is Palindrome");

else

System.out.println("The given string is not Palindrome");
}
}
