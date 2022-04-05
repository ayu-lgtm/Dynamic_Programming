import java.util.*;

class Fibonacci {
    public static int fibonacci(int n, int qb[]) {
        if (n == 1 || n == 0) {
            return n;
        }
        if (qb[n] != 0) {
            return qb[n];
        }
        int fib = fibonacci(n - 1, qb) + fibonacci(n - 2, qb);
        qb[n] = fib;
        return fib;
    }

    public static void main(String args[]) { //MEMORIZATION TECHNIQUE
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int arr[] = new int[num + 1];

        int n = fibonacci(num, arr);

        System.out.print(n);

        sc.close();
    }
}