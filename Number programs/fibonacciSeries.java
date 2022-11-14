//fibonacci series

		import java.util.*; 
    public class fibonacci{

    public static void main(String args[]) {
    
    Scanner sc=new Scanner(System.in);
    //taking input from user 
    System.out.println("Enter the number of fib series"); int n=sc.nextInt();
    //declaring array fo size n 
    int arr[]=new int[n];
    //initialising its first two elements
    arr[0]=0; 
    arr[1]=1;
    
    //performing calculation to get output
    
    for(int i=2;i<n;i++) 
    arr[i]=arr[i-1]+arr[i-2];
    
    //printing the output
    
    for(int i=0;i<arr.length; i++) { 
        System.out.print(arr[i]+" ");
    
    }
    
    }
    
    }
