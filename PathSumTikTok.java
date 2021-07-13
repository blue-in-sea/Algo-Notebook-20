  public class PathSumTikTok {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    
    static class tuple {
        TreeNode curNode;
        int curVal;

        public tuple(TreeNode node, int curVal) {
            this.curNode = node;
            this.curVal = curVal;

        }
    }

    // breath first search
    private static int bfs(TreeNode root) {
        Deque<tuple> q = new ArrayDeque<>();
        q.offer(new tuple(root, root.val));
        int sum = 0;

        while (!q.isEmpty()) {
            tuple t = q.poll();

            TreeNode node = t.curNode;
            int curVal = t.curVal;

            // leave node
            if (node.left == null && node.right == null) sum += curVal;


            if (node.left != null) {
                q.offer(new tuple(node.left, curVal * 10 + node.left.val));
            }

            if (node.right != null) {
                q.offer(new tuple(node.right, curVal * 10 + node.right.val));
            }
        }

        return sum;
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(3);

        root.right = new TreeNode(4);
        root.right.right = new TreeNode(7);

        System.out.println("bfs:" + bfs(root));
        System.out.println("dfs:" + pathSum(root));
    }
}
