package com.Package;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Kruskal {
    ArrayList<WeightedNode> nodeList = new ArrayList<>();
    ArrayList<undirectedEdge> edgeList = new ArrayList<>();

    public Kruskal(ArrayList<WeightedNode> nodeList){
        this.nodeList = nodeList;
    }

    public void addWeightedUndirectededge(int firstIndex,int secondIndex,int weight){
        undirectedEdge edge = new undirectedEdge(nodeList.get(firstIndex),nodeList.get(secondIndex),weight);
        WeightedNode first = edge.first;
        WeightedNode second = edge.second;
        first.neighbours.add(second);
        second.neighbours.add(first);
        first.weightMap.put(second,weight);
        second.weightMap.put(first,weight);
        edgeList.add(edge);
    }

    void Kruskal(){
        disjointSet.makeSet(nodeList);
        Comparator<undirectedEdge> comparator = new Comparator<undirectedEdge>() {
            @Override
            public int compare(undirectedEdge o1, undirectedEdge o2) {
                return o1.weight - o2.weight;
            }
        };

        Collections.sort(edgeList,comparator);
        int cost = 0;
        for(undirectedEdge edge : edgeList){
            WeightedNode first = edge.first;
            WeightedNode second = edge.second;

            if(!disjointSet.findSet(first).equals(disjointSet.findSet(second))){
                disjointSet.unionSet(first,second);
                cost += edge.weight;
                System.out.println("taken " + edge);
            }
        }
        System.out.println("Total Cost = " +cost);

    }

}
