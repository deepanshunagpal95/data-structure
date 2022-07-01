package Trees.day_9;

import Trees.dto.BinaryTree;
import Trees.dto.Node;
import util.TreeUtil;
import java.util.*;

import java.util.ArrayList;

public class TopView {

    public static class Pair{
        int line;
        Node node;
        Pair(Node node , int line){
            this.node = node;
            this.line = line;
        }
    }
    public static void main(String[] args) {
        /**
         *                  10
         *              2         3
         *           7     8   12        15
         *                            14
         * @return
         */
        BinaryTree binaryTree = TreeUtil.binaryTreeTwo();
        ArrayList<Integer> integers = fetchTopView(binaryTree.root);
        System.out.println(integers);
    }

    public static ArrayList<Integer> fetchTopView(Node root){

        ArrayList<Integer> ans = new ArrayList<>();
        Map<Integer,Node> mp = new TreeMap<>();
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(root , 0));
        while(!queue.isEmpty()){
            Pair poll = queue.poll();
            int line = poll.line;
            Node node = poll.node;
            if(mp.get(line)==null){
                mp.put(line ,node );
            }

            if(node.left!=null){
                queue.add(new Pair(node.left,line - 1));
            }
            if (node.right!=null){
                queue.add(new Pair(node.right,line +1));
            }

        }

        for(Map.Entry<Integer,Node> entry:mp.entrySet()){
            ans.add(entry.getValue().data);
        }
       return ans;
    }
}
