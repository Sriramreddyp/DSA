package com.Package;

public class CircularLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node CreateCLL(int value){
        head = new Node();
        Node node  = new Node();
        node.value = value;
        node.next  = node;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public void insertNode(int location,int value){
        Node node = new Node();
        node.value = value;
        if(head == null){
            return;
        }
        if(location == 0){
            node.next = head;
            head = node;
            tail.next = head;
        }else if(location >= size){
            tail.next = node;
            tail = node;
            tail.next = head;
        }else{
            Node tempNode = head;
            for(int i = 0;i<location - 1;i++){
                tempNode = tempNode.next;
            }
            Node newNode = tempNode.next;
            tempNode.next = node;
            node.next = newNode;
        }
        size++;
    }

    public void DeleteNode(int location){
        if(head == null){
            return;

        }
        if(location == 0){
            if(size == 1){
                head = null;
                tail = null;
                head.next = null;
                size--;
                return;
            }else{
                head = head.next;
                tail.next = head;
                size--;
            }
        }else if(location >= 0) {
            if (size == 1) {
                head = null;
                tail = null;
                head.next = null;
                size--;
                return;
            } else {
                Node tempNode = head;
                for (int i = 0; i < size; i++) {
                    tempNode = tempNode.next;
                }
                tempNode.next = head;
                tail = tempNode;
                size--;
            }
        }else{
            Node tempNode = head;
            for(int i = 0;i<location - 1;i++){
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }


}
