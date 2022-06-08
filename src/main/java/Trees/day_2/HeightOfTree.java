package Trees.day_2;

import Trees.dto.BinaryTree;
import Trees.dto.Node;
import util.TreeUtil;

public class HeightOfTree {

    public static void main(String[] args) {
        BinaryTree binaryTree = TreeUtil.buildBinaryTree();
        System.out.println(height(binaryTree.root));
        System.out.println(TreeUtil.height(binaryTree.root));
    }

    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        return Math.max(left ,right) +1;
    }
}
