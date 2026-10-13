public class SqrtBinarySearch {
    static int sqrt(int x) {
        long lo = 0, hi = x, ans = 0;
        while (lo <= hi) {
            long mid = (lo + hi) / 2;
            if (mid * mid <= x) { ans = mid; lo = mid + 1; }
            else hi = mid - 1;
        }
        return (int) ans;
    }

    public static void main(String[] args) {
        System.out.println(sqrt(50));
    }
}