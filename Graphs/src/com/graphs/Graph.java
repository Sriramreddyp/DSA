package com.graphs;

import java.util.*;

public class Graph {
 ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
 int[][] adjacencyMatrix;

 public Graph(ArrayList<GraphNode> nodeList) {
  this.nodeList = nodeList;
  adjacencyMatrix = new int[nodeList.size()][nodeList.size()];
 }

 public void addUndirectedEdge(int i, int j) {
  adjacencyMatrix[i][j] = 1;
  adjacencyMatrix[j][i] = 1;
 }

 // get neighbours

 public ArrayList<GraphNode> getNeighbours(GraphNode node) {
  ArrayList<GraphNode> neighbours = new ArrayList<>();
  int nodeIndex = node.index;
  for (int i = 0; i < adjacencyMatrix.length; i++) {
   if (adjacencyMatrix[nodeIndex][i] == 1) {
    neighbours.add(nodeList.get(i));
   }
  }
  return neighbours;
 }

 // BFS internal

 void bfsVisit(GraphNode node) {
  LinkedList<GraphNode> queue = new LinkedList<GraphNode>();
  queue.add(node);
  while(!queue.isEmpty()){
   GraphNode currentNode = queue.remove();
   currentNode.IsVisited = true;
   System.out.println(currentNode + " ");
   ArrayList<GraphNode> neighbours = getNeighbours(currentNode);
   for(GraphNode neighbour:neighbours){
    if(!neighbour.IsVisited){
     queue.add(neighbour);
     neighbour.IsVisited = true;
    }

   }

  }
 }
void bfs(){
for(GraphNode node : nodeList){
   if(!node.IsVisited){
    bfsVisit(node);
   }
  }
 }

}
