public class AnimalShelter {
 public Node headCat;
 public Node headDog;
 public Node tailCat;
 public Node tailDog;
 public int catOrd;
 public int dogOrd;

 public AnimalShelter() {
  this.catOrd = -1;
  this.dogOrd = -1;
 }

 public boolean isEmpty(Node node) {
  if (node == null) {
   return true;
  }
  return false;
 }

 public void enQueue(Animal a) {
  Node node = new Node();
  node.animal = a;
  if (a instanceof Cat) {
   if (isEmpty(headCat)) {
    node.next = null;
    headCat = node;
    tailCat = node;
    catOrd++;
    a.setOrder(catOrd);
   } else {
    tailCat.next = node;
    tailCat = node;
    node.next = null;
    catOrd++;
    a.setOrder(catOrd);
   }
  }

  if (a instanceof Dog) {
   if (isEmpty(headDog)) {
    node.next = null;
    headDog = node;
    tailDog = node;
    dogOrd++;
    a.setOrder(dogOrd);
   } else {
    tailDog.next = node;
    tailDog = node;
    node.next = null;
    dogOrd++;
    a.setOrder(dogOrd);
   }
  }
 }

 public Animal DequeCat() {
  if (isEmpty(headCat)) {
   System.out.println("cats are not availble");
  } else {
   return dequeC();
  }
 }

 public Animal dequeC() {
  // if (isEmpty(headCat)) {
  // System.out.println("Dogs are not available");
  // return null;
  // }
  Animal a = headCat.animal;
  headCat = headCat.next;
  return a;
 }

 public Animal dequeD() {
  Animal a = headDog.animal;
  headDog = headDog.next;
  return a;
 }

 public Animal dequeAny() {
  if (tailCat.animal.getOrder() > tailDog.animal.getOrder()) {
   Animal a = dequeC();
   return a;
  } else if (tailCat.animal.getOrder() < tailDog.animal.getOrder()) {
   Animal a = dequeD();
   return a;
  } else {
   Animal a = dequeC();
   return a;
  }

 }

}
