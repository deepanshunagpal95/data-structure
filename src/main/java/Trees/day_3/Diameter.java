package Trees.day_3;

import Trees.dto.BinaryTree;
import Trees.dto.Node;
import util.TreeUtil;

/**
 * No of nodes in the largest path btw two leaf nodes
 */
public class Diameter {
    public static void main(String[] args) {
        BinaryTree binaryTree = TreeUtil.binaryTreeTwo();
        System.out.println(getDiameter(binaryTree.root));
        int [] diamater = new int[1];
        diamater[0] =  getDia(binaryTree.root, diamater);
        System.out.println(diamater[0]);
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

    public static int getDia(Node root , int[] diameter){
        if(root == null){
            return 0;
        }

        int dia = getDia(root.left, diameter);
        int dia1 = getDia(root.right, diameter);

        diameter[0] = Math.max(diameter[0] , dia+dia1 +1);
        return 1+Math.max(dia,dia1);
    }

}
