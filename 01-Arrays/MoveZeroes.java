import java.util.Arrays;

public class MoveZeroes {
    static void moveZeroes(int[] a) {
        int pos = 0;
        for (int i = 0; i < a.length; i++)
            if (a[i] != 0) { int t = a[pos]; a[pos++] = a[i]; a[i] = t; }
    }

    public static void main(String[] args) {
        int[] a = {0, 1, 0, 3, 12};
        moveZeroes(a);
        System.out.println(Arrays.toString(a));
    }
}