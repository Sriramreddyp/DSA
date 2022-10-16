public class LinkedList {
 public Node head;
 public Node tail;
 public int size;

 public void createLL(int value) {
  Node node = new Node();
  node.value = value;
  node.next = null;
  head = node;
  tail = node;
  size = 1;
 }

 public void insertNode(int value) {
  if (head == null) {
   createLL(value);
   return;
  }
  Node node = new Node();
  node.value = value;
  node.next = null;
  tail.next = node;
  tail = node;
  size++;
 }

 public void traverse() {
  Node tempNode = head;
  for (int i = 0; i < size; i++) {
   System.out.print(tempNode.value);
   if (i != size - 1) {
    System.out.print(" -> ");
   }
   tempNode = tempNode.next;

  }
  System.out.println();
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

}
