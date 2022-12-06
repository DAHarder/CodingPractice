package com.company;

public class BinarySearchTree {
    BSTNode root;

    public BSTNode search(int data){
       BSTNode curNode = this.root;
        if (curNode.data == data){
            return curNode;
        }
        else if (data < curNode.data){
            curNode = curNode.left;
        }
        else {
            curNode = curNode.right;
        }
        return curNode;
    }

    public void insert(BSTNode node){
        if (this.root == null){
            this.root = node;
        }
        else{
            BSTNode curNode = this.root;
            while (curNode != null){
                if (node.data < curNode.data){
                    if (curNode.left == null){
                        curNode.left = node;
                        curNode = null;
                    }
                    else{
                        curNode = curNode.left;
                    }
                }
                else{
                    if (curNode.right == null){
                        curNode.right = node;
                        curNode = null;
                    }
                    else{
                        curNode = curNode.right;
                    }
                }
            }
        }
    }

    public void inOrderTraversalPrint(BSTNode node){
        if (node == null)
            return;
        else{
            inOrderTraversalPrint(node.left);
            System.out.println(node.data);
            inOrderTraversalPrint(node.right);
        }
    }

}

class BSTNode {
    int data;
    BSTNode left;
    BSTNode right;

    public BSTNode(int data) {
        this.data = data;
    }

}
