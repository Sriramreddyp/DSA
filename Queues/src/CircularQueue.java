public class CircularQueue {
 int[] arr;
 int top;
 int beginning;

 public CircularQueue(int size) {
  this.arr = new int[size];
  this.top = -1;
  this.beginning = -1;
  System.out.println("Queue Sucessfully Created");
 }

 public boolean isFull() {
  if (top + 1 == beginning) {
   return true;
  } else if ((top == arr.length - 1) && (beginning == 0)) {
   return true;
  } else {
   return false;
  }
 }

 public boolean isEmpty() {
  if (top == -1) {
   return true;
  } else {
   return false;
  }
 }

 public void enQueue(int value) {
  if (isFull()) {
   System.out.println("Stack is full");
  } else if (isEmpty()) {
   arr[top] = value;
   beginning++;
   System.out.println("Value added Sucessfully");
  } else {
   if (top + 1 == arr.length) {
    top = -1;
   } else {
    top++;
   }
   arr[top] = value;
   System.out.println("Value added Sucessfully");
  }
 }

 public int deQueue() {
  if (isEmpty()) {
   System.out.println("Stack is Empty");
   return -1;
  } else {
   int result = arr[beginning];
   arr[beginning] = 0;
   if (beginning == top) {
    beginning = top = -1;
   } else if (beginning + 1 == arr.length) {
    beginning = 0;

   } else {
    beginning++;
   }
   return result;
  }
 }

 public int peek() {
  if (isEmpty()) {
   System.out.println("Queue is Empty");
   return -1;
  }
  int result = arr[beginning];
  return result;
 }

 public void DeleteQueue() {
  arr = null;
  System.out.println("Queue Sucessfully Deleted...");
 }
}
