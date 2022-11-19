package com.helsinki.algorithm;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.helsinki.algorithm.pathfinders.dijkstras.Node;

public class NodeTest {

    private Node node = new Node("TestiA");

    @Before
    public void setUp() {
    }

    @Test
    public void addDestinationTest() {
        node.addDestination(new Node("TestiB"), 10);
        node.addDestination(new Node("TestiC"), 10);
        assertEquals(2, node.getAdjacentNodes().size());
    }

    @Test
    public void getDistance() {
        Node testNode = new Node("TestiB");
        assertEquals("TestiB", testNode.getName());
    }
    
    @Test
    public void nameTest() {
        node.setName("TestiC");
        assertEquals("TestiC", node.getName());
    }

    @Test
    public void shortestPathTest() {
        List<Node> shortestPath = new LinkedList<>();
        shortestPath.add(node);
        node.setShortestPath(shortestPath);
        assertEquals(1, node.getShortestPath().size());
    }

    @Test
    public void distanceTest() {
        node.setDistance(20);
        assertEquals((Integer)20, node.getDistance());
    }
    
}
