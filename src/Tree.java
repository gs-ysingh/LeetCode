import java.util.Stack;

/**
 * Created by YSingh on 04/05/17.
 */

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
}

public class Tree {
    public static void main(String[] args) {
        TreeNode root = null;
        printRootToLeaf(root);
    }

    private static void printRootToLeaf(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        //printRootToLeaf(root, stack);
    }



    private static TreeNode lca(TreeNode root, int a, int b) {
        if(root == null) {
            return null;
        }

        if (root.data == a || root.data == b) {
            return root;
        }

        TreeNode left = lca(root.left, a, b);
        TreeNode right = lca(root.right, a, b);

        if(left != null && right != null) {
            return root;
        }
        if(left != null) {
            return left;
        }
        else {
            return right;
        }
    }
}
