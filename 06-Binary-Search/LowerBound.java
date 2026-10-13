public class LowerBound {
    static int lowerBound(int[] a, int target) {
        int lo = 0, hi = a.length;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (a[mid] < target) lo = mid + 1; else hi = mid;
        }
        return lo;
    }

    public static void main(String[] args) {
        System.out.println(lowerBound(new int[]{1, 2, 4, 4, 7}, 4));
    }
}
// Returns the first index with a[i] >= target, or a.length if none exists.
