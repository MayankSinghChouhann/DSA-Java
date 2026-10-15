public class ReverseLinkedList {
    static class Node { int val; Node next; Node(int v) { val = v; } }

    static Node reverse(Node head) {
        Node prev = null;
        while (head != null) {
            Node nxt = head.next;
            head.next = prev;
            prev = head;
            head = nxt;
        }
        return prev;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        for (Node n = reverse(head); n != null; n = n.next) System.out.print(n.val + " ");
    }
}
// Three pointers: prev, curr, next. Time O(n), Space O(1).
