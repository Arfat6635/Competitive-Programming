import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Flip_Sorting
 */
public class Flip_Sorting {

    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while (t-->0) {
            HashMap <Integer, Integer> hm = new LinkedHashMap<>();
            int x;
            String s;
            x=sc.nextInt();
            s=sc.next();
            char arr[]=s.toCharArray();
            for (int i = 0; i < x; i++) {

                if (arr[i]=='1') {
                    
                
                
                hm.put(i+1, x-i);
                
                for (int j = i; j < x; j++) {
                    if (arr[j]=='1') {
                        arr[j]='0';
                    }
                    else{
                        arr[j]='1';
                    }
                }

            }

            }

            System.out.println(hm.size());
            for (Map.Entry<Integer, Integer> entry: hm.entrySet()) {
                System.out.println(entry.getKey() +" "+ entry.getValue());
            }
            
        }
        sc.close();
    }
}