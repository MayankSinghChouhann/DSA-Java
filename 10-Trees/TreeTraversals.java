public class TreeTraversals {
    static class Node { int val; Node left, right; Node(int v) { val = v; } }

    static void inorder(Node n) { if (n == null) return; inorder(n.left); System.out.print(n.val + " "); inorder(n.right); }
    static void preorder(Node n) { if (n == null) return; System.out.print(n.val + " "); preorder(n.left); preorder(n.right); }
    static void postorder(Node n) { if (n == null) return; postorder(n.left); postorder(n.right); System.out.print(n.val + " "); }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2); root.right = new Node(3);
        root.left.left = new Node(4); root.left.right = new Node(5);
        inorder(root); System.out.println();
        preorder(root); System.out.println();
        postorder(root);
    }
}