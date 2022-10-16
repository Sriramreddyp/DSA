public class Main {
 public static void main(String[] args) {
  AVL tree = new AVL();
  tree.insert(5);
  tree.insert(10);
  tree.insert(15);
  tree.insert(20);
  tree.levelOrder();
  System.out.println();
  tree.Delete(5);
  tree.levelOrder();

 }
}
