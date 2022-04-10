import java.util.Random;

public class random_questions {

    public static void main(String[] args) {
        String str[]={"hmm","sfsf","sfggd","dghfdh"};
        Random ran=new Random();
        int x=ran.nextInt(4);
        System.out.println((str[x]));

    }
    
}
