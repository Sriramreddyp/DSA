
// public class QueueStacks {

// public Node head;
// public Node headR;
// public Node tail;
// public Node tailR;

// public boolean isEmpty(Node value) {
// if (value == null) {
// return true;
// }
// return false;
// }

// public void push(int value) {
// Node node = new Node();
// node.value = value;
// if (isEmpty(head)) {
// node.next = null;
// head = node;
// tail = node;
// } else {
// tail.next = node;
// tail = node;
// }
// }

// public int pop() {
// Node node = new Node();
// if (isEmpty(head)) {
// System.out.println("Queue is Empty");
// return -1;
// }
// node = head;
// head = head.next;
// if (isEmpty(headR)) {
// node.next = null;
// headR = node;
// tailR = node;
// }

// int value = headR.value;
// headR = null;
// tailR = null;
// return value;
// }

// }
