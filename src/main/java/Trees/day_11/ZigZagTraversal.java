package Trees.day_11;

import Trees.dto.BinaryTree;
import Trees.dto.Node;
import util.TreeUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ZigZagTraversal {

    public static void main(String[] args) {
        BinaryTree binaryTree = TreeUtil.binaryTreeTwo();
        List<Integer> zigZagTraversal = getZigZagTraversal(binaryTree.root);
        System.out.println(zigZagTraversal);
    }

    private static List<Integer> getZigZagTraversal(Node root){

        if(root == null){
            return null;
        }
        boolean isLeftToRight = true;
        List<Integer> resultant = new ArrayList<>();
        Stack<Node> current_Level = new Stack<>();
        Stack<Node> next_level = new Stack<>();
        current_Level.add(root);
        while(!current_Level.isEmpty()){
            Node pop = current_Level.pop();
            resultant.add(pop.data);
            if(isLeftToRight){
                if(pop.left!=null){
                    next_level.add(pop.left);
                }
                if(pop.right!=null){
                    next_level.add(pop.right);
                }
            }else{
                if(pop.right!=null){
                    next_level.add(pop.right);
                }
                if(pop.left!=null){
                    next_level.add(pop.left);
                }
            }

            if(current_Level.isEmpty()){
                isLeftToRight = !isLeftToRight;
                Stack<Node> temp = current_Level;
                current_Level = next_level;
                next_level = temp;
            }

        }
        return resultant;
    }
}
