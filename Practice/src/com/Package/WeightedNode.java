package com.Package;
import java.util.*;

public class WeightedNode implements Comparable<WeightedNode> {
public String name;
    ArrayList<WeightedNode> neighbours = new ArrayList<>();
    public int index;
    public int distance;
    public WeightedNode parent;
    public boolean isVisited = false;
    HashMap<WeightedNode,Integer> weightMap = new HashMap<>();

    public WeightedNode(String name,int index){
        this.name = name;
        this.index = index;
        this.distance = Integer.MAX_VALUE;
    }


    @Override
    public int compareTo(WeightedNode o) {
        return this.distance - o.distance;
    }

    @Override
    public String toString(){return name;}
}
