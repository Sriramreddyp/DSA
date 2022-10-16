package com.Package;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class Prim {

    //List for storing nodes

    ArrayList<WeightedNode> nodeList = new ArrayList<>();

    //Constructor

    public Prim(ArrayList<WeightedNode> nodeList){
        this.nodeList = nodeList;
    }
    public void addWeightedEdge(int i, int j, int d) {
        WeightedNode first = nodeList.get(i);
        WeightedNode second = nodeList.get(j);
        first.weightMap.put(second, d);
        second.weightMap.put(first,d);
        first.neighbours.add(second);
        second.neighbours.add(first);
    }

    //Prims Algorithm

    void prims(WeightedNode node){
        for(int i = 0;i<nodeList.size();i++){
            nodeList.get(i).distance = Integer.MAX_VALUE;
        }
        node.distance = 0;
        PriorityQueue<WeightedNode> queue = new PriorityQueue<>();
        queue.addAll(nodeList);

        while(!queue.isEmpty()){
            WeightedNode currentNode = queue.remove();
            for(WeightedNode neighbour : currentNode.neighbours){
                if(queue.contains(neighbour)){
                    if(neighbour.distance > currentNode.weightMap.get(neighbour)){
                        neighbour.distance = currentNode.weightMap.get(neighbour);
                        neighbour.parent = currentNode;
                        queue.remove(neighbour);
                        queue.add(neighbour);
                    }
                }
            }
        }

        int cost = 0;
        for(WeightedNode nodeToCheck : nodeList){
            System.out.println("Node : " + nodeToCheck + ", key : " + nodeToCheck.distance + ", Parent : " + nodeToCheck.parent);
            cost += nodeToCheck.distance ;

        }
        System.out.println();
        System.out.println("Total Cost Of MST : " + cost);
    }
}
