package Trees.day_6;

import Trees.dto.BinaryTree;
import Trees.dto.Node;
import util.TreeUtil;

import java.util.LinkedList;
import java.util.Queue;

public class RightView {

    public static void main(String[] args) {

        BinaryTree binaryTree = TreeUtil.binaryTreeTwo();
        right(binaryTree.root);

    }
    public static void right(Node right){
        Queue<Node> q = new LinkedList<Node>();
        q.add(right);
        while (!q.isEmpty()){
            int n= q.size();
            for(int i =1;i<=n;i++){
                Node poll = q.poll();
                if(i==n)
                System.out.println(poll.data);
                if(poll.left!=null){
                    q.add(poll.left);
                }
                if(poll.right!=null){
                    q.add(poll.right);
                }
            }
        }

    }
}
