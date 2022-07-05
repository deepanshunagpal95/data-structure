package util;

import Trees.dto.BinaryTree;
import Trees.dto.Node;

public class TreeUtil {
    /**
     *           1
     *     2           3
     * 4      5     6      7
     * @return
     */
    public static BinaryTree buildBinaryTree() {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        return tree;
    }

    /**
     *                  10
     *              2         3
     *           7     8   12        15
     *                            14
     * @return
     */
    public static BinaryTree binaryTreeTwo(){
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(10);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(7);
        tree.root.left.right = new Node(8);
        tree.root.right.right = new Node(15);
        tree.root.right.left = new Node(12);
        tree.root.right.right.left = new Node(14);
        return tree;
    }

    public static BinaryTree binaryTreeThree(){
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(8);
        tree.root.left = new Node(3);
        tree.root.right = new Node(10);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(6);
        tree.root.right.right = new Node(14);
        tree.root.right.right.left = new Node(13);
        tree.root.left.right.left = new Node(4);
        tree.root.left.right.right = new Node(7);
        return tree;
    }

    public static int height(Node node) {
        if (node == null) {
            return 0;
        } else {
            int lHeight = height(node.left);
            int rHeight = height(node.right);
            if (lHeight > rHeight) {
                return lHeight + 1;
            } else {
                return rHeight + 1;
            }
        }
    }
}
