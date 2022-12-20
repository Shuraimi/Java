//function which calculates the number of one's in binary form of the number
import java.util.* ;
import java.io.*; 
public class Solution {
	public static int countSetBits(int n) {
		// Write your code here.
        String rem="";
        int count=0;
        while(n>0){
            rem=n%2+rem;
            n=n/2;  
        }
        //System.out.println(rem);
        for(int i=0;i<rem.length();i++){
            if(rem.charAt(i)=='1')
                count++;
        }
        return count;
	}
}
