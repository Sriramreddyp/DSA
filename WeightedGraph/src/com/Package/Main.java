package com.Package;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //Creating Graph Nodes

        ArrayList<WeightedNode> nodeList = new ArrayList<>();
        nodeList.add(new WeightedNode("A",0));
        nodeList.add(new WeightedNode("B",1));
        nodeList.add(new WeightedNode("C",2));
        nodeList.add(new WeightedNode("D",3));
        nodeList.add(new WeightedNode("E",4));


        Prim graph = new Prim(nodeList);

        //Added weights for nodes created -- Graph created in its full form

        graph.addWeightedEdge(0,2,3);
        graph.addWeightedEdge(2,1,10);
        graph.addWeightedEdge(1,3,4);
        graph.addWeightedEdge(3,4,1);
        graph.addWeightedEdge(4,2,6);
        graph.addWeightedEdge(2,3,2);
//
        System.out.println(".........Prim's Algorithm for finding MST of a Given Graph.............");
        System.out.println();
        graph.prims(nodeList.get(0));



    }
}
