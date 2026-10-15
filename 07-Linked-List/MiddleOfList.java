public class MiddleOfList {
    static class Node { int val; Node next; Node(int v) { val = v; } }

    static Node middle(Node head) {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node cur = head;
        for (int i = 2; i <= 5; i++) { cur.next = new Node(i); cur = cur.next; }
        System.out.println(middle(head).val);
    }
}