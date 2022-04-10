import java.util.Scanner;

/**
 * Binary_String_Cost
 */
public class Binary_String_Cost {

    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t-- > 0) {
            // x- 01
            // y - 10
            int n, x, y, f = 0, g = 0;
            String str;
            n = sc.nextInt();
            x = sc.nextInt();
            y = sc.nextInt();
            str = sc.next();
            char arr[] = str.toCharArray();


            if (y<x || x==y) {
                

               
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n - i - 1; j++) {
                        if (arr[j] < arr[j + 1]) {
                            char temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;
                        }
                    }
                }

                for (int i = 0; i < n - 1; i++) {
                    if (arr[i] == '0' && arr[i + 1] == '1') {
                        f += 1;
                    } else if (arr[i] == '1' && arr[i + 1] == '0') {
                        g += 1;
                    }
                }

                System.out.println((x * f) + (y * g));
            }else if(x<y){

                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n - i - 1; j++) {
                        if (arr[j] > arr[j + 1]) {
                            char temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;
                        }
                    }
                }

                for (int i = 0; i < n - 1; i++) {
                    if (arr[i] == '0' && arr[i + 1] == '1') {
                        f += 1;
                    } else if (arr[i] == '1' && arr[i + 1] == '0') {
                        g += 1;
                    }
                }

                System.out.println((x * f) + (y * g));

            }
           
        }

        
        sc.close();
    }
}