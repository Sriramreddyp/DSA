public class BinaryHeap {
 int arr[];
 int size;

 public BinaryHeap(int size) {
  arr = new int[size + 1];// Zeroth index is skiped
  this.size = 0;
  System.out.println("Binary heap has been created");
 }

 public boolean isEmpty() {
  if (size == 0) {
   return true;
  }
  return false;
 }

 public Integer peek() {
  if (isEmpty()) {
   return 0;
  }
  return arr[1];
 }

 public int sizeOfBP() {
  return size;
 }

 public void levelOrder() {
  for (int i = 1; i <= size; i++) {
   System.out.print(arr[i] + " ");
  }
  System.out.println();
 }

 // Heapify for insert

 public void heapifyBottomtoTop(int index, String heapType) {
  int parentIndex = index / 2;
  if (index <= 1) {
   return;
  }
  if (heapType == "Min") {
   if (arr[index] < arr[parentIndex]) {
    int temp = arr[index];
    arr[index] = arr[parentIndex];
    arr[parentIndex] = temp;
   }
  } else if (heapType == "Max") {
   if (arr[index] > arr[parentIndex]) {
    int temp = arr[index];
    arr[index] = arr[parentIndex];
    arr[parentIndex] = temp;
   }
  }
  heapifyBottomtoTop(parentIndex, heapType);
 }

 public void insert(int value, String typeHeap) {
  arr[size + 1] = value;
  size++;
  heapifyBottomtoTop(size, typeHeap);
  System.out.println("Inserted Value  " + value + " Sucessfully inserted");
 }

 // heapifyTopToBottom
 public void heapifyTopToBottom(int index, String heaptype) {
  int left = index * 2;
  int right = index * 2 + 1;
  int swapChild = 0;

  if (size < left) {// only root node condition
   return;
  }
  if (heaptype == "Max") {
   if (size == left) {
    if (arr[index] < arr[left]) {
     int temp = arr[index];
     arr[index] = arr[left];
     arr[left] = temp;
    }
    return;
   } else {
    if (arr[left] > arr[right]) {
     swapChild = left;

    } else {
     swapChild = right;
    }
    if (arr[index] < arr[swapChild]) {
     int temp = arr[index];
     arr[index] = arr[swapChild];
     arr[swapChild] = temp;
    }
   }
  } else if (heaptype == "Min") {
   if (size == left) {
    if (arr[index] > arr[left]) {
     int temp = arr[index];
     arr[index] = arr[left];
     arr[left] = temp;
    }
    return;
   } else {
    if (arr[left] < arr[right]) {
     swapChild = left;

    } else {
     swapChild = right;
    }
    if (arr[index] > arr[swapChild]) {
     int temp = arr[index];
     arr[index] = arr[swapChild];
     arr[swapChild] = temp;
    }
   }
  }
  heapifyTopToBottom(swapChild, heaptype);

 }

 public int extractHeap(String HeapType) {
  if (isEmpty()) {
   return -1;
  } else {
   int extractedNode = arr[1];
   arr[1] = arr[size];
   size--;
   heapifyBottomtoTop(1, HeapType);
   return extractedNode;
  }
 }

 void DeleteBH() {
  arr = null;
  System.out.println("Heap Sucessfully Deleted");
 }

}