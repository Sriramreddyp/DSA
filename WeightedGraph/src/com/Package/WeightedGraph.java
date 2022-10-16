package com.Package;
import java.util.*;
public class WeightedGraph {
    ArrayList<WeightedNode> nodeList = new ArrayList<>();

    public WeightedGraph(ArrayList<WeightedNode> nodeList) {
        this.nodeList = nodeList;
    }

    void dijkstra(WeightedNode node) {
        PriorityQueue<WeightedNode> queue = new PriorityQueue<>();
        node.distance = 0;



        queue.addAll(nodeList);

        while (!queue.isEmpty()) {
            WeightedNode CurrentNode = queue.remove();
            for (WeightedNode neighbour : CurrentNode.neighbours) {
                if (queue.contains(neighbour)) {
                    if (neighbour.distance > CurrentNode.distance + CurrentNode.weightMap.get(neighbour)) {
                        neighbour.distance = CurrentNode.distance + CurrentNode.weightMap.get(neighbour);
                        neighbour.parent = CurrentNode;
                        queue.remove(neighbour);

                        queue.add(neighbour);
                    }
                }
            }
        }
//      for(WeightedNode nodeToCheck : nodeList){
//          System.out.println("Node " + nodeToCheck+ ", distance " + nodeToCheck.distance+", path");
//          pathPrint(nodeToCheck);
//          System.out.println();
//      }
        for (int i = nodeList.indexOf(node); i < nodeList.size(); i++) {
            System.out.println("Node " + nodeList.get(i).name + ", distance " + nodeList.get(i).distance + ", path : ");
            pathPrint(nodeList.get(i));
            System.out.println();
        }


    }

    public static void pathPrint(WeightedNode node) {
        if (node.parent != null) {
            pathPrint(node.parent);
        }
        System.out.print(node.name + " ");
    }

    public void addWeightedEdge(int i, int j, int d) {
        WeightedNode first = nodeList.get(i);
        WeightedNode second = nodeList.get(j);
        first.weightMap.put(second, d);
        first.neighbours.add(second);
    }

    //Bellman ford algorithm
    void bellmanFordAlgo(WeightedNode sourceNode) {
        sourceNode.distance = 0;
        for (int i = 0; i < nodeList.size(); i++) {
            for (WeightedNode currentNode : nodeList) {
                for (WeightedNode neighbour : currentNode.neighbours) {
                    if (neighbour.distance > currentNode.distance + currentNode.weightMap.get(neighbour)) {
                        neighbour.distance = (currentNode.distance + currentNode.weightMap.get(neighbour));
                        neighbour.parent = currentNode;
                    }
                }
            }
        }
        System.out.println("Checking For negetive Cycle : ");
        for (WeightedNode currentNode : nodeList) {
            for (WeightedNode neighbour : currentNode.neighbours) {
                if (neighbour.distance > currentNode.distance + currentNode.weightMap.get(neighbour)) {
                    System.out.println("negetive Cycle Found : \n");
                    System.out.println("Vertex name : \n" + neighbour.name);
                    System.out.println("old Cost : " + neighbour.distance);
                    System.out.println("New Distance : " + currentNode.distance + currentNode.weightMap.get(neighbour));
                    return;
                }
            }
        }

        System.out.println("No negitive Cycle Found :");
        for (WeightedNode nodeToCheck : nodeList) {
            System.out.println("Node " + nodeToCheck + ", distance " + nodeToCheck.distance + ", path");
            pathPrint(nodeToCheck);
            System.out.println();
        }
    }


    void APSP() {
        for (WeightedNode currentNode : nodeList) {
            dijkstra(currentNode);
            System.out.println();
        }
    }

    void floydWarshall() {
        int size = nodeList.size();
        int[][] v = new int[size][size];

        for (int i = 0; i < size; i++) {
            WeightedNode first = nodeList.get(i);
            for (int j = 0; j < size; j++) {
                WeightedNode second = nodeList.get(j);
                if (i == j) {
                    v[i][j] = 0;
                } else if (first.weightMap.containsKey(second)) {
                    v[i][j] = first.weightMap.get(second);
                } else {
                    v[i][j] = Integer.MAX_VALUE/10;
                }
            }
        }
        for (int k = 0; k < nodeList.size(); k++) {
            for (int i = 0; i < nodeList.size(); i++) {
                for (int j = 0; j < nodeList.size(); j++) {
                    if (v[i][j] > v[i][k] + v[k][j]) {
                        v[i][j] = v[i][k] + v[k][j];
                    }

                }
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.println("Printing distance for node " + nodeList.get(i) + " :");

            for (int j = 0; j < size; j++) {
                System.out.print(v[i][j] + " ");
            }
            System.out.println();
        }


    }



//    void floydWarshall() {
//        int size = nodeList.size();
//        int[][] V = new int[size][size];
//
//        // Initializing Distance table from adjacency list
//        for (int i = 0; i < size; i++) {
//            WeightedNode first = nodeList.get(i);
//            for (int j = 0; j < size; j++) {
//                WeightedNode second = nodeList.get(j);
//                if (i == j)
//                    V[i][j] = 0;
//                else if (first.weightMap.containsKey(second)) { //we have direct edge between i & j
//                    V[i][j] = first.weightMap.get(second);
//                } else { //no direct edge between i & j, so mark it as infinity [divided by 10 to avoid arithmetic overflow]
//                    V[i][j] = Integer.MAX_VALUE/10;
//                }
//            }
//        }//end of loop
//
//
//        // Floyd Warshall's Algorithm
//        for (int k = 0; k < nodeList.size(); k++) {
//            for (int i = 0; i < nodeList.size(); i++) {
//                for (int j = 0; j < nodeList.size(); j++) {
//                    if (V[i][j] > V[i][k] + V[k][j]) {  // if update possible, then update path
//                        V[i][j] = V[i][k] + V[k][j];    // this will keep a track on path
//                    }
//                }
//            }
//        }//end of loop
//
//
//        // Print table of node with minimum distance and shortest path from each source
//        for (int i = 0; i < size; i++) {
//            System.out.print("Printing distance list for node "+nodeList.get(i)+": ");
//            for (int j = 0; j < size; j++) {
//                System.out.print(V[i][j]+" ");
//            }
//            System.out.println();
//        }
//
//    }// end of method




}
