
class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread: " + i);

        }
    }
}

public class ThreadsDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();

        t1.start(); // starts new thread

        for (int i = 1; i <= 5; i++) {
            System.out.println("Main: " + i);
            ;
        }
    }

}
