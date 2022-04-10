public class gcd {

    public static void main(String[] args) {
        
        int a=10,b=15,res=0;
        if (a>b) {
            res=b;
        }
        else{
            res=a;
        }

        while (res>0) {
            if (a%res==0 && b%res==0) {
                System.out.println(res);
                break;
            }
            res-=1;
        }



        
    }
    
}
