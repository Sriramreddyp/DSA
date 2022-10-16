package com.Package;
import java.util.Queue;
import java.util.LinkedList;

public class BinaryTree {
    public BinaryNode root;

    public BinaryTree(){
        root = null;
    }

    void levelOrder(){
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode present = queue.remove();
            System.out.print(present.value + " ");
            if(present.left != null){
                queue.add(present.left);
            }
            if(present.right != null){
                queue.add(present.right);
            }
        }
    }

    boolean compare(BinaryNode root1,BinaryNode root2){
        Queue<BinaryNode> queue1 = new LinkedList<>();
        Queue<BinaryNode> queue2 = new LinkedList<>();
        queue1.add(root1);
        queue2.add(root2);


        while(!queue1.isEmpty() && !queue2.isEmpty()){
            BinaryNode present1 = queue1.remove();
            BinaryNode present2 = queue2.remove();

            if(present1.value != present2.value){
                return false;
            }
            if(present1.left != null){
                queue1.add(present1.left);
            }
            if(present1.right != null){
                queue1.add(present1.right);
            }
            if(present2.left != null){
                queue2.add(present2.left);
            }
            if(present2.right != null){
                queue1.add(present2.right);
            }
        }
        if(queue1.isEmpty() && queue2.isEmpty()) {
            return true;
        }else{
            return  false;
        }
    }


    int height(BinaryNode node){
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        int height = 1;
        while(!queue.isEmpty()){
            BinaryNode present = queue.remove();
            if(present.left != null && present.right != null ){
                queue.add(present.left);
                height++;
            }else if(present.left == null && present.right != null){
                queue.add(present.right);
                height++;

            }else if(present.left != null && present.right == null){
                queue.add(present.left);
                height++;
            }else{
                return height;
            }
        }
        return 0;
    }

    void insertNode(String value){
        BinaryNode node = new BinaryNode();
        node.value = value;
        if(root == null){
            root = node;
            System.out.println("Node Sucessfully inserted into the tree");
            return;
        }
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode present = queue.remove();
            if(present.left == null){
                present.left = node;
                return;
            }
            if(present.right == null){
                present.right = node;
                return;
            }
            queue.add(present.left);
            queue.add(present.right);
        }
    }

     BinaryNode getDeepestNode(){
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        BinaryNode present = new BinaryNode();
        while(!queue.isEmpty()){
            present = queue.remove();
            if(present.left != null){
                queue.add(present.left);
            }
            if(present.right != null){
                queue.add(present.right);
            }
        }
        return present;
    }

    void deleteDeepestNode(){
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        BinaryNode prev,current = null;
        while(!queue.isEmpty()){
            prev = current;
            current = queue.remove();
            if(current.left == null){
                prev.right = null;
                return;
            }
            if(current.right == null){
                current.left = null;
                return;
            }

                queue.add(current.left);


                queue.add(current.right);


        }
    }

    void DeleteNode(String value){
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode present =  queue.remove();
            if(present.value == value){
                String exchange = getDeepestNode().value;
                present.value = exchange;
                deleteDeepestNode();
            }
            if(present.left != null){
                queue.add(present.left);
            }
            if(present.right != null){
                queue.add(present.right);
            }
        }
        System.out.println("Value Not available");
    }


}
