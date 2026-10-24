import java.util.Arrays;

public class PrefixSum {
    public static void main(String[] args) {
        int[] a = {2, 4, 6, 8, 10};
        int[] p = new int[a.length + 1];
        for (int i = 0; i < a.length; i++) p[i + 1] = p[i] + a[i];
        System.out.println(Arrays.toString(p));
        System.out.println("Sum[1..3] = " + (p[4] - p[1]));
    }
}