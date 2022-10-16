package com.Package;



public class BST {
    public BSTNode root;

    public BST(){
        root = null;
    }
    private BSTNode insert(BSTNode currentNode,int value){
        if(currentNode == null) {
            BSTNode newNode = new BSTNode();
            newNode.value = value;
            return newNode;
        }
        else if(value <= currentNode.value){
            currentNode.left = insert(currentNode.left,value);
            return currentNode;
        }else{
            currentNode.right = insert(currentNode.right,value);
            return  currentNode;
        }
    }

    void insertNode(int value){
        root = insert(root,value);
    }

    BSTNode Search(BSTNode node,int value){
        if(node == null){
            return null;
        }else if(value == node.value){
            return node;
        }
        else if(value <= node.value){
            node = Search(node.left,value);
            return  node;
        }else {
            node = Search(node.right,value);
            return  node;
        }
    }

    BSTNode minimum(BSTNode node){
        if(node.left == null){
            return node;
        }else{
            return  minimum(root.left);
        }
    }

    BSTNode deleteNode(BSTNode node,int value){
        if(node == null){
            return null;
        }
        if(value <= node.value){
            node.left = deleteNode(node.left,value);
        }else if(value > node.value){
            node.right = deleteNode(node.right,value);
        }else{
            if(node.left != null && node.right != null){
                BSTNode temp = new BSTNode();
                temp = node;
                BSTNode minimum = minimum(temp.right);
                node.value = minimum.value;
                node.right = deleteNode(node.right,minimum.value);
            }else if(node.left != null){
                node = node.left;
            }else if(node.right != null){
                node = node.right;
            }else{
                return  null;
            }
        }
        return node;
    }

}
