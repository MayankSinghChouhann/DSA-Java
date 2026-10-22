public class ValidBST {
    static class Node { int val; Node left, right; Node(int v) { val = v; } }

    static boolean isValid(Node n, long lo, long hi) {
        if (n == null) return true;
        if (n.val <= lo || n.val >= hi) return false;
        return isValid(n.left, lo, n.val) && isValid(n.right, n.val, hi);
    }

    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(3); root.right = new Node(8);
        System.out.println(isValid(root, Long.MIN_VALUE, Long.MAX_VALUE));
    }
}