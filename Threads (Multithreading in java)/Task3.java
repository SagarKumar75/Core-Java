class Message extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("message: " + i);
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class Task3 {
    public static void main(String[] args) {
        Message t1 = new Message();
        t1.start();

    }

}
