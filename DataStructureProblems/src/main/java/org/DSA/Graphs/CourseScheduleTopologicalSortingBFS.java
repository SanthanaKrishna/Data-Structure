package org.DSA.Graphs;

import java.util.*;

/**
 * BFS (Kahn's Algorithm) for Topological Sorting
 * Kahn's Algorithm is a BFS-based approach to Topological Sorting. It uses indegree to determine the order of courses
 * Steps to Solve the Problem
 * Build the Graph:
 *
 * Represent the courses as a Directed Graph (Adjacency List).
 * Maintain an indegree array (indegree[i]) that tracks how many prerequisites a course has.
 * Initialize the Queue:
 *
 * Add all nodes with indegree = 0 (courses that have no prerequisites) to a queue.
 * Process the Queue (BFS Traversal):
 *
 * Remove a course from the queue and add it to the topological order.
 * Reduce the indegree of its neighbors (dependent courses).
 * If any neighbor's indegree becomes 0, add it to the queue.
 * Check for Cycles:
 *
 * If the topological order contains all courses, return it.
 * If some courses are missing (not processed), a cycle exists, return an empty list.
 */
public class CourseScheduleTopologicalSortingBFS {
    public static int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        int[] inDegree = new int[numCourses];
        int[] topologicalOrder = new int[numCourses];

        for (int i = 0; i < numCourses; i++) { // Initialize adjacency list
            graph.add(new ArrayList<>());
        }

        for (int[] pre : prerequisites) {  // Build the graph and in-degree array
            int course = pre[0];
            int prereq = pre[1];
            graph.get(prereq).add(course); // prereq -> course
            inDegree[course]++; // Increment in-degree for the course
        }

        Queue<Integer> queue = new LinkedList<>(); // Queue for courses with no prerequisites (in-degree = 0)
        for (int i = 0; i < numCourses; i++) {
            if (inDegree[i] == 0) {
                queue.offer(i); //add
            }
        }

        int index = 0;// Track order of courses

        //Process courses
        while (!queue.isEmpty()) {
            int course = queue.poll(); //remove
            topologicalOrder[index++] = course; // Store course in order

            for (int nextCourse : graph.get(course)) {
                inDegree[nextCourse]--; // Remove prerequisite
                if (inDegree[nextCourse] == 0) {  // If no more prerequisites, add to queue
                    queue.offer(nextCourse);
                }
            }
        }
        // If we were able to process all courses, return the order
        return (index == numCourses) ? topologicalOrder : new int[0]; // Return empty array if cycle exists
    }

    public static void main(String[] args) {
        int numCourses = 4;
        int[][] prerequisites = {
                {1, 0}, // Course 1 needs Course 0
                {2, 1}, // Course 2 needs Course 1
                {3, 2}  // Course 3 needs Course 2
        };
        int[] order = findOrder(numCourses, prerequisites);
        System.out.println("Topological Order: " + Arrays.toString(order));

        int numCourses1 = 4;
        int[][] prerequisites1 = { {1, 0}, {2, 0}, {3, 1}, {3, 2} };
        int[] order1 = findOrder(numCourses, prerequisites1);
        System.out.println("Topological Order: " + Arrays.toString(order1));

        int numCourses2 = 3;
        int[][] prerequisites2 = { {1, 0}, {0, 1} };
        int[] order2 = findOrder(numCourses, prerequisites2);
        System.out.println("Topological Order: " + Arrays.toString(order2));
    }
}
