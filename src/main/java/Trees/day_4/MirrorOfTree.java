package Trees.day_4;

import Trees.dto.BinaryTree;
import Trees.dto.Node;
import util.TreeUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * reverse the elements of in order traversal
 */
public class MirrorOfTree {

    public static List<Integer> list = new ArrayList<>();
    public static void main(String[] args) {

        BinaryTree binaryTree = TreeUtil.binaryTreeTwo();
         mirrorImage(binaryTree.root);
        Collections.reverse(list);
        System.out.println(list);
        mirrorTree(binaryTree.root);

    }
    // Function to convert to mirror tree
    // by swapping the left and right links.
    public static Node mirrorTree(Node root)
    {
        if (root == null)
            return null;

        Node left = mirrorTree(root.left);
        Node right = mirrorTree(root.right);

        root.left = right;
        root.right = left;

        return root;
    }
    public static void mirrorImage(Node root){

        if(root == null){
            return ;
        }

        mirrorImage(root.left);
        list.add(root.data);
        mirrorImage(root.right);
    }
}
