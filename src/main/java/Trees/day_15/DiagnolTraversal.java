package Trees.day_15;

import Trees.dto.BinaryTree;
import Trees.dto.Node;
import util.TreeUtil;

import java.util.LinkedList;
import java.util.Queue;

public class DiagnolTraversal {
    public static void main(String[] args) {
        BinaryTree binaryTree = TreeUtil.binaryTreeThree();
        printDiagonal(binaryTree.root);
    }

    public static void printDiagonal(Node root){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node poll = queue.poll();
            while(poll!=null){
                if(poll.left!=null){
                    queue.add(poll.left);
                }
                System.out.println(poll.data);
                poll=poll.right;
            }
        }

    }
}
