import java.util.ArrayList;

public class QuadraticProbing {
 String[] hashTable;
 int usedCellNumber;

 QuadraticProbing(int size) {
  hashTable = new String[size];
  usedCellNumber = 0;
 }

 public int modASCIIHashFunction(String word, int M) {
  char ch[];
  ch = word.toCharArray();
  int i, sum = 0;
  for (i = 0; i < word.length(); i++) {
   sum = sum + ch[i];
  }
  return sum % M;
 }

 public double getLoadFactor() {
  double loadFactor = usedCellNumber * 1.0 / hashTable.length;
  return loadFactor;
 }

 public void rehashKeys(String word) {
  usedCellNumber = 0;
  ArrayList<String> data = new ArrayList<>();

  for (String s : hashTable) {
   if (s != null) {
    data.add(s);
   }
  }
  data.add(word);
  hashTable = new String[hashTable.length * 2];

  for (String t : data) {
   insertInHashTable(t);
  }
 }

 public void insertInHashTable(String word) {
  double loadFactor = getLoadFactor();
  if (loadFactor >= 0.75) {
   rehashKeys(word);
  } else {
   int index = modASCIIHashFunction(word, hashTable.length);
   int counter = 0;
   for (int i = index; i < hashTable.length; i++) {
    int newIndex = (i + (counter * counter)) % hashTable.length;
    if (hashTable[newIndex] == null) {
     hashTable[newIndex] = word;
     System.out.println("Sucessfully Inserted");
     break;
    } else {
     System.out.println("Not Empty,,Going for another cell");
    }
    counter++;
   }
  }
  usedCellNumber++;
 }

 public int SearchhashTable(String word) {
  int index = modASCIIHashFunction(word, hashTable.length);

  for (int i = index; i < hashTable.length; i++) {
   int newIndex = i % hashTable.length;
   if (hashTable[newIndex] != null && hashTable[newIndex].equals(word)) {
    System.out.print("word Found at ");
    return newIndex;
   }
  }
  System.out.println("word doesnt exists");
  return 0;
 }

 public void deleteInHashTable(String word) {
  int status = SearchhashTable(word);
  if (status != 0) {
   hashTable[status] = null;
   System.out.println("Value deleted");
  } else {
   System.out.println("Value doesnt exists");
  }
 }

 public void displayHashTable() {
  if (hashTable == null) {
   System.out.println("HashTable Doesnt exist");
   return;
  } else {
   System.out.println("..............HashTable...........");
   for (int i = 0; i < hashTable.length; i++) {
    System.out.println("Index " + i + " Key " + hashTable[i] + ".");
   }
  }
 }
}
