public class Main {
 public static void main(String[] args) {
  // SinglyLinkedList sll = new SinglyLinkedList();

  // sll.CreateSinglyLinkedList(5);
  // // sll.insertInLinkedList(2, 0);
  // // sll.insertInLinkedList(9, 8);
  // // sll.insertInLinkedList(3, 2);// Array Indexing
  // // sll.traverse();
  // // sll.Search(9);
  // // sll.DeleteOfNode(4);
  // // sll.traverse();
  // // sll.DeleteOfNode(2);
  // // sll.traverse();
  // // sll.insertInLinkedList(3, 3);//
  // // sll.insertInLinkedList(3, 4);//
  // // sll.traverse();

  // sll.insertInLinkedList(3, 1);
  // sll.traverse();
  // sll.insertInLinkedList(4, 2);
  // sll.insertInLinkedList(5, 3);
  // sll.insertInLinkedList(6, 4);
  // sll.traverse();

  // sll.DeleteOfNode(1);
  // sll.traverse();
  // sll.DeleteOfNode(2);
  // sll.traverse();

  /// Insertion and deletion totally works on array indexing

  CircularSinglyListList cll = new CircularSinglyListList();

  cll.CreateCircularSinglyLinkedList(5);

  cll.insertCSLL(4, 0);
  cll.insertCSLL(6, 2);
  cll.insertCSLL(7, 3);
  cll.insertCSLL(8, 4);
  cll.insertCSLL(9, 5);
  cll.traversal();

  cll.DeleteCSLL(3);
  cll.traversal();

 }

}
