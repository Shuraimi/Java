import java.util.*;
public class Pattern17{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number to print the pattern");
        int n=sc.nextInt();
        int ch=65;
        for(int i=1;i<=n;i++){
            ch=65;
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print((char)ch);
                ch++;
            }
            ch-=2;
            for(int l=1;l<=i-1;l++){
               
               System.out.print((char)ch);
               ch--;
            }
            System.out.println();
        }
    }
}
