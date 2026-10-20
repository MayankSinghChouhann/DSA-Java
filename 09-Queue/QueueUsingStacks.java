import java.util.ArrayDeque;
import java.util.Deque;

public class QueueUsingStacks {
    private final Deque<Integer> in = new ArrayDeque<>();
    private final Deque<Integer> out = new ArrayDeque<>();

    void enqueue(int x) { in.push(x); }

    int dequeue() {
        if (out.isEmpty()) while (!in.isEmpty()) out.push(in.pop());
        return out.pop();
    }

    public static void main(String[] args) {
        QueueUsingStacks q = new QueueUsingStacks();
        q.enqueue(1); q.enqueue(2); q.enqueue(3);
        System.out.println(q.dequeue() + " " + q.dequeue());
    }
}