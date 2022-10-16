package com.graphs;

import com.graphs.Graph;
import com.graphs.GraphNode;

import java.util.ArrayList;

public class Main {
 public static void main(String[] args) {
//  ArrayList<GraphNode> nodeList = new ArrayList<>();
//  nodeList.add(new GraphNode("a", 0));
//  nodeList.add(new GraphNode("b", 1));
//  nodeList.add(new GraphNode("c", 2));
//  nodeList.add(new GraphNode("d", 3));
//
//  Graph g = new Graph(nodeList);
//  g.addUndirectedEdge(0, 1);
//  g.addUndirectedEdge(0, 3);

  ArrayList<GraphNodeList> nodeList = new ArrayList<>();
  nodeList.add(new GraphNodeList("A",0));
  nodeList.add(new GraphNodeList("B",1));
  nodeList.add(new GraphNodeList("C",2));
  nodeList.add(new GraphNodeList("D",3));
  nodeList.add(new GraphNodeList("E",4));
  nodeList.add(new GraphNodeList("F",5));
  nodeList.add(new GraphNodeList("G",6));

  GraphList newGraph = new GraphList(nodeList);
  newGraph.addUndirectedEdge(0,1);
  newGraph.addUndirectedEdge(0,2);
  newGraph.addUndirectedEdge(1,3);
  newGraph.addUndirectedEdge(1,6);
  newGraph.addUndirectedEdge(2,3);
  newGraph.addUndirectedEdge(2,4);
  newGraph.addUndirectedEdge(3,5);
  newGraph.addUndirectedEdge(4,5);
  newGraph.addUndirectedEdge(5,6);

  newGraph.BFSForSSSPP(nodeList.get(0));
 }
}