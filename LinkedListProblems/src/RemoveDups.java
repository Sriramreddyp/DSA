public class RemoveDups {

 public static void main(String[] args) {

  LinkedList LL = new LinkedList();
  LL.createLL(1);
  LL.insertNode(1);
  LL.insertNode(2);
  LL.insertNode(2);
  LL.insertNode(2);
  LL.insertNode(3);
  LL.insertNode(3);

  LL.traverse();

  Node tempNode = LL.head;

  for (int i = 0; i < LL.size; i++) {
   if (tempNode == LL.tail)
    break;
   Node tempNodeNext = tempNode.next;
   for (int j = 1; j < LL.size - i; j++) {
    if (tempNode.value == tempNodeNext.value) {
     LL.DeleteOfNode(j);
    }
    tempNodeNext = tempNodeNext.next;
   }
   tempNode = tempNode.next;
  }

  LL.traverse();

 }
}
