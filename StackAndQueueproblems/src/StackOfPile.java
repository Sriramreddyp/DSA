// import java.util.ArrayList;

// public class StackOfPile {
// public Node head;
// public Node tail;
// public int TopMain;
// int capacity;
// ArrayList al = new ArrayList<>();

// public StackOfPile(int capacity) {
// this.capacity = capacity;
// this.TopMain = -1;

// }

// public boolean isEmpty() {
// if (head == null) {
// return true;
// }
// return false;
// }

// public void PushIntoPile(int value) {
// Node node = new Node();
// node.value = value;
// if (isEmpty()) {
// al.add(0);
// node.next = null;
// head = node;
// tail = node;
// TopMain++;
// al.set(al.size() - 1, (0 + al.size()));
// } else {
// int temp = (int) al.get(al.size() - 1);
// if (temp == capacity) {
// al.add(0);
// }
// node.next = head;
// head = node;
// TopMain++;
// al.set(al.size() - 1, (0 + al.size()));
// }
// }

// public void traverse() {
// for (int i = 0; i < al.size(); i++) {
// System.out.println(al.get(i));
// }
// }

// }
