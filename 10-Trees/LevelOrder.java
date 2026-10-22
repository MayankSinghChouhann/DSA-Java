import java.util.ArrayDeque;
import java.util.Queue;

public class LevelOrder {
    static class Node { int val; Node left, right; Node(int v) { val = v; } }

    static void levelOrder(Node root) {
        if (root == null) return;
        Queue<Node> q = new ArrayDeque<>();
        q.add(root);
        while (!q.isEmpty()) {
            int sz = q.size();
            for (int i = 0; i < sz; i++) {
                Node n = q.poll();
                System.out.print(n.val + " ");
                if (n.left != null) q.add(n.left);
                if (n.right != null) q.add(n.right);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2); root.right = new Node(3);
        root.right.left = new Node(4);
        levelOrder(root);
    }
}
// BFS: take q.size() at the start of each level to process one level at a time.
