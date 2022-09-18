/**
 * Threads Creation
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("We are now in thread " + Thread.currentThread().getName());
                System.out.println("Current thread priority is " + Thread.currentThread().getPriority());
            }
        });

        thread.setName("New worker Thread");

        thread.setPriority(Thread.MAX_PRIORITY);

        System.out.println("We are in Thread " + Thread.currentThread() + " before starting a new thread");
        thread.start();
        System.out.println("We are in thread " + Thread.currentThread() + " after starting a new thread");

//        Thread.sleep(10000);

    }
}
