public class Main {
 public static void main(String[] args) {
  // Queue q = new Queue(5);
  // q.enQueue(1);
  // q.enQueue(2);
  // q.enQueue(3);
  // q.enQueue(4);
  // q.enQueue(5);

  // q.traverse();
  // System.out.println();

  // q.myDeQueue();
  // q.myDeQueue();
  // q.traverse();
  // q.enQueue(1);
  // q.traverse();
  // q.deQueue();
  // System.out.println();
  // q.traverse();

  // q.myDeQueue();
  // System.out.println();
  // q.traverse();

  // q.myDeQueue();
  // System.out.println();
  // q.traverse();

  // q.myDeQueue();
  // q.myDeQueue();
  // q.myDeQueue();

  LinkedListQueue ql = new LinkedListQueue();
  ql.enQueue(1);
  ql.enQueue(2);
  ql.enQueue(3);

  System.out.println(ql.head.value);
  ql.deQueue();
  System.out.println(ql.head.value);
  System.out.println(ql.peek());

  ql.DeleteQueue();
  ql.deQueue();

 }
}
