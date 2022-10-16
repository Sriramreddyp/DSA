package com.Package;
import java.util.*;
public class WeightedNode implements Comparable<WeightedNode> {

    public String name;
    public ArrayList<WeightedNode> neighbours = new ArrayList<>();
    public HashMap<WeightedNode,Integer> weightMap = new HashMap<>();

    public boolean isVisited = false;
    public WeightedNode parent;
    public int distance;
    public int index;
    public disjointSet set;

    public WeightedNode(String name,int index){
        this.name = name;
        this.index = index;
        distance = Integer.MAX_VALUE;
    }

    @Override
    public String toString(){
        return name;
    }


    @Override
    public int compareTo(WeightedNode o) {
        return this.distance - o.distance;
    }
}
