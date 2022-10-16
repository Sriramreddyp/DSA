public class Main {
 public static void main(String[] args) {
  CircularDoublyLinkedList CDLL = new CircularDoublyLinkedList();

  CDLL.CreateCircularDLL(10);
  System.out.println(CDLL.tail.next.value);
  CDLL.InsertNode(0, 1);
  CDLL.InsertNode(2, 2);
  CDLL.InsertNode(3, 3);
  CDLL.InsertNode(4, 4);

  CDLL.traverse();
  CDLL.DeleteList();
  CDLL.traverse();
 }

}
