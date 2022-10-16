package com.Package;

public class Main {

    public static void main(String[] args) {
//CircularLinkedList CSLL = new CircularLinkedList();
//CSLL.CreateCLL(5);
//CSLL.insertNode(1,2);
//CSLL.insertNode(2,3);
//CSLL.insertNode(3,4);
//
//System.out.println(CSLL.tail.next.value);

//        TreeNode drinks = new TreeNode("Drinks");
//        TreeNode hot = new TreeNode("HotDrinks");
//        TreeNode cold = new TreeNode("ColdDrinks");
//        TreeNode tea = new TreeNode("Tea");
//        TreeNode coffee = new TreeNode("Coffee");
//        TreeNode wine = new TreeNode("Wine");
//        TreeNode Beer = new TreeNode("Beer");
//
//        drinks.addChild(hot);
//        drinks.addChild(cold);
//        hot.addChild(tea);
//        hot.addChild(coffee);
//        cold.addChild(wine);
//        cold.addChild(Beer);
//
//        System.out.println(drinks.print(0));

        BinaryTree bt = new BinaryTree();
        bt.insertNode("S");
        bt.insertNode("r");


      BinaryTree bt1 = new BinaryTree();
      bt1.insertNode("S");
      bt1.insertNode("r");
      bt1.insertNode("i");


      System.out.println(bt.compare(bt.root,bt1.root));

    }
}
