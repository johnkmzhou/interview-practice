package com.example.collections;

import java.util.List;
import java.util.SortedSet;

public class Graph {

	/**
	 * Retrieves and places all graph nodes into a set.
	 * 
	 * @param node
	 * @param allNodes
	 */
	public static void getAllNodes(Node node, SortedSet<Node> allNodes) {
		// checks if we have already visited this node
		if (!allNodes.contains(node)) {
			allNodes.add(node);
			List<Node> childNodes = node.getChildNodes();
			if (!childNodes.isEmpty()) {
				for (Node n : childNodes) {
					getAllNodes(n, allNodes);
				}
			}
		}
	}
}
