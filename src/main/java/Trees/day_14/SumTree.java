package Trees.day_14;

import Trees.dto.BinaryTree;
import Trees.dto.Node;
import util.TreeUtil;

public class SumTree {

    public static void main(String[] args) {

        BinaryTree binaryTree = TreeUtil.binaryTreeTwo();
        sumTree(binaryTree.root);
        preorder(binaryTree.root);

    }
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);

    }
    private static int sumTree(Node root){
        if(root == null){
            return 0;
        }
        int oldVal = root.data;
        int data = sumTree(root.left) + sumTree(root.right);;
        return oldVal + data;
    }


}
