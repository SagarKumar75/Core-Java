class Print extends Thread {
    public void run() {
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
    }
}

public class Task1 {
    public static void main(String[] args) {
        Print t1 = new Print();
        t1.start();

        for (char i = 'A'; i <= 'J'; i++) {
            System.out.println(i);
        }
    }

}
