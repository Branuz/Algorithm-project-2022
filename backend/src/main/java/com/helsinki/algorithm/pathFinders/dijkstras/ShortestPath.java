package com.helsinki.algorithm.pathfinders.dijkstras;

import java.util.ArrayList;
import java.util.Set;

public class ShortestPath {

    public static void graphTest() {
        Node nodeA = new Node("A");
        Node nodeB = new Node("B");
        Node nodeC = new Node("C");
        Node nodeD = new Node("D"); 
        Node nodeE = new Node("E");
        Node nodeF = new Node("F");

        nodeA.addDestination(nodeB, 10);
        nodeA.addDestination(nodeC, 15);

        nodeB.addDestination(nodeD, 12);
        nodeB.addDestination(nodeF, 15);

        nodeC.addDestination(nodeE, 10);

        nodeD.addDestination(nodeE, 2);
        nodeD.addDestination(nodeF, 1);

        nodeF.addDestination(nodeE, 5);

        Graph graph = new Graph();

        graph.addNode(nodeA);
        graph.addNode(nodeB);
        graph.addNode(nodeC);
        graph.addNode(nodeD);
        graph.addNode(nodeE);
        graph.addNode(nodeF);

       // graph = Dijkstra.calculateShortestPathFromSource(graph, nodeA);
        ArrayList<Node> list = Dijkstra.calculateShortestPathFromSource(graph, nodeA);
        System.out.println("---------------");
        for (Node node : list) {
            System.out.print(node.getName());
            //System.out.println(node.getName()+":"+node.getDistance());
          //  System.out.println(node.getName());
          //  System.out.println("HERE");
          //  node.getShortestPath().forEach(n -> System.out.print(n.getName()));
          //  System.out.println("-----");

        }
    }
    
}
