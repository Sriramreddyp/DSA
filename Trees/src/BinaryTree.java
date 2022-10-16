import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
 public BinaryNode root;

 public BinaryTree() {
  root = null;
 }

 // PreOrder Traversal

 void preOrder(BinaryNode node) {
  if (node == null) {
   return;
  }
  System.out.print(node.value + " ");
  preOrder(node.left);
  preOrder(node.right);
 }

 // InOrder traversal

 void inOrder(BinaryNode node) {
  if (node == null) {
   return;
  }
  inOrder(node.left);
  System.out.print(node.value + " ");
  inOrder(node.right);
 }

 void postOrder(BinaryNode node) {
  if (node == null) {
   return;
  }
  postOrder(node.left);
  postOrder(node.right);
  System.out.print(node.value + " ");
 }

 // Level order Traversal

 void levelOrder() {
  Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
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
  System.out.println();
 }

 // Search Method

 void Search(String value) {
  Queue<BinaryNode> queue = new LinkedList<>();
  queue.add(root);
  while (!queue.isEmpty()) {
   BinaryNode present = queue.remove();

   if (present.value == value) {
    System.out.println("Value present in binaryTree.");
    return;
   } else {
    if (present.left != null) {
     queue.add(present.left);
    }
    if (present.right != null) {
     queue.add(present.right);
    }
   }
  }
  System.out.println("Value is not found..");
 }

 // Insert Method

 void insert(String value) {
  BinaryNode newNode = new BinaryNode();
  newNode.value = value;

  if (root == null) {
   root = newNode;
   System.out.println("Node Successfully inserted at root");
   return;
  }
  Queue<BinaryNode> queue = new LinkedList<>();
  queue.add(root);
  while (!queue.isEmpty()) {
   BinaryNode present = queue.remove();
   if (present.left == null) {
    present.left = newNode;
    System.out.println("Sucessfully Inserted");
    break;
   } else if (present.right == null) {
    present.right = newNode;
    System.out.println("Sucessfully Inserted");
    break;
   } else {
    queue.add(present.left);
    queue.add(present.right);
   }
  }
 }

 // get Deepest node

 public BinaryNode getDeepestNode() {
  Queue<BinaryNode> queue = new LinkedList<>();
  queue.add(root);
  BinaryNode present = null;

  while (!queue.isEmpty()) {
   present = queue.remove();

   if (present.left != null) {
    queue.add(present.left);
   }
   if (present.right != null) {
    queue.add(present.right);
   }
  }
  return present;
 }

 public void deleteDeepestNode() {
  Queue<BinaryNode> queue = new LinkedList<>();
  queue.add(root);
  BinaryNode prev = null;
  BinaryNode current = null;
  while (!queue.isEmpty()) {
   prev = current;
   current = queue.remove();
   if (current.left == null) {
    prev.right = null;
    return;
   }
   if (current.right == null) {
    current.left = null;
    return;
   }
   queue.add(current.left);
   queue.add(current.right);

  }
 }

 // Delete Given Node
 void deleteNode(String value) {
  Queue<BinaryNode> queue = new LinkedList<>();
  queue.add(root);
  while (!queue.isEmpty()) {
   BinaryNode present = queue.remove();
   if (present.value == value) {
    present.value = getDeepestNode().value;
    deleteDeepestNode();
    return;
   } else {
    if (present.left != null) {
     queue.add(present.left);
    }
    if (present.right != null) {
     queue.add(present.right);
    }
   }

  }
  System.out.println("Value not available");
 }

 void delete() {
  root = null;
  System.out.println("Binary Tree Sucessfully Deleted");
 }
}
