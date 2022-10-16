public class Stack {

 int[] arr;
 int topOfStack;

 public Stack(int size) {
  this.arr = new int[size];
  this.topOfStack = -1;
  System.out.println("The Stack is Created with size : " + size);
 }

 boolean isEmpty() {
  if (topOfStack == -1) {

   return true;
  }
  return false;
 }

 boolean isFull() {
  if (topOfStack == arr.length - 1)
   return true;
  return false;

 }

 void push(int value) {
  if (isFull()) {
   System.out.println("The stack is full");
  } else {
   arr[topOfStack + 1] = value;
   topOfStack++;
   System.out.println("The value Sucessfully inserted into the stack...");
  }
 }

 void pop() {
  if (isEmpty()) {
   System.out.println("The Stack is Empty");
  } else {
   arr[topOfStack] = 0;
   topOfStack--;
   System.out.println("the value succesfully Deleted");
  }
 }

 void peek() {
  System.out.println(arr[topOfStack]);
 }

 void traverse() {
  for (int i = 0; i <= topOfStack; i++) {
   System.out.println(arr[i]);
  }
 }

 void deleteStack() {
  arr = null;
  System.out.println("Stack Sucessfully Deleted...");
 }

}