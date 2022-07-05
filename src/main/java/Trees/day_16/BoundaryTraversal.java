package Trees.day_16;

import Trees.dto.BinaryTree;
import Trees.dto.Node;
import util.TreeUtil;

import java.util.ArrayList;
import java.util.List;

public class BoundaryTraversal {
    static List<Integer> temp = new ArrayList<>();

    public static void main(String[] args) {
        BinaryTree binaryTree = TreeUtil.binaryTreeTwo();
        List<Integer> traverse = traverse(binaryTree.root);
        System.out.println(traverse);
    }

    private static boolean isLeaf(Node node) {
        if (node.left == null && node.right == null) {
            return true;
        }
        return false;
    }

    private static void addLeaf(Node root, List<Integer> list) {
        if (isLeaf(root)) {
            list.add(root.data);
        }
        if (root.left!=null) addLeaf(root.left,list);
        if (root.right!=null) addLeaf(root.right,list);
    }

    public static List<Integer> traverse(Node root) {
        List<Integer> list = new ArrayList<>();
        list.add(root.data);
        traverseLeft(root, list);
        addLeaf(root, list);
        traverseRight(root, list);
        return list;
    }

    private static void traverseRight(Node root, List<Integer> list) {

        if (root == null) {
            return;
        }
        Node current = root.right;
        while (current != null) {
            if (!isLeaf(root)) {
                temp.add(current.data);
            }
            if (root.right != null) {
               current = current.right;
            } else {
                current = current.left;
            }
        }
        for (int i = temp.size() - 1; i >= 0; i--) {
            list.add(temp.get(i));
        }
    }

    private static void traverseLeft(Node root ,List<Integer> list){
        if(root == null){
            return;
        }
        Node current =root.left;
        while (current!=null) {
            if (!isLeaf(root)) {
            list.add(current.data);
            }
                if (current.left != null) {
                    current = current.left;
                } else {
                    current = current.right;
                }
            }
        }
    }

