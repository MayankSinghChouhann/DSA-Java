public class MergeSortedLists {
    static class Node { int val; Node next; Node(int v) { val = v; } }

    static Node merge(Node a, Node b) {
        Node dummy = new Node(0), tail = dummy;
        while (a != null && b != null) {
            if (a.val <= b.val) { tail.next = a; a = a.next; }
            else { tail.next = b; b = b.next; }
            tail = tail.next;
        }
        tail.next = (a != null) ? a : b;
        return dummy.next;
    }

    public static void main(String[] args) {
        Node a = new Node(1); a.next = new Node(4);
        Node b = new Node(2); b.next = new Node(3);
        for (Node n = merge(a, b); n != null; n = n.next) System.out.print(n.val + " ");
    }
}
// Dummy head node removes special handling for the first element.
