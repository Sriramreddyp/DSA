public class Trie {
 private TrieNode root;

 public Trie() {
  root = new TrieNode();
  System.out.println("The Trie has been Created");
 }

 public void insert(String word) {
  TrieNode current = root;
  for (int i = 0; i < word.length(); i++) {
   char ch = word.charAt(i);
   TrieNode node = current.children.get(ch);
   if (node == null) {
    node = new TrieNode();
    current.children.put(ch, node);
   }
   current = node;
  }
  current.endOfString = true;
  System.out.println("Sucessfully Inserted");
 }

 public boolean Search(String word) {
  TrieNode current = root;
  for (int i = 0; i < word.length(); i++) {
   char letter = word.charAt(i);
   TrieNode node = current.children.get(letter);
   if (node == null) {
    System.out.println(word + " doesnt exits in trie..");
    return false;
   }
   current = node;
  }
  if (current.endOfString) {
   System.out.println(word + " Exists in the Trie..");
   return true;
  }
  System.out
    .println(word + " exists in the trie but it doesnt end(prefix of the String but not exists as an individual).");
  return false;
 }

 private boolean delete(TrieNode parent, String word, int index) {
  char ch = word.charAt(index);
  TrieNode currrent = parent.children.get(ch);
  boolean canThisNodeBeDeleted;

  if (currrent.children.size() > 1) {
   delete(currrent, word, index + 1);
   return false;
  }

  if (index == word.length() - 1) {
   if (currrent.children.size() >= 1) {
    currrent.endOfString = false;
    return false;
   } else {
    parent.children.remove(ch);
    return true;
   }
  }

  if (currrent.endOfString == true) {
   delete(currrent, word, index + 1);
   return false;
  }

  canThisNodeBeDeleted = delete(currrent, word, index + 1);
  if (canThisNodeBeDeleted) {
   parent.children.remove(ch);
   return true;
  } else {
   return false;
  }
 }

 public void delete(String word) {
  if (Search(word) == true) {
   delete(root, word, 0);
  }
 }
}
