package DataStructure.Tree;

public class MaxDepth {
    TreeNode root;

    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right) + 1;
    }

    public static void main(String[] args) {
        MaxDepth tree = new MaxDepth();
        tree.root = new TreeNode(3);
        tree.root.left = new TreeNode(9);
        tree.root.right = new TreeNode(20);
        tree.root.right.left = new TreeNode(15);
        tree.root.right.right = new TreeNode(7);
        int result = tree.maxDepth(tree.root);
        System.out.println("Max Depth of given tree is " + result);

    }
}
