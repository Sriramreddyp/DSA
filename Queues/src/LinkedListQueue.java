public class LinkedListQueue {
 public Node head;
 public Node tail;

 public boolean isEmpty() {
  if (head == null) {
   return true;
  }
  return false;
 }

 public void enQueue(int value) {
  Node node = new Node();
  node.value = value;
  if (isEmpty()) {
   node.next = null;
   head = node;
   tail = node;
  } else {
   tail.next = node;
   tail = node;
   node.next = null;
  }
 }

 public int deQueue() {
  if (isEmpty()) {
   System.out.println("Queue is Empty");
   return -1;
  } else {
   int value = head.value;
   head = head.next;
   return value;
  }
 }

 public int peek() {
  if (isEmpty()) {
   System.out.println("Queue is Empty");
   return -1;
  } else {
   int value = head.value;
   return value;
  }
 }

 public void DeleteQueue() {
  head = null;
  tail = null;
  System.out.println("Queue is deleted");
 }

}
