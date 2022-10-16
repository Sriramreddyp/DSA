public class SinglyLinkedList {
 public Node head;
 public Node tail;
 public int size;

 public Node CreateSinglyLinkedList(int nodevalue) {
  head = new Node();

  Node node = new Node();// reference of that class
  node.next = null;
  node.value = nodevalue;
  head = node;
  tail = node;
  size = 1;
  return head;

 }

 // Insertion method in SinglyLinkedLIst

 public void insertInLinkedList(int nodeValue, int location) {
  Node node = new Node();
  node.value = nodeValue;

  if (head == null) {
   CreateSinglyLinkedList(nodeValue);
   return;
  } else if (location == 0) {
   node.next = head;
   head = node;
  } else if (location >= size) {
   node.next = null;
   tail.next = node;
   tail = node;
  } else {
   Node tempNode = head;
   int index = 0;
   while (index < location - 1) {
    tempNode = tempNode.next;
    index++;
   }
   Node nextNode = tempNode.next;
   tempNode.next = node;
   node.next = nextNode;
  }
  size++;
 }

 public void traverse() {

  if (head == null) {
   System.out.println("LinkedList Doesnt Exist");
  } else {
   Node currNode = head;
   for (int i = 0; i < size; i++) {
    System.out.print(currNode.value);
    if (i != size - 1) {
     System.out.print("-> ");
    }
    currNode = currNode.next;
   }
  }
  System.out.println();
 }

 public boolean Search(int valueToBeSearched) {
  if (head == null) {
   return false;
  } else {
   Node currNode = head;
   for (int i = 0; i < size; i++) {
    if (currNode.value == valueToBeSearched) {
     System.out.println("Value Found at : " + i);
     return true;
    }
    currNode = currNode.next;
   }

  }
  System.out.println("Value not Found");
  return false;
 }

 public void DeleteOfNode(int location) {
  if (head == null) {
   System.out.println("LinkedList doesnt Exist");

  } else if (location == 0) {
   if (size == 1) {
    head.next = tail.next = null;
    return;
   } else {
    head = head.next;
    size--;
   }
  } else if (location >= size) {
   Node tempNode = head;
   for (int i = 0; i < size - 1; i++) {
    tempNode = tempNode.next;
   }
   tempNode.next = null;
   if (tempNode == head) {
    tail.next = head.next = null;
    return;
   }
   tempNode.next = null;
   tail = tempNode;
   size--;

  } else {
   Node tempNode = head;
   for (int i = 0; i < location - 1; i++) {
    tempNode = tempNode.next;
   }
   tempNode.next = tempNode.next.next;
   size--;
  }
 }

 public void DeleteList() {
  head = null;
  tail = null;

  System.out.println("List Sucessfully deleted....");
 }
}
