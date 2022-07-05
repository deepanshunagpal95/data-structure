package Trees.day_13;

import Trees.dto.BinaryTree;
import Trees.dto.Node;
import util.TreeUtil;

public class ConvertTreeToDLL {

    public static void main(String[] args) {

        BinaryTree binaryTree = TreeUtil.binaryTreeTwo();
        convertToDll(binaryTree.root);

    }

    public static Node head = null;
    public  static Node prev = null;

    private static void convertToDll(Node root){
        if(root == null){
            return;
        }
        convertToDll(root.left);

        if(prev == null){
           head = root;
        }else{
            prev.right = root;
            root.left = prev;
        }
        prev = root;
        convertToDll(root.right);
    }
}
