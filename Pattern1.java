/**
 * Pattern1
 */
import java.util.*;
public class Pattern1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        //outer loop 
        for(int i=1;i<=n;i++){
            //inner loop for printing the pattern
            for(int j=1;j<=n;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
