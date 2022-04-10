import java.util.Scanner;

public class dectobin {
    public static void main(String[] args) {
        int x;
        Scanner sc= new Scanner(System.in);
        x=sc.nextInt();
        String s= "", bin="";
        while (x>0) {
            int r=x%2;
            s+= String.valueOf(r);
            x=x/2;
        }
        for (int i = s.length()-1; i >=0; i--) {
            bin+=s.charAt(i);
        }
        System.out.println(bin);
    }
}
