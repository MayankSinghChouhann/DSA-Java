public class PeakElement {
    static int findPeak(int[] a) {
        int lo = 0, hi = a.length - 1;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (a[mid] < a[mid + 1]) lo = mid + 1; else hi = mid;
        }
        return lo;
    }

    public static void main(String[] args) {
        System.out.println(findPeak(new int[]{1, 3, 8, 12, 4, 2}));
    }
}