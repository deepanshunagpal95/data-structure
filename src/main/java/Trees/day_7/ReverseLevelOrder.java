package Trees.day_7;

import Trees.dto.Node;
import util.TreeUtil;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseLevelOrder {

    public static void main(String[] args) {
        ArrayList<Integer> integers = reverseLevelOrder(TreeUtil.binaryTreeTwo().root);
        System.out.println(integers);
    }
    public static ArrayList<Integer> reverseLevelOrder(Node node)
    {
        // code here
        // Your code here
        Queue<Node> queue = new LinkedList<>();
        Stack<Integer> list = new Stack<>();
        ArrayList<Integer> arr = new ArrayList<>();
        queue.add(node);
        while(!queue.isEmpty()){
            Node val = queue.poll();
            list.push(val.data);
            if(val.right !=null){
                queue.add(val.right);
            }
            if(val.left != null){
                queue.add(val.left);
            }


        }
        while(!list.isEmpty()){
            arr.add(list.peek());
            list.pop();
        }
        return arr;
    }
}
