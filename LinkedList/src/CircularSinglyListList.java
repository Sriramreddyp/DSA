public class CircularSinglyListList {
 public Node head;
 public Node tail;

 int size;

 public Node CreateCircularSinglyLinkedList(int value) {
  head = new Node();
  Node node = new Node();

  node.value = value;
  node.next = node;
  head = node;
  tail = node;
  size = 1;

  return head;

 }

 public void insertCSLL(int nodeValue, int location) {
  Node node = new Node();
  node.value = nodeValue;
  if (head == null) {
   CreateCircularSinglyLinkedList(nodeValue);
   return;
  } else if (location == 0) {
   node.next = head;
   head = node;
   tail.next = head;
  } else if (location >= size) {
   // node.next = tail.next;
   tail.next = node;
   tail = node;
   tail.next = head;

  } else {
   Node tempNode = head;
   int index = 0;
   while (index < location - 1) {
    tempNode = tempNode.next;
    index++;
   }
   node.next = tempNode.next;
   tempNode.next = node;
  }
  size++;
 }

 public void traversal() {
  if (head == null) {
   return;
  }
  Node currNode = head;
  for (int i = 0; i < size; i++) {
   System.out.print(currNode.value);
   if (i != size - 1) {
    System.out.print(" -> ");
   }
   currNode = currNode.next;
  }
  System.out.println();
 }

 public boolean Search(int valueToBeSearched) {
  if (head == null)
   return false;
  Node currNode = head;
  for (int i = 0; i < size; i++) {
   if (currNode.value == valueToBeSearched) {
    System.out.print("Value Founded at index : " + i);
    return true;

   }
   currNode = currNode.next;
  }
  System.out.println("Value Not Found : ");
  return false;
 }

 public void DeleteCSLLNode(int location) {
  if (head == null) {
   System.out.println("CSLL Doesnt Exist");
   return;
  } else if (location == 0) {

   head = head.next;
   tail.next = head;
   size--;
   if (size == 0) {
    tail = null;
    head.next = null;
    head = null;

   }

  } else if (location >= size) {
   Node TempNode = head;
   for (int i = 0; i < size - 1; i++) {
    TempNode = TempNode.next;
   }
   if (TempNode == head) {
    head.next = null;
    head = tail = null;
    size--;
    return;
   }
   TempNode.next = head;
   tail = TempNode;
   size--;
   return;
  } else {
   Node tempNode = head;
   for (int i = 0; i < location - 1; i++) {
    tempNode = tempNode.next;
   }
   tempNode.next = tempNode.next.next;
   size--;

  }
 }

 public void deleteCSLL() {
  if (head == null) {
   System.out.println("Linked List Doesnt Exist");
  } else {
   head = null;
   tail.next = null;
   tail = null;
   System.out.println("CSLL Sucefully Deleted");
  }

 }
}
