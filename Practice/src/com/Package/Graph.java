package com.Package;
import java.lang.reflect.GenericArrayType;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph {
    ArrayList<GraphNode> nodeList = new ArrayList<>();

    public Graph(ArrayList<GraphNode> nodeList) {
        this.nodeList = nodeList;
    }

    public void addUndirectedEdge(int i, int j) {
        GraphNode first = nodeList.get(i);
        GraphNode second = nodeList.get(j);
        first.neighbours.add(second);
        second.neighbours.add(first);
    }

    void bfsVisit(GraphNode node) {
        Queue<GraphNode> queue = new LinkedList<>();
        queue.add(node);
        node.isVisited = true;
        while (!queue.isEmpty()) {
            GraphNode currentNode = queue.remove();
            currentNode.isVisited = true;
            System.out.print(currentNode.name + " ");

            for (GraphNode neighbour : currentNode.neighbours) {
                if (!neighbour.isVisited) {
                    queue.add(neighbour);
                    node.isVisited = true;
                }
            }
        }
    }

    void bfs() {
        for (GraphNode node : nodeList) {
            if (!node.isVisited) {
                bfsVisit(node);
            }
        }


    }

    void dfsVisit(GraphNode node) {
        Stack<GraphNode> stack = new Stack<>();
        stack.push(node);
        while (!stack.isEmpty()) {
            GraphNode currentNode = stack.pop();
            currentNode.isVisited = true;
            System.out.println(currentNode.name + " ");
            for (GraphNode neighbour : currentNode.neighbours) {
                if (!neighbour.isVisited) {
                    stack.push(neighbour);
//                    currentNode.isVisited = true;
                }
            }
        }

    }

    void dfs() {
        for (GraphNode node : nodeList) {
            if (!node.isVisited) {
                dfsVisit(node);
            }
        }
    }

    public void directedEdge(int i, int j) {
        GraphNode first = nodeList.get(i);
        GraphNode second = nodeList.get(j);
        first.neighbours.add(second);
    }

    void pathPrint(GraphNode node) {
        if (node.parent != null) {
            pathPrint(node.parent);
        }
        System.out.println(node.name + " ");
    }

    void bfsForSSSP(GraphNode node) {
        Queue<GraphNode> queue = new LinkedList<>();
        queue.add(node);
//        node.isVisited = true;
        while (!queue.isEmpty()) {
            GraphNode currentNode = queue.remove();
            currentNode.isVisited = true;
            System.out.println("Path for that Node From Source : ");
            pathPrint(currentNode);

            for (GraphNode neighbour : currentNode.neighbours) {
                if (!neighbour.isVisited) {
                    queue.add(neighbour);
                    neighbour.isVisited = true;
                    neighbour.parent = currentNode;
                }
            }
        }
    }

//    boolean CheckParent(GraphNode nodeChild, GraphNode Parent) {
//
//        if (nodeChild.name == Parent.name) {
//          return true;
//        }
//        if (nodeChild.parent != null) {
//            CheckParent(nodeChild.parent, Parent);
//        }
//
//    }


        boolean routeBetweenNodes (GraphNode nodeChild, GraphNode Parent){

            Queue<GraphNode> queue = new LinkedList<>();
            ArrayList<GraphNode> checkParent = new ArrayList<>();
            queue.add(Parent);
            while (!queue.isEmpty()) {
                GraphNode currentNode = queue.remove();
                currentNode.isVisited = true;
                checkParent.add(currentNode);
//                if (currentNode.name == nodeChild.name) {
//                   if(currentNode.parent.name == Parent.name){
//                       return true;
//                   }
//                }
                for (GraphNode neighbours : currentNode.neighbours) {
                    if (!neighbours.isVisited) {
                        queue.add(neighbours);
                        neighbours.isVisited = true;
                        neighbours.parent = currentNode;
                    }
                }
            }

            if(checkParent.contains(nodeChild)){
                return true;
            }else{
                return false;
            }
        }
    }


