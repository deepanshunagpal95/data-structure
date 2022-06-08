package Trees.day_1;

import Trees.dto.BinaryTree;
import Trees.dto.Node;
import util.TreeUtil;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Input:
 *     1
 *   /   \
 *  3     2
 *
 * Output:1 3 2
 */
public class LevelOrderTraversal {

    public static void main(String[] args) {
        BinaryTree tree = TreeUtil.buildBinaryTree();
        BinaryTree binaryTree = TreeUtil.binaryTreeTwo();
        //levelOrderTraversal(tree.root);
        levelOrderTraversal(binaryTree.root);
    }
    public static void levelOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node tempNode = queue.poll();
            System.out.print(tempNode.data);
            System.out.print(" ");
            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }
            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }
    }
}
