import java.util.Arrays;

public class ArrayBasics {
    public static void main(String[] args) {
        int[] arr = {5, 3, 9, 1, 7};
        int max = Integer.MIN_VALUE, sum = 0;
        for (int x : arr) { max = Math.max(max, x); sum += x; }
        System.out.println("Max: " + max + ", Sum: " + sum);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}