mport java.util.* ;
import java.io.*; 
class FahrenheitToCelciusSolution {
	
	public static void main(String args[]) {
		
		// Write code here
		Scanner sc=new Scanner(System.in);
        int S=sc.nextInt();
        int E=sc.nextInt();
        int W=sc.nextInt();
        int c;
        for(int i=S;i<=E;){
            double C=(i-32)*5/9;
            //System.out.println(C);
            if(C>=0)
                c=(int)Math.floor(C);
            else
                c=(int)Math.ceil(C);
            System.out.print(i+"\t"+c);
            System.out.println();
            i+=W;
        }
	}
}
