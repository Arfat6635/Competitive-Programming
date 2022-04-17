import java.util.Scanner;

public class reverse_integer {
    public int reverse(int x) {
        int rem,z=0;
        while (x!=0) {
            rem=x%10;
            if (z > Integer.MAX_VALUE/10 || (z == Integer.MAX_VALUE / 10 && rem > 7)){return 0;}
            if (z < Integer.MIN_VALUE/10 || (z == Integer.MIN_VALUE / 10 && rem < -8)) {return 0;}
            z=z*10+rem;
            x=x/10;
        }
        return z;
    }
    public static void main(String[] args) {
       
    }
    
}
