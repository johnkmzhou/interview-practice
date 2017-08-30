package com.example.collections;

import org.testng.annotations.Test;

import java.util.SortedSet;
import java.util.TreeSet;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class GraphTest {
	Node n1;

	@BeforeTest
	public void beforeTest() {
		n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		n1.addChildNode(n2);
		n1.addChildNode(n3);
		Node n4 = new Node(4);
		n2.addChildNode(n4);
		Node n5 = new Node(5);
		n2.addChildNode(n5);
		n3.addChildNode(n5);
		// add a loop in the graph
		n5.addChildNode(n1);
	}

	@Test
	public void testGetAllNodes() {
		SortedSet<Node> allNodes = new TreeSet<Node>();
		Graph.getAllNodes(n1, allNodes);
		int i = 1;
		for (Node n : allNodes) {
			Assert.assertEquals(i, n.getUniqueId());
			i++;
		}
	}

}
