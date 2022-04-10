import java.util.Scanner;

public class SELFDEF {
    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while (t-->0){
            int n,c=0;
            n=sc.nextInt();
            int arr[]=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
                if(arr[i]>=10 && arr[i]<=60){
                    c+=1;
                }
            }
            System.out.println(c);
        }
        sc.close();
    }
}
