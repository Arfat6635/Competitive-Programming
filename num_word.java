import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * num_word
 */
public class num_word {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "zero");
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");
        map.put(7, "seven");
        map.put(8, "eight");
        map.put(9, "nine");

        String num, ans="";
        Scanner sc=new Scanner(System.in);
        num=sc.next();
        char arr[]=num.toCharArray();
        for (int i = 0; i < num.length(); i++) {
            ans+=map.get(Integer.parseInt(String.valueOf(arr[i])))+" ";
        }
        System.out.println(ans);
        sc.close();
    }
}