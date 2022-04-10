import java.util.*;
/**
 * B_Gifts_Fixing
 */

public class B_Gifts_Fixing{
 
     public static void main(String []args){
       Scanner sc=new Scanner(System.in);
           int t=sc.nextInt();
           for(int i=0;i<t;i++)
	{
		int n=sc.nextInt();
		long[] candy=new long[n];
		long[] orange=new long[n];
		long min_candy=1000000000;
		long min_orange=1000000000;

		for(int j=0;j<n;j++)
		{
			candy[j]=sc.nextInt();
            if (candy[j]<min_candy) {
                min_candy=candy[j];
            }

		}
		for(int j=0;j<n;j++)
		{
			orange[j]=sc.nextInt();
            if (orange[j]<min_orange) {
                min_orange=orange[j];
            }
		}
        
        

		long c=0;
		for(int h=0;h<n;h++)
		{
			
				long x=candy[h]-min_candy;
				long y=orange[h]-min_orange;
				long ans=(x>y)? x:y;
				c=c+ans;
				
			
				
		}
		    System.out.println(c);
		
        }
}
}