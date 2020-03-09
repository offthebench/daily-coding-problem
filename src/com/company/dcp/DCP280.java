package com.company.dcp;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/***
 * This problem was asked by Pandora.
 *
 * Given an directed graph, determine if it contains a cycle.
 */
public class DCP280 {

	private final int v;
	private final List<List<Integer>> adj;

	public DCP280(int v) {
		this.v = v;
		adj = new ArrayList<>(v);
		for (int i=0; i<v; i++) {
			adj.add(new LinkedList<>());
		}
	}

	public void addEdge(int src, int dest) {
		adj.get(src).add(dest);
	}

	public boolean isCyclic() {

		boolean[] visited = new boolean[v];
		boolean[] recStack = new boolean[v];

		for (int i=0; i<v; i++) {
			if(isCyclicUtil(i, visited, recStack))
				return true;
		}
		return false;
	}

	private boolean isCyclicUtil(int i, boolean[] visited, boolean[] recStack) {

		if (recStack[i])
			return true;

		if (visited[i])
			return false;

		visited[i] = true;
		recStack[i] = true;

		List<Integer> children = adj.get(i);
		for (Integer c : children) {
			if(isCyclicUtil(c, visited, recStack))
				return true;
		}

		recStack[i] = false;

		return false;
	}
}
