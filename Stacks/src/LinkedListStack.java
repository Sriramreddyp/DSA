public class LinkedListStack {
 public Node head;
 public int size = 0;
 public Node tail;

 public void push(int value) {
  Node node = new Node();
  node.value = value;
  if (head == null) {
   node.next = null;
   head = node;
   tail = node;
   size++;
  } else {
   node.next = head;
   head = node;
   size++;
  }
 }

 public int pop() {
  if (head == null) {
   System.out.println("Stack is Empty");
   return -1;
  }
  int value = head.value;
  head = head.next;
  size--;
  return value;
 }

 public boolean isEmpty() {
  if (head == null) {
   return true;
  }
  return false;

 }

 public int peek() {

  int value = head.value;
  return value;
 }

 public void DeleteStack() {
  head = null;
  tail = null;
  System.out.println("Stack Sucessfully Deleted");
 }

}