public class RemoveNthFromEnd {
    static class Node { int val; Node next; Node(int v) { val = v; } }

    static Node remove(Node head, int n) {
        Node dummy = new Node(0);
        dummy.next = head;
        Node fast = dummy, slow = dummy;
        for (int i = 0; i < n; i++) fast = fast.next;
        while (fast.next != null) { fast = fast.next; slow = slow.next; }
        slow.next = slow.next.next;
        return dummy.next;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node cur = head;
        for (int i = 2; i <= 5; i++) { cur.next = new Node(i); cur = cur.next; }
        for (Node x = remove(head, 2); x != null; x = x.next) System.out.print(x.val + " ");
    }
}