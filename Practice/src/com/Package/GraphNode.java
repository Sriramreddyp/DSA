package com.Package;
import java.util.ArrayList;
public class GraphNode {
    public String name;
    public int index;
    public GraphNode parent;
    ArrayList<GraphNode> neighbours = new ArrayList<>();
    public boolean isVisited = false;

    public GraphNode(String name,int index){
        this.name = name;
        this.index = index;
    }

}
