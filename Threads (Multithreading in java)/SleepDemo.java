class Sleep extends Thread {
    public void run() {
        for (int i = 1; i < 4; i++) {
            System.out.println("Count: " + i);
            try {
                Thread.sleep(1000); // 1 second pause
            } catch (InterruptedException e) {
                System.out.println(e);
            }

        }
    }
}

public class SleepDemo {
    public static void main(String[] args) throws InterruptedException {
        Sleep t1 = new Sleep();
        t1.start();

        t1.join(); // wait for t1 to finish

        System.out.println("Main thread finished!");
    }

}
