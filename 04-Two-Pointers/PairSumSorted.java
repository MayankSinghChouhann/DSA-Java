import java.util.Arrays;

public class PairSumSorted {
    static int[] pairSum(int[] a, int target) {
        int l = 0, r = a.length - 1;
        while (l < r) {
            int s = a[l] + a[r];
            if (s == target) return new int[]{l, r};
            if (s < target) l++; else r--;
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(pairSum(new int[]{1, 3, 4, 6, 9}, 10)));
    }
}