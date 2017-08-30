package com.example.collections;

import java.util.ArrayList;
import java.util.List;

public class Node implements Comparable<Node> {
	private List<Node> childNodes = new ArrayList<Node>();
	private int uniqueId;

	public Node(int value) {
		this.uniqueId = value;
	}

	public void addChildNode(Node n) {
		childNodes.add(n);
	}

	public List<Node> getChildNodes() {
		return childNodes;
	}

	public int getUniqueId() {
		return uniqueId;
	}

	@Override
	public int compareTo(Node n) {
		return this.uniqueId - n.getUniqueId();
	}
}
