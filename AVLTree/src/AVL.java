import java.util.Queue;
import java.util.LinkedList;

public class AVL {
 public BinaryNode root;

 public AVL() {
  root = null;
 }

 // Preorder Traversal

 void preOrder(BinaryNode node) {
  if (node == null) {
   return;
  }
  System.out.print(node.value + " ");
  preOrder(node.left);
  preOrder(node.right);
 }

 // InOrder traversa;

 void inOrder(BinaryNode node) {
  if (node == null) {
   return;
  }
  inOrder(node.left);
  System.out.print(node.value + " ");
  inOrder(node.right);
 }

 // PostOrder Traversal

 void postOrder(BinaryNode node) {
  if (node == null) {
   return;
  }
  postOrder(node.left);
  postOrder(node.right);
  System.out.print(node.value + " ");

 }

 // LevelOrder Traversal

 void levelOrder() {

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

 // Search

 BinaryNode Search(BinaryNode node, int value) {
  if (node == null) {
   return null;
  } else if (node.value == value) {
   return node;
  } else if (node.value < value) {
   return Search(node.left, value);
  } else {
   return Search(node.right, value);
  }
 }

 // getHeight

 public int getHeight(BinaryNode node) {
  if (node == null) {
   return 0;
  }
  return node.height;
 }

 // Rotate right

 private BinaryNode rotateRight(BinaryNode disbalanceNode) {
  BinaryNode newRoot = disbalanceNode.left;
  disbalanceNode.left = disbalanceNode.left.right;
  newRoot.right = disbalanceNode;
  disbalanceNode.height = 1 + Math.max(getHeight(disbalanceNode.left), getHeight(disbalanceNode.right));
  newRoot.height = 1 + Math.max(getHeight(newRoot.left), getHeight(newRoot.right));
  return newRoot;

 }

 // RotateLeft

 private BinaryNode rotateLeft(BinaryNode disbalancedNode) {
  BinaryNode newRoot = disbalancedNode.right;
  disbalancedNode.right = disbalancedNode.right.left;
  newRoot.left = disbalancedNode;
  disbalancedNode.height = 1 + Math.max(getHeight(disbalancedNode.left), getHeight(disbalancedNode.right));
  newRoot.height = 1 + Math.max(getHeight(newRoot.left), getHeight(newRoot.right));
  return newRoot;
 }

 // getBalance

 public int getbalance(BinaryNode node) {
  if (node == null) {
   return 0;
  }
  return getHeight(node.left) - getHeight(node.right);
 }

 // insertNode

 private BinaryNode insertNode(BinaryNode node, int nodeValue) {
  if (node == null) {
   BinaryNode newNode = new BinaryNode();
   newNode.value = nodeValue;
   newNode.height = 1;
   return newNode;
  } else if (nodeValue < node.value) {
   node.left = insertNode(node.left, nodeValue);
  } else if (nodeValue > node.value) {
   node.right = insertNode(node.right, nodeValue);
  }
  node.height = 1 + Math.max(getHeight(node.left), getHeight(node.right));

  int balance = getbalance(node);

  if (balance > 1 && nodeValue < node.left.value) {
   return rotateRight(node);
  }
  if (balance > 1 && nodeValue > node.left.value) {
   node.left = rotateLeft(node.left);
   return rotateRight(node);
  }
  if (balance < -1 & nodeValue > node.right.value) {
   return rotateLeft(node);
  }
  if (balance < -1 && nodeValue < node.right.value) {
   node.right = rotateRight(node.right);
   return rotateLeft(node);
  }

  return node;
 }

 public void insert(int value) {
  root = insertNode(root, value);
 }

 // Minimum Node

 public static BinaryNode minimumNode(BinaryNode root) {
  if (root.left == null) {
   return root;
  }
  return minimumNode(root.left);
 }

 // Delete Node

 public BinaryNode deleteNode(BinaryNode node, int value) {
  if (node == null) {
   System.out.println("Value not found in AVL Tree");
   return node;
  }
  if (value < node.value) {
   node.left = deleteNode(node.left, value);
  } else if (value > node.value) {
   node.right = deleteNode(node.right, value);
  } else {
   if (node.left != null && node.right != null) {
    BinaryNode temp = node;
    BinaryNode minNode = minimumNode(temp.right);
    node.value = minNode.value;
    node.right = deleteNode(node.right, value);
   } else if (node.left != null) {
    node = node.left;
   } else if (node.right != null) {
    node = node.right;
   } else {
    node = null;
   }
  }

  int balance = getbalance(node);

  if (balance > 1 && getbalance(node.left) >= 0) {
   return rotateRight(node);
  }

  if (balance > 1 && getbalance(node.left) < 0) {
   node.left = rotateLeft(node.left);
   return rotateRight(node);
  }

  if (balance < -1 && getbalance(node.right) <= 0) {
   return rotateLeft(node);
  }

  if (balance < -1 && getbalance(node.right) > 0) {
   node.right = rotateRight(node.right);
   return rotateLeft(node);
  }

  return node;

 }

 public void Delete(int value) {
  root = deleteNode(root, value);
 }

 // Delete Tree

 public void DeleteTree() {
  root = null;
  System.out.println("AVL Tree Sucessfully Deleted");
 }
}
