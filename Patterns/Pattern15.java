import java.util.*;
public class Pattern15{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number to print the pattern");
        int n=sc.nextInt();
        int chr=65;
        for(int i=n;i>=1;i--){
            chr=65;
            for(int j=1;j<=i;j++){
                System.out.print((char)chr+"");
                chr++;
            }
            System.out.println();
        }
    }
}
