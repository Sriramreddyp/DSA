public class Main {
 public static void main(String[] args) {
  Heap newBP = new Heap(4);

  newBP.insert(10, "Max");
  newBP.insert(5, "Max");
  newBP.insert(15, "Max");
  newBP.insert(1, "Max");

  newBP.levelOrder();

  System.out.println(newBP.extractHeadOfBP("Max"));
  newBP.levelOrder();
  System.out.println(newBP.peek());
 }

}