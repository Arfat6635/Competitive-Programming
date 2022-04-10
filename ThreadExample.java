import java.io.IOException;

class ThreadTest extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Inside the thread");    
        }
        
    }
}

public class ThreadExample {
    public static void main(String[] args) throws IOException, Exception {
        ThreadTest t=new ThreadTest();
        t.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("Inside the main thread");
            Thread.sleep(5);
        }
        
    }
}
