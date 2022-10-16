package com.Package;

public class DoublyLinkedList {
    public DoublyNode head;
    public DoublyNode tail;
    public  int size;

    public DoublyNode CreateDLL(int value){
        head = new DoublyNode();
        DoublyNode node = new DoublyNode();
        node.prev = null;
        node.next = null;
        head = node;
        tail = node;
        size++;
        return head;
    }

    public void insertNode(int location,int value){
        DoublyNode node = new DoublyNode();
        node.value = value;
        if(head == null){
            return;
        }
        if(location == 0){
            node.next = head;
            node.prev = null;
            head.prev = node;
            head = node;
        }else if(location >= size){
            tail.next = node;
            node.prev = tail;
            tail = node;
            tail.next = null;
        }else{
            DoublyNode tempNode = head;
            for(int i =0;i<location - 1;i++){
                tempNode = tempNode.next;
            }
            node.prev = tempNode;
            node.next = tempNode.next;
            tempNode.next.prev = node;
            tempNode.next = node;
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
                size--;
                return;
            }else{
                head = head.next;
                head.prev = null;
                size--;
            }
        }else if(location >= size-1){
            if(size == 1){
                head = null;
                tail = null;
                size--;
                return;
            }else{
                tail = tail.prev;
                tail.next = null;
                size--;
            }
        }else{
            DoublyNode tempNode = head;
            for(int i = 0;i<location - 1;i++){
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            tempNode.next.prev = tempNode;
            size--;
        }
    }


}
