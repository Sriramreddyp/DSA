public class DoublyLinkedList {
 public DoublyNode head;
 public DoublyNode tail;
 int size;

 public DoublyNode CreateDoublyLinkedList(int value) {

  head = new DoublyNode();
  DoublyNode node = new DoublyNode();
  node.value = value;
  node.prev = null;
  node.next = null;
  head = node;
  tail = node;
  size = 1;
  return head;

 }

 public void InsertNode(int location, int value) {
  DoublyNode node = new DoublyNode();
  node.value = value;
  if (head == null) {
   CreateDoublyLinkedList(value);
   return;
  } else if (location == 0) {
   node.next = head;
   node.prev = null;
   head.prev = node;
   head = node;
  } else if (location >= size) {
   node.next = null;
   node.prev = tail;
   tail.next = node;
   tail = node;
  } else {
   DoublyNode tempNode = head;
   int index = 0;
   while (index < location - 1) {
    tempNode = tempNode.next;
    index++;
   }
   node.prev = tempNode;
   node.next = tempNode.next;
   tempNode.next = node;
   tempNode.next.prev = node;
  }
  size++;
 }

 public void traverse() {
  DoublyNode tempNode = head;
  if (head == null) {
   System.out.println("DLinked List Doesnt Exist..");
   return;
  } else {
   for (int i = 0; i < size; i++) {
    System.out.print(tempNode.value);
    if (i != size - 1) {
     System.out.print(" -> ");
    }
    tempNode = tempNode.next;
   }

  }
  System.out.println();
 }

 public void ReverseTraverse() {
  DoublyNode tempNode = tail;
  if (head == null) {
   System.out.println("DLinked List Doesnt Exist..");
   return;
  } else {
   for (int i = size; i > 0; i--) {
    System.out.print(tempNode.value);
    if (i != 1) {
     System.out.print(" -> ");
    }
    tempNode = tempNode.prev;
   }

  }
  System.out.println();
 }

 public boolean Search(int valueToBeSearched) {
  DoublyNode tempNode = head;

  if (head == null) {
   return false;
  } else {
   for (int i = 0; i < size; i++) {
    if (tempNode.value == valueToBeSearched) {
     System.out.println("Value Found at Index : " + i);
     return true;
    }
    tempNode = tempNode.next;
   }
   System.out.println("Value Not Found");
   return false;
  }
 }

 public void DeleteNode(int location) {
  if (head == null) {
   return;
  } else if (location == 0) {
   if (size == 1) {
    head = null;
    tail = null;
    size--;
    return;
   }
   head = head.next;
   head.prev = null;
   size--;
  } else if (location >= size - 1) {
   if (size == 1) {
    head = null;
    tail = null;
    size--;
    return;
   }
   tail = tail.prev;
   tail.next = null;
   size--;
  } else {
   DoublyNode tempNode = head;
   for (int i = 0; i < location - 1; i++) {
    tempNode = tempNode.next;
   }
   tempNode.next = tempNode.next.next;
   tempNode.next.prev = tempNode;
   size--;
  }
 }

 public void DeleteList() {
  DoublyNode tempNode = head.next;
  for (int i = 1; i < size; i++) {
   tempNode.prev = null;
   tempNode = tempNode.next;
  }
  head = null;
  tail = null;
  System.out.println("DLL Has Been Deleted..");
 }
}
