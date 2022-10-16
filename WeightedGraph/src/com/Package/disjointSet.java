package com.Package;
import java.util.ArrayList;

public class disjointSet {
    private ArrayList<WeightedNode> nodeList = new ArrayList<>();

    public static void makeSet(ArrayList<WeightedNode> nodeList){
        for(WeightedNode node : nodeList){
            disjointSet set = new disjointSet();
            set.nodeList.add(node);
            node.set = set;
        }
    }

    public static disjointSet findSet(WeightedNode node){
        return node.set;
    }

    public static disjointSet unionSet(WeightedNode node1,WeightedNode node2){
        if(node1.set.equals(node2.set)){
            return null;
        }else{
            disjointSet set1 = node1.set;
            disjointSet set2 = node2.set;

            if(set1.nodeList.size()>set2.nodeList.size()){
                ArrayList<WeightedNode> nodeSet2 = set2.nodeList;
                for(WeightedNode node : nodeSet2){
                    node.set = set1;
                    set1.nodeList.add(node);

                }
                return  set1;
            }else{
                ArrayList<WeightedNode> nodeSet1 = set1.nodeList;
                for(WeightedNode node : nodeSet1){
                    node.set = set2;
                    set2.nodeList.add(node);
                }
                return set2;

            }
        }
    }

    public void printAllNodesOfThisSet(){
        System.out.println("Printing all nodes of the set");
        for(WeightedNode node : nodeList){
            System.out.println(node +  " ");
        }
        System.out.println();
    }





}
