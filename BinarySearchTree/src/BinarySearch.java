import java.util.Queue;
import java.util.LinkedList;

public class BinarySearch {
 public BinaryNode root;

 public BinarySearch() {
  root = null;
 }

 private BinaryNode insert(BinaryNode currentNode, int value) {
  if (currentNode == null) {
   BinaryNode newNode = new BinaryNode();
   newNode.value = value;

   System.out.println("The value is sucessfully inserted");
   return newNode;
  } else if (value <= currentNode.value) {
   currentNode.left = insert(currentNode.left, value);
   return currentNode;
  } else {
   currentNode.right = insert(currentNode.right, value);
   return currentNode;
  }
 }

 void insert(int value) {
  root = insert(root, value);
 }

 public void preOrder(BinaryNode node) {
  if (node == null) {
   return;
  }
  System.out.println(node.value + " ");
  preOrder(node.left);
  preOrder(node.right);
 }

 public void inOrder(BinaryNode node) {
  if (node == null) {
   return;
  }
  inOrder(node.left);
  System.out.print(node.value + " ");

  inOrder(node.right);
 }

 public void postOrder(BinaryNode node) {
  if (node == null) {
   return;
  }
  postOrder(node.left);
  postOrder(node.right);
  System.out.print(node.value + " ");

 }

 public void levelOrder() {
  Queue<BinaryNode> queue = new LinkedList<>();
  queue.add(root);
  while (!queue.isEmpty()) {
   BinaryNode present = queue.remove();
   System.out.print(present.value + " ");
   if (present.left != null) {
    queue.add(present.left);
   }
   if (present.right != null) {
    queue.add(present.right);
   }
  }
 }

 BinaryNode search(BinaryNode node, int value) {
  if (node == null) {
   System.out.println("Value doesnt exist in the binary search tree");
   return null;
  } else if (node.value == value) {
   System.out.println("Value exists in the binary search tree");
   return node;
  } else if (value < node.value) {
   return search(node.left, value);
  } else {
   return search(node.right, value);
  }
 }

 // Minimum Node

 public static BinaryNode minimumNode(BinaryNode root) {
  if (root.left == null) {
   return root;
  } else {
   return minimumNode(root.left);
  }
 }

 // delete node
 public BinaryNode delete(BinaryNode root, int value) {
  if (root == null) {
   System.out.println("Value Not found in bst");
   return null;
  }
  if (value < root.value) {
   root.left = delete(root.left, value);
  } else if (value > root.value) {
   root.right = delete(root.right, value);
  } else {
   if (root.left != null && root.right != null) {
    BinaryNode temp = root;
    BinaryNode minimum = minimumNode(temp.right);
    root.value = minimum.value;
    root.right = delete(root.right, minimum.value);
   } else if (root.left != null) {
    root = root.left;
   } else if (root.right != null) {
    root = root.right;
   } else {
    root = null;
   }
  }
  return root;
 }

}
