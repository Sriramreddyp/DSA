public class Main {
 public static void main(String[] args) {
  // QueueStacks qs = new QueueStacks();
  // qs.push(1);
  // qs.push(2);
  // qs.push(3);
  // System.out.println(qs.pop());
  // System.out.println(qs.head.value);
  // System.out.println(qs.pop());
  // System.out.println(qs.head.value);
  // qs.pop();
  // qs.pop();

  // StackOfPile sp = new StackOfPile(3);
  // sp.PushIntoPile(1);
  // sp.PushIntoPile(2);
  // sp.PushIntoPile(3);
  // sp.PushIntoPile(4);
  // sp.PushIntoPile(5);

  // sp.traverse();

  AnimalShelter animals = new AnimalShelter();
  animals.enQueue(new Cat("kiki"));
  animals.enQueue(new Cat("kari"));
  animals.enQueue(new Dog("beji"));
  animals.enQueue(new Cat("Reki"));
  animals.enQueue(new Dog("Dexter"));
  System.out.println(animals.dequeAny().name());
  System.out.println(animals.dequeDog().name());
  System.out.println(animals.dequeCat().name());

 }

}