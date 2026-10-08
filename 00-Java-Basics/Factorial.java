public class Factorial {
    static long iterative(int n) {
        long res = 1;
        for (int i = 2; i <= n; i++) res *= i;
        return res;
    }

    static long recursive(int n) {
        return n <= 1 ? 1 : n * recursive(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(iterative(10));
        System.out.println(recursive(10));
    }
}