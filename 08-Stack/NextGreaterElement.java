import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class NextGreaterElement {
    static int[] nextGreater(int[] a) {
        int[] res = new int[a.length];
        Arrays.fill(res, -1);
        Deque<Integer> st = new ArrayDeque<>();
        for (int i = 0; i < a.length; i++) {
            while (!st.isEmpty() && a[st.peek()] < a[i]) res[st.pop()] = a[i];
            st.push(i);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(nextGreater(new int[]{4, 5, 2, 25})));
    }
}
// Monotonic decreasing stack of indices. Each element is pushed and popped once: O(n).
