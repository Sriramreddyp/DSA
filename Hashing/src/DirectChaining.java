
import java.util.ArrayList;
import java.util.LinkedList;

public class DirectChaining {
 LinkedList<String>[] hashtable;
 int maxChainSize = 5;

 DirectChaining(int size) {
  hashtable = new LinkedList[size];
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

 public void insertHashTable(String word) {
  int newIndex = modASCIIHashFunction(word, hashtable.length);
  if (hashtable[newIndex] == null) {
   hashtable[newIndex] = new LinkedList<String>();
   hashtable[newIndex].add(word);
  } else {
   hashtable[newIndex].add(word);
  }
 }

 public void displayHashTable() {
  if (hashtable == null) {
   System.out.println("HashTable Doesnt exist");
   return;
  } else {
   System.out.println("..............HashTable...........");
   for (int i = 0; i < hashtable.length; i++) {
    System.out.println("Index " + i + " Key " + hashtable[i] + ".");
   }
  }
 }

 public boolean Search(String word) {
  int newIndex = modASCIIHashFunction(word, hashtable.length);
  if (hashtable[newIndex] != null && hashtable[newIndex].contains(word)) {
   ;
   System.out.println(word + "Found in Hash table");
   return true;
  }
  return false;
 }

 public void deleteHashtable(String word) {
  int newIndex = modASCIIHashFunction(word, hashtable.length);
  boolean result = Search(word);
  if (result) {
   hashtable[newIndex].remove(word);
   System.out.println("Given value Deleted...");
  } else {
   System.out.println("Value doesnt Exists..");
  }
 }

}