public class Exercise1_3_25 {
    public static void main(String[] args) {
        long N = Long.parseLong(args[0]);
        long n = N;
        int power = 0;
        for (long i = 2; i <= n/i; i++) {
            while (n % i == 0) {
                while ((Math.pow(i, power) <= n) && (n % Math.pow(i, power) == 0)) {
                    power++;
                }
                power--;
                if (power < 0) {
                    n /= i;
                    System.out.print(i + " ");
                } else {
                    System.out.print(i + " ");
                    n = (long) (n / (Math.pow(i, power)));

                }
            }
        }
        if (n > 1) System.out.print(n);
        System.out.println();
    }
}

