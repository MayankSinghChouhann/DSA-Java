public class CircularQueue {
    private final int[] buf;
    private int head = 0, size = 0;

    CircularQueue(int cap) { buf = new int[cap]; }

    boolean offer(int x) {
        if (size == buf.length) return false;
        buf[(head + size++) % buf.length] = x;
        return true;
    }

    int poll() {
        int v = buf[head];
        head = (head + 1) % buf.length;
        size--;
        return v;
    }

    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(3);
        q.offer(1); q.offer(2); q.offer(3);
        System.out.println(q.offer(4));
        System.out.println(q.poll());
    }
}