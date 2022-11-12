import java.util.*;

public class Pattern22{

public static void main(String[] args) {

Scanner sc=new Scanner(System.in);

System.out.println("Enter any number to print the pattern");

int n=sc.nextInt();


//upper pattern
for(int i=1;i<n;i++)
{
     for(int j=1;j<=(n-i);j++)
{ System.out.print(" ");

}

for (int k=1;k<=i; k++) 
{ System.out.print("*");

}

for (int l=1;l<=(i-1); l++)
{ System.out.print("*");

}

System.out.println();

}
 //lower half of pattern
for(int i=n;i>=1;i--)
{
     for(int j=1;j<=(n-i);j++)
{ System.out.print(" ");

}

for (int k=1;k<=i; k++) 
{ System.out.print("*");

}

for (int l=1;l<=(i-1); l++)
{ System.out.print("*");

}

System.out.println();
}
}
}
