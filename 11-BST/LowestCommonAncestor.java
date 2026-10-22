public class LowestCommonAncestor {
    static class Node { int val; Node left, right; Node(int v) { val = v; } }

    static Node lca(Node root, int p, int q) {
        while (root != null) {
            if (p < root.val && q < root.val) root = root.left;
            else if (p > root.val && q > root.val) root = root.right;
            else return root;
        }
        return null;
    }

    public static void main(String[] args) {
        Node root = new Node(6);
        root.left = new Node(2); root.right = new Node(8);
        root.left.left = new Node(0); root.left.right = new Node(4);
        System.out.println(lca(root, 2, 8).val);
    }
}