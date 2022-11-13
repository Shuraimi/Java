import java.util.*;
public class Pattern18{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number to print the pattern");
        int n=sc.nextInt();
        int chr=64+n;
        for(int i=1;i<=n;i++){
            chr=64+n;
            for(int j=1;j<=i;j++){
                System.out.print((char)chr+" ");
                chr--;
            }
            System.out.println();
        }
    }
}
