public class DetectCycle {
    static class Node { int val; Node next; Node(int v) { val = v; } }

    static boolean hasCycle(Node head) {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Node a = new Node(1), b = new Node(2), c = new Node(3);
        a.next = b; b.next = c; c.next = a;
        System.out.println(hasCycle(a));
    }
}