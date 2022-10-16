package com.Package;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class WeightedGraph {
    ArrayList<WeightedNode> nodeList = new ArrayList<>();

    public WeightedGraph(ArrayList<WeightedNode> nodeList){
        this.nodeList = nodeList;
    }
    public void addDirectedEdge(int i,int j,int d){
        WeightedNode first = nodeList.get(i);
        WeightedNode second = nodeList.get(j);
        first.weightMap.put(second,d);
        first.neighbours.add(second);
    }


    void pathPrint(WeightedNode node) {
        if (node.parent != null) {
            pathPrint(node.parent);
        }
        System.out.println(node.name + " ");
    }

    void bfsForSSSP(WeightedNode node) {
        Queue<WeightedNode> queue = new LinkedList<>();
        queue.add(node);
//        node.isVisited = true;
        while (!queue.isEmpty()) {
            WeightedNode currentNode = queue.remove();
            currentNode.isVisited = true;
            System.out.println("Path for that Node From Source : ");
            pathPrint(currentNode);

            for (WeightedNode neighbour : currentNode.neighbours) {
                if (!neighbour.isVisited) {
                    queue.add(neighbour);
                    neighbour.isVisited = true;
                    neighbour.parent = currentNode;
                }
            }
        }
    }

    void djisktra(WeightedNode node){
        //create a pq for ascending removal of elements
        //iterate through neighbour of element
        //update distance of that neighbour according to the condition
        //add that element to the queue again so it can get chance for its removal
        //print all nodes from their parents to get their distance from source node

        PriorityQueue<WeightedNode> queue = new PriorityQueue<>();
       node.distance = 0;
        queue.addAll(nodeList);

        while(!queue.isEmpty()){
            WeightedNode currenNode = queue.remove();
            for(WeightedNode neighbour : currenNode.neighbours){
                if(queue.contains(neighbour)){
                   if(neighbour.distance > currenNode.distance + currenNode.weightMap.get(neighbour)){
                       neighbour.distance = currenNode.distance + currenNode.weightMap.get(neighbour);
                       neighbour.parent = currenNode;
                       queue.remove(neighbour);
                       queue.add(neighbour);
                   }
                }
            }

        }

        for(int i = 0;i<nodeList.size();i++){
            System.out.print("Node :" + nodeList.get(i).name + "Distance : " + nodeList.get(i).distance + " Path : \n");
            pathPrint(nodeList.get(i));
            System.out.println();
        }



    }

}
