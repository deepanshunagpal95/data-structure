package Trees.day_12;

import Trees.dto.BinaryTree;
import Trees.dto.Node;
import util.TreeUtil;

public class BalancedTree {

    public static void main(String[] args) {
        BinaryTree binaryTree = TreeUtil.binaryTreeTwo();
       // boolean balanced = isBalanced(binaryTree.root);
        //System.out.println(balanced);
        final int i = checkHeight(binaryTree.root);
        if(i == -1){
            System.out.println("Not balanced");
        }else{
            System.out.println("balanced");
        }

    }
 //O(N*N)
    private static boolean isBalanced(Node root){

        if(root == null){
           return false;
        }

        int heightL = height(root.left);
        int heightR = height(root.right);
        if(Math.abs(heightL) - Math.abs(heightR) > 1){
           return false;
        }
        return true;
    }

    private static int checkHeight(Node root){

        if(root == null){
            return 0;
        }

         int left = checkHeight(root.left);
         int right = checkHeight(root.right);

         if(left == -1 || right == -1){
           return -1;
         }
         if(Math.abs(left) -Math.abs(right) > 1){
             return -1;
         }

        return Math.max(left,right) +1;

    }
    private static int height(Node node){
        if(node == null){
            return  0;
        }
        int heightL = height(node.left);
        int heightR = height(node.right);
        return  Math.max(heightL,heightR) +1;
    }
}
