package com.chamalidev.binarysearchtree;

import java.util.ArrayList;
import java.util.List;

// in order traversal l->root->r -  Visits BST Nodes in Ascending Order
public class kthSmallestSolution {
    public int kthSmallest(TreeNode root,int k){
        List<Integer> list = new ArrayList<>();
        inOrder(root, list);
        System.out.println(list);
        return list.get(k-1);
    }

    private void inOrder(TreeNode node,List<Integer> list){
        if(node!=null){
           inOrder(node.left, list);
           list.add(node.val);
           inOrder(node.right, list);
        }
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.right.right=new TreeNode(6);

        kthSmallestSolution solution= new kthSmallestSolution();
        System.out.println(solution.kthSmallest(root, 3));
    }
}
