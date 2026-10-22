public class TreeHeight {
    static class Node { int val; Node left, right; Node(int v) { val = v; } }

    static int height(Node n) {
        return n == null ? 0 : 1 + Math.max(height(n.left), height(n.right));
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(3);
        System.out.println(height(root));
    }
}