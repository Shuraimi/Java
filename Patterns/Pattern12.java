import java.util.*;
public class Pattern12{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number to print the pattern");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            for(int k=1;k<=((n-i)*4);k++){
                System.out.print(" ");
            }
            for(int l=i;l>=1;l--){
                System.out.print(l+" ");
            }
            System.out.println();
        }
    }
}
