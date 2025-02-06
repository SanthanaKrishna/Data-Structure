package org.DSA.Graphs;

/**
 *  using DFS-based Topological Sorting for the Course Schedule problem. This method detects cycles using a visited state array and constructs the topological order using post-order DFS traversal
 *  Approach
 * Use DFS for Topological Sorting.
 * Track each node's state:
 * 0 → Not visited
 * 1 → Visiting (part of recursion stack) → Cycle detected
 * 2 → Visited (added to topological order)
 * If a cycle is detected, return an empty list.
 * If no cycle, return the reverse of the DFS order.
 */
public class CourseScheduleDFS {
}
