import java.rmi.server.RemoteRef;

public class Practice {

 public BinaryNode root;

 public Practice() {
  root = null;
 }

 public BinaryNode insert(BinaryNode currentNode, int value) {
  if (currentNode == null) {
   BinaryNode node = new BinaryNode();
   node.value = value;

   System.out.println("Value Sucessfully Inserted");
   return node;
  } else if (value <= currentNode.value) {
   root.left = insert(currentNode.left, value);
   return currentNode;
  } else {
   root.right = insert(currentNode.right, value);
   return currentNode;
  }
 }

 BinaryNode search(BinaryNode node, int value) {
  if (node == null) {
   return null;
  } else if (node.value == value) {
   return node;
  } else if (value < node.height) {
   return search(node.left, value);
  } else {
   return search(node.right, value);
  }

 }

 public BinaryNode minimumNode(BinaryNode node) {
  if (node == null) {
   return null;
  }
  return minimumNode(node.left);
 }

 public BinaryNode delete(BinaryNode root, int value) {
  if (root == null) {
   return null;

  } else if (value < root.value) {
   root.left = delete(root.left, value);
  } else if (value > root.value) {
   root.right = delete(root.right, value);
  } else {
   if (root.left != null && root.right != null) {
    BinaryNode temp = root;
    BinaryNode minimum = minimumNode(temp);
    root.value = temp.value;
    root.right = delete(root.right, value);
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
