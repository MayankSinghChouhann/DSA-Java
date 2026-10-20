import java.util.ArrayDeque;
import java.util.Deque;

public class MinStack {
    private final Deque<Integer> data = new ArrayDeque<>();
    private final Deque<Integer> mins = new ArrayDeque<>();

    void push(int x) {
        data.push(x);
        mins.push(mins.isEmpty() ? x : Math.min(x, mins.peek()));
    }

    int pop() { mins.pop(); return data.pop(); }
    int top() { return data.peek(); }
    int getMin() { return mins.peek(); }

    public static void main(String[] args) {
        MinStack s = new MinStack();
        s.push(5); s.push(2); s.push(8);
        System.out.println(s.getMin());
        s.pop(); s.pop();
        System.out.println(s.getMin());
    }
}
// A second stack tracks the running minimum so getMin stays O(1).
