public class Main {
 public static void main(String[] args) {
  // DirectChaining dc = new DirectChaining(15);
  // dc.insertHashTable("Sriram");
  // dc.insertHashTable("Sagnik");
  // dc.insertHashTable("Shovan");
  // dc.insertHashTable("Rahul");
  // dc.insertHashTable("Rahul");
  // dc.displayHashTable();
  // dc.Search("Sagnik");
  // dc.deleteHashtable("Rahul");
  // System.out.println();
  // dc.displayHashTable();

  LinearProbing lp = new LinearProbing(10);
  lp.insertInHashTable("a");
  lp.insertInHashTable("b");
  lp.insertInHashTable("c");
  lp.insertInHashTable("e");
  lp.insertInHashTable("f");
  lp.insertInHashTable("g");

  lp.insertInHashTable("f");

  lp.displayHashTable();

 }
}
