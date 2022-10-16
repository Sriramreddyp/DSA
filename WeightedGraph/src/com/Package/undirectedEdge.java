package com.Package;

public class undirectedEdge {
    public WeightedNode first;
    public WeightedNode second;
    public int weight;

    public undirectedEdge(WeightedNode first,WeightedNode second,int weight){
        this.first = first;
        this.second = second;
        this.weight = weight;
    }
    @Override
    public  String toString(){
        return "Edge (" + first + "," + second + ")"  + " weight = " + weight;

    }

}
