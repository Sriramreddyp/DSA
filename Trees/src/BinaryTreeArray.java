public class BinaryTreeArray {
 String[] arr;
 int lastUsedIndex;

 public BinaryTreeArray(int size) {
  arr = new String[size + 1];
  this.lastUsedIndex = 0;
  System.out.println("Blank tree of size " + size + " has been created.");
 }

 public boolean isFull() {
  if (arr.length - 1 == lastUsedIndex) {
   return true;
  }
  return false;
 }

 // Insert Method

 void insert(String value) {
  if (!isFull()) {
   arr[lastUsedIndex + 1] = value;
   lastUsedIndex++;
   System.out.println("Value has been sucessfully Inserted");
  } else {
   System.out.println("Binary tree is full");
  }
 }

 // PreOrder Traversal

 public void preOrder(int index) {
  if (index > lastUsedIndex) {
   return;
  }
  System.out.print(arr[index] + " ");
  preOrder(2 * index);
  preOrder((2 * index) + 1);
 }

 // InOrder Traversal

 public void InOrder(int index) {
  if (index > lastUsedIndex) {
   return;
  }
  InOrder(2 * index);
  System.out.print(arr[index] + " ");
  InOrder((2 * index + 1));
 }

 // PostOrder Traversal

 public void postOrder(int index) {
  if (index > lastUsedIndex) {
   return;
  }
  postOrder(2 * index);
  postOrder(2 * index + 1);
  System.out.print(arr[index] + " ");
 }

 // LevelOrder Traversal

 public void levelOrder() {
  for (int i = 1; i <= lastUsedIndex; i++) {
   System.out.print(arr[i] + " ");
  }
 }

 // Search

 public int Search(String value) {
  for (int i = 0; i <= lastUsedIndex; i++) {
   if (arr[i] == value) {
    System.out.println("Value found in the tree");
    return i;
   }
  }
  System.out.println("Value not Found..");
  return -1;
 }

 // Delete Node

 public void Delete(String value) {
  int location = Search(value);
  if (location == -1) {
   return;
  } else {
   arr[location] = arr[lastUsedIndex];
   lastUsedIndex--;
   System.out.println("Last Node Sucesfully exchanged and deleted");
  }
 }

 // Delete Tree

 public void Delete() {

  arr = null;
  System.out.println("Tree has been Sucessfully Deleted");

 }
}
