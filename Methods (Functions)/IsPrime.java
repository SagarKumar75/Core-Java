
public class IsPrime {

    static boolean isPrime(int n) {
        if (n == 1)
            return true;
        int count = 0;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                count++;

        }
        if (count >= 1)
            return false;
        else
            return true;
    }

    public static void main(String[] args) {
        boolean prime = isPrime(12);
        System.out.println(prime);
    }

}
