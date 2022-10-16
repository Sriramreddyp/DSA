public class Main {
 public static void main(String[] args) {
  // Stack s = new Stack(6);
  // s.push(1);
  // s.push(2);
  // s.push(3);
  // s.traverse();
  // s.pop();
  // s.traverse();

  LinkedListStack ls = new LinkedListStack();
  ls.push(5);
  ls.push(6);
  ls.push(7);
  ls.push(8);

  System.out.println(ls.head.value);
  System.out.println(ls.pop());
  System.out.println(ls.head.value);
  System.out.println(ls.peek());
  System.out.println(ls.isEmpty());
  ls.DeleteStack();
  System.out.print(ls.pop());

 }

}