package com.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;


public class GraphList {

 ArrayList<GraphNodeList> nodeList = new ArrayList<>();

 public GraphList(ArrayList<GraphNodeList> nodeList) {
  this.nodeList = nodeList;
 }

 public void addUndirectedEdge(int i, int j) {
  GraphNodeList first = nodeList.get(i);
  GraphNodeList second = nodeList.get(j);
  first.neighbors.add(second);
  second.neighbors.add(first);
 }

 //bfs internal

 void bfsVists(GraphNodeList node){
  LinkedList<GraphNodeList> queue = new LinkedList<>();
  queue.add(node);
  node.isVisited = true;
  while(!queue.isEmpty()){
   GraphNodeList currentNode = queue.remove();
   currentNode.isVisited = true;
   System.out.println(currentNode.name + " ");

   for(GraphNodeList neighbours : currentNode.neighbors){
    if(!neighbours.isVisited){
     queue.add(neighbours);
     neighbours.isVisited = true;
    }
   }
  }
 }

 void bfs(){
  for(GraphNodeList node : nodeList){
   if(!node.isVisited){
    bfsVists(node);
   }
  }


 }
 void dfsVisit(GraphNodeList node){
  Stack<GraphNodeList> stack = new Stack<>();
  stack.push(node);
  while(!stack.isEmpty()){
   GraphNodeList currentNode = stack.pop();
   currentNode.isVisited = true;
   System.out.println(currentNode.name + " ");

   for(GraphNodeList neighbour : currentNode.neighbors){
    if(!neighbour.isVisited){
     stack.push(neighbour);
     currentNode.isVisited = true;
    }
   }
  }
 }

 void dfs(){
  for(GraphNodeList node : nodeList){
   if(!node.isVisited){
    dfsVisit(node);
   }
  }
 }

 public void addDirectedEdge(int i,int j){
  GraphNodeList first = nodeList.get(i);
  GraphNodeList second = nodeList.get(j);
  first.neighbors.add(second);
 }

 void topologicalVisit(GraphNodeList node,Stack<GraphNodeList> stack){
  for(GraphNodeList neighbor : node.neighbors){
   if(!neighbor.isVisited){
    topologicalVisit(neighbor,stack);
   }
  }
  node.isVisited = true;
  stack.push(node);
 }

 void topologicalSort(){
  Stack<GraphNodeList> stack = new Stack<>();
  for(GraphNodeList node : nodeList){
   if(!node.isVisited){
    topologicalVisit(node,stack);
   }
  }
  while(!stack.isEmpty()){
   System.out.println(stack.pop() + " ");
  }
 }

 public static void pathPrint(GraphNodeList node){
  if(node.parent != null){
   pathPrint(node.parent);
  }
  System.out.println(node.name + " ");
 }

 public void BFSForSSSPP(GraphNodeList node){
  LinkedList<GraphNodeList> queue = new LinkedList<>();
  queue.add(node);
  while(!queue.isEmpty()){
   GraphNodeList currentNode = queue.remove(0);
   currentNode.isVisited = true;
   System.out.println("Printing Path For Node " + currentNode.name + ": ");
   pathPrint(currentNode);
   System.out.println();

   for(GraphNodeList neighbour : currentNode.neighbors){
    if(!neighbour.isVisited){
     queue.add(neighbour);
     neighbour.isVisited = true;
     neighbour.parent = currentNode;
    }
   }


  }
 }
}
