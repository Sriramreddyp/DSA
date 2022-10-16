import java.util.HashSet;

public class Questions {

 void DeleteDups(LinkedList ll) {
  HashSet<Integer> hs = new HashSet();
  Node current = ll.head;
  Node prev = null;
  while (current != null) {
   int value = current.value;
   if (hs.contains(value)) {
    prev.next = current.next;
    ll.size--;
   } else {
    hs.add(value);
    prev = current;
   }
   current = current.next;
  }
 }

 void NthElement(LinkedList ll, int location) {
  if (location == 1) {
   System.out.println(ll.tail.value);
   return;
  }
  if (location == ll.size) {
   System.out.println(ll.head.value);
  }

  Node tempNode = ll.head;

  int NthPos = (ll.size - location);
  for (int i = 0; i < NthPos; i++) {
   tempNode = tempNode.next;
   if (i == NthPos - 1) {
    System.out.println(tempNode.value);
   }
  }
 }

 LinkedList Sum(LinkedList l1, LinkedList l2) {

  if (l1.size != l2.size) {
   return null;
  }
  LinkedList Result = new LinkedList();

  int carry = 0;
  int sum = 0;
  int number = 0;

  Node l1Temp = l1.head;
  Node l2Temp = l2.head;

  for (int i = 0; i < l1.size; i++) {
   sum = l1Temp.value + l2Temp.value + carry;
   number = sum % 10;
   carry = sum / 10;
   Result.insertNode(number);
   l1Temp = l1Temp.next;
   l2Temp = l2Temp.next;
  }

  return Result;

 }

 void addSameNode(LinkedList llA, LinkedList llB, int nodeValue) {
  Node newNode = new Node();
  newNode.value = nodeValue;
  llA.tail.next = newNode;
  llA.tail = newNode;
  llB.tail.next = newNode;
  llB.tail = newNode;

 }

 Node Intersection(LinkedList L1, LinkedList L2) {

  Node OpNode1 = L1.head;
  Node OpNode2 = L2.head;
  int diff = L1.size - L2.size;

  if (diff > 0) {
   for (int i = 0; i < diff; i++) {
    OpNode1 = OpNode1.next;
   }
   while (OpNode1 != null && OpNode2 != null) {
    if (OpNode1.next == OpNode2.next) {
     return OpNode1.next;
    }
    OpNode1.next = OpNode1.next.next;
    OpNode2.next = OpNode2.next.next;
   }
  } else if (diff < 0) {
   diff = Math.abs(diff);
   for (int i = 0; i < diff; i++) {
    OpNode2 = OpNode2.next;
   }
   while (OpNode1 != null && OpNode2 != null) {
    if (OpNode1.next == OpNode2.next) {
     return OpNode1.next;
    }
    OpNode1.next = OpNode1.next.next;
    OpNode2.next = OpNode2.next.next;
   }
  } else {

   while (OpNode1 != null && OpNode2 != null) {
    if (OpNode1.next == OpNode2.next) {
     return OpNode1.next;
    }
    OpNode1.next = OpNode1.next.next;
    OpNode2.next = OpNode2.next.next;
   }

  }

  return null;
 }

 LinkedList partition(LinkedList l1, int x) {
  Node current = l1.head;
  l1.tail = l1.head;

  while (current != null) {
   Node next = current.next;
   if (current.value < x) {
    current.next = l1.head;
    l1.head = current;
   } else {
    l1.tail.next = current;
    l1.tail = current;
   }
   current = next;
  }
  l1.tail.next = null;
  return l1;

 }

}
