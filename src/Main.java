import java.util.Scanner;

public class Main {
    private static long getFibonacciHugeNaive(long n, long m) {
        if (n <= 1)
            return n;

        long previous = 0;
        long current  = 1;

        for (long i = 0; i < n - 1; ++i) {
            long tmp_previous = previous;
            previous = current;
            current = tmp_previous + current;
        }

        return current % m;
    }

    /**
     *
     * @param n - the nth term of the fibonacci sequence
     * @param m - the divisor to divide with in order to find the remainder
     * @return
     */
    private static long getFibonacciHugeFast(long n, long m){
        //  create 1D array
        long[] array = new long[(int)n + 1];
        array[0] = 0;
        array[1] = 1;
        for(int i = 2; i < array.length; i++){
            array[i] = array[i - 2] + array[i - 1];
        }
        return array[(int)n] % m;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        System.out.println(getFibonacciHugeFast(n, m));
    }
}