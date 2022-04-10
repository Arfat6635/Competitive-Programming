

    import java.util.*;
    public class A_Div
    {
      public static void main (String[]args)
      {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        for (int j = 0; j < t; j++)
          {
    	int num = sc.nextInt();
    	if (num % 7 == 0)
    	  System.out.println (num);
    	else
    	  {
    	    num=num/10;
    	    num=num*10;
            
    	    while(num%7!=0)
          {
    	    num++;
          }
    	    System.out.println(num);
    	  }
          }
          sc.close();
      }
    }