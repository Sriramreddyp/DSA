package com.Package;

public class SinglyLinkedList {
    public Node head;
    public Node tail;
    int size;

    public Node CreateSinglyLinkedList(int value){
        Node node = new Node();
        Node head = new Node();
        node.next = null;
        node.value = value;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public void InsertNode(int location,int Value){
        Node node = new Node();
        node.value = Value;
        if(head == null){
            return;
        }else if(location == 0){
            node.next = head;
            head = node;
        }else if(location >= size){
            tail.next = node;
            node.next = null;
            tail = node;
        }else{
            Node tempNode = new Node();
            int index = 0;
            while(index < location - 1){
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
        size++;
    }

    public void traverse(){
        Node currNode = head;
        for(int i = 0;i<size;i++){
            System.out.println(currNode.value);
            currNode = currNode.next;
        }
    }

    public void DeleteNode(int location){
        if(head == null){
            return;
        }
        if(location == 0){
            if(size == 1){
                head.next = null;
                tail.next = null;
                size--;
                return;
            }else{
                head = head.next;
                size--;
            }
        }else if(location >= 0){
            if(size == 1){
                head.next = null;
                tail.next = null;
                size--;
                return;
            }else{
                Node tempNode = head;
                for(int i = 0;i<size;i++){
                    tempNode = tempNode.next;
                }
                tempNode.next = null;
                tail = tempNode;
                size--;
            }
        }else{
            Node tempNode = head;
            for(int i = 0;i<size;i++){
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }



}
