package Trees.day_2;

import Trees.dto.BinaryTree;
import Trees.dto.Node;
import util.TreeUtil;

import java.util.LinkedList;
import java.util.Queue;

/**
 *           1
 *     2           3
 * 4      5     6      7
 *
 */
public class LeftViewOfTree {

    public static void main(String[] args) {
        BinaryTree binaryTree = TreeUtil.buildBinaryTree();
        BinaryTree binaryTree1 = TreeUtil.binaryTreeTwo();
        //leftViewWithoutRecursion(binaryTree.root);
        System.out.println("Example Two");
        leftViewWithoutRecursion(binaryTree1.root);

    }

    /**
     * https://www.geeksforgeeks.org/print-left-view-binary-tree/
     * @param root
     */
    public static void leftViewWithoutRecursion(Node root){
        if(root == null){
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i =0;i<size;i++) {
                Node poll = queue.poll();
                if(i ==0)
                System.out.println(poll.data);
                if (poll.left != null) {
                    queue.add(poll.left);
                }
                if (poll.right != null) {
                    queue.add(poll.right);
                }
            }
        }
    }
}
