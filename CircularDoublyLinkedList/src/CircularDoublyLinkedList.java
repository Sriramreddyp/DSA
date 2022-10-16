public class CircularDoublyLinkedList {
 public DoublyNode head;
 public DoublyNode tail;
 int size;

 public DoublyNode CreateCircularDLL(int value) {
  head = new DoublyNode();
  DoublyNode node = new DoublyNode();
  node.value = value;
  node.next = node;
  node.prev = node;
  head = node;
  tail = node;
  size = 1;
  return head;
 }

 public void InsertNode(int location, int value) {
  DoublyNode node = new DoublyNode();
  node.value = value;

  if (head == null) {
   return;
  } else if (location == 0) {
   node.next = head;
   head.prev = node;
   node.prev = tail;
   head = node;
   tail.next = head;
  } else if (location >= size - 1) {
   tail.next = node;
   node.prev = tail;
   node.next = head;
   head.prev = node;
   tail = node;
  } else {
   DoublyNode tempNode = head;
   int index = 0;
   while (index < location - 1) {
    tempNode = tempNode.next;
    index++;
   }
   tempNode.next = node;
   node.prev = tempNode;
   node.next = tempNode.next.next;
   tempNode.next.prev = node;
  }
  size++;
 }

 public void traverse() {
  if (head == null) {
   return;
  } else {
   DoublyNode tempnode = head;

   for (int i = 0; i < size; i++) {
    System.out.print(tempnode.value);
    if (i != size - 1) {
     System.out.print(" -> ");
    }
    tempnode = tempnode.next;
   }
  }
  System.out.println();

 }

 public void ReverseTraverse() {
  if (head == null) {
   return;
  } else {
   DoublyNode tempnode = tail;
   for (int i = 0; i < size; i++) {
    System.out.print(tempnode.value);
    if (i != size - 1) {
     System.out.print(" -> ");
    }
    tempnode = tempnode.prev;
   }
  }
  System.out.println();

 }

 public Boolean Search(int valueToBeSearched) {
  if (head == null) {
   return false;
  } else {
   DoublyNode tempNode = head;
   for (int i = 0; i < size; i++) {
    if (tempNode.value == valueToBeSearched) {
     System.out.println("Value Found a index : " + i);
     return true;
    }
    tempNode = tempNode.next;
   }
  }
  System.out.println("Value Not Found..");
  return false;
 }

 public void DeleteNode(int location) {
  if (head == null) {
   return;
  } else if (location == 0) {
   if (size == 1) {
    head.next = null;
    head.prev = null;
    head = null;
    tail = null;
    size--;
    return;
   } else {
    head = head.next;
    head.prev = tail;
    tail.next = head;
    size--;
    return;
   }
  } else if (location >= size - 1) {
   if (size == 1) {
    head.next = null;
    head.prev = null;
    head = null;
    tail = null;
    size--;
    return;
   } else {
    tail = tail.prev;
    tail.next = head;
    head.prev = tail;
    size--;
    return;
   }
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
  DoublyNode tempNode = head;

  for (int i = 0; i < size; i++) {
   tempNode.prev = null;
   tempNode = tempNode.next;
  }
  head = null;
  tail = null;
  System.out.println("CDLL Sucessfully Deleted..");
 }
}
