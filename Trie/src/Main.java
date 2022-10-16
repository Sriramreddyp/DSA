public class Main {
 public static void main(String[] args) {
  Trie t = new Trie();
  t.insert("API");
  t.insert("APIS");
  t.Search("APIS");
  t.Search("AP");
 }

}