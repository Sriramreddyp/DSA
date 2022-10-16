public class Main {
 public static void main(String[] args) {
  DoublyLinkedList dll = new DoublyLinkedList();

  dll.CreateDoublyLinkedList(1);
  dll.InsertNode(0, 2);
  dll.InsertNode(2, 3);
  dll.InsertNode(3, 4);

  dll.traverse();
  dll.DeleteList();
  dll.traverse();

 }
}
