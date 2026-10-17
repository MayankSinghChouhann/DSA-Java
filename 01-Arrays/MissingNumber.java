public class MissingNumber {
    static int missing(int[] a) {
        int n = a.length, expected = n * (n + 1) / 2, sum = 0;
        for (int x : a) sum += x;
        return expected - sum;
    }

    public static void main(String[] args) {
        System.out.println(missing(new int[]{3, 0, 1}));
    }
}