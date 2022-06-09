package Trees.day_3;

import Trees.dto.BinaryTree;
import Trees.dto.Node;
import util.TreeUtil;

public class Diameter {
    public static void main(String[] args) {
        BinaryTree binaryTree = TreeUtil.binaryTreeTwo();
        System.out.println(getDiameter(binaryTree.root));
    }

    /**
     *
     * @param root
     * @return Time Complexity O(n * n)
     */
    public static int getDiameter(Node root) {
        if (root == null) {
            return 0;
        }
        int diameterLeft = getDiameter(root.left);
        int diameterRight = getDiameter(root.right);

        int heightLeft = TreeUtil.height(root.left);
        int heightRight = TreeUtil.height(root.right);
        return Math.max(heightLeft + heightRight + 1, Math.max(diameterLeft, diameterRight));
    }

}
