
public class Queue {
 int[] arr;
 int top;
 int beginning;

 public Queue(int size) {
  this.arr = new int[size];
  this.top = -1;
  this.beginning = -1;
  System.out.println("Queue Sucessfully Created");
 }

 public boolean isEmpty() {
  if ((beginning == -1) || (beginning == arr.length)) {
   return true;
  } else {
   return false;
  }
 }

 // My Implemetation
 public boolean myIsEmpty() {
  if (top == -1) {

   return true;
  } else {
   return false;
  }
 }

 public boolean isFull() {
  if (top == arr.length - 1) {
   return true;
  } else {
   return false;
  }
 }

 public void enQueue(int value) {

  if (isFull()) {
   System.out.println("Stack is Full");
  } else if (isEmpty()) {
   beginning = 0;
   top++;
   arr[top] = value;
   System.out.println("Value Sucessfully Inserted");
  } else {
   top++;
   arr[top] = value;
   System.out.println("Value Sucessfully Inserted");
  }
 }

 public int deQueue() {
  if (isEmpty()) {
   System.out.println("Stack is Empty");
   return -1;
  } else {
   int result = arr[beginning];
   beginning++;
   if (beginning > top) {
    beginning = top = -1;
   }
   return result;
  }
 }

 // My Implementation

 public int myDeQueue() {
  if (myIsEmpty()) {
   System.out.println("Stack is Empty");
   return -1;
  } else {
   int result = arr[beginning];
   for (int i = 0; i < top; i++) {
    arr[i] = arr[i + 1];
   }
   top--;
   return result;
  }

 }

 public int peek() {
  if (isEmpty()) {
   System.out.println("Stack is Empty");
   return -1;
  }
  return arr[beginning];
 }

 public void traverse() {
  for (int i = beginning; i <= top; i++) {
   System.out.println(arr[i]);
  }
 }

 public void DeleteQueue() {
  arr = null;
  System.out.println("Queue Sucessfully Deleted...");
 }

}