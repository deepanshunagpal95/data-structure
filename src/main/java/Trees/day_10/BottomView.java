package Trees.day_10;

import Trees.day_9.TopView;
import Trees.dto.BinaryTree;
import Trees.dto.Node;
import util.TreeUtil;

import java.util.*;

public class BottomView {

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
        Queue<BottomView.Pair> queue = new LinkedList<>();
        queue.add(new BottomView.Pair(root , 0));
        while(!queue.isEmpty()){
            BottomView.Pair poll = queue.poll();
            int line = poll.line;
            Node node = poll.node;
            mp.put(line ,node );
            if(node.left!=null){
                queue.add(new BottomView.Pair(node.left,line - 1));
            }
            if (node.right!=null){
                queue.add(new BottomView.Pair(node.right,line +1));
            }

        }

        for(Map.Entry<Integer,Node> entry:mp.entrySet()){
            ans.add(entry.getValue().data);
        }
        return ans;
    }
}
