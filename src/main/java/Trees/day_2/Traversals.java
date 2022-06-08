package Trees.day_2;

import Trees.dto.BinaryTree;
import Trees.dto.Node;
import util.TreeUtil;

public class Traversals {

    public static void main(String[] args) {
        BinaryTree binaryTree = TreeUtil.buildBinaryTree();
        System.out.println("------Preorder----------");
        preorder(binaryTree.root);
        System.out.println("-------InOrder----------");
        inOrder(binaryTree.root);
        System.out.println("-------Post Order--------");
        postOrder(binaryTree.root);
    }

    public static void postOrder(Node root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);
    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);

    }

    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        preorder(root.left);
        System.out.println(root.data);
        preorder(root.right);

    }
}
