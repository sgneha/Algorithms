package DataStructure.Tree;

public class Diameter {
    TreeNode root;

    int dia = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        diameter(root);
        return dia;

    }

    public int diameter(TreeNode root) {

        if (root == null)
            return 0;
        int left = diameter(root.left);
        int right = diameter(root.right);
        dia = Math.max(dia, left + right);
        return Math.max(left, right) + 1;

    }

    public static void main(String[] args) {
        Diameter tree = new Diameter();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);
        int result = tree.diameterOfBinaryTree(tree.root);
        System.out.println("Diameter of given tree is " + result);

    }
}
