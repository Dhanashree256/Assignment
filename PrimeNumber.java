public class PrimeNumber {
    public static void main(String[] args) {
        int i, j;
        boolean prime;

        for (i = 2; i <= 20; i++) {
            prime = true;

            for (j = 2; j <= i - 1 ; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                System.out.println(i + " is a prime number");
            } else {
                System.out.println(i + " is not a prime number");
            }
        }
    }
}
