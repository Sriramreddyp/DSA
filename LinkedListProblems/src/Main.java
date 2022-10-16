public class Main {
 public static void main(String[] args) {

  // LL.createLL(1);
  // LL.insertNode(2);
  // LL.insertNode(3);
  // LL.insertNode(4);
  // LL.insertNode(5);
  // LL.insertNode(6);
  // LL.insertNode(7);

  // LL.traverse();

  Questions q = new Questions();

  // LL.traverse();
  // q.NthElement(LL, 7);

  LinkedList L1 = new LinkedList();
  LinkedList L2 = new LinkedList();

  L1.insertNode(4);
  L1.insertNode(1);
  L1.insertNode(10);

  // L1.traverse();

  L2.insertNode(5);
  L2.insertNode(6);
  L2.insertNode(1);

  // L2.traverse();

  // LinkedList R = q.Sum(L1, L2);
  // R.traverse();

  q.addSameNode(L1, L2, 8);
  q.addSameNode(L1, L2, 4);
  q.addSameNode(L1, L2, 5);

  Node inter = q.Intersection(L1, L2);
  System.out.println(inter.value);

 }
}
