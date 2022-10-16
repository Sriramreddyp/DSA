import java.util.ArrayList;//Used to keep the nodes in regular format, every arraylist element is a type of treenode and the relations are established with certain helper methods

public class TreeNode {
 String data;
 ArrayList<TreeNode> children;// next reference for future added childs,just like linked list

 public TreeNode(String data) {
  this.data = data;
  this.children = new ArrayList<TreeNode>();
 }

 public void addcChild(TreeNode node) {
  this.children.add(node);// this gives latest refernce of that node,like the node used to call this
                          // method
 }

 public String print(int level) { // helper recursive method to print tree in ordered manner according to the
                                  // relationship
  String ret;
  ret = " ".repeat(level) + data + "-" + level + "\n";
  for (TreeNode node : this.children) {
   ret += node.print(level + 1);
  }
  return ret;
 }

}
