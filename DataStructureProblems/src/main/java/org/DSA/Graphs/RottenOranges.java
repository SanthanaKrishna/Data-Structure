package org.DSA.Graphs;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * The Rotten Oranges problem is a Multi-Source BFS problem where we need to find the minimum time required for all fresh oranges to rot in a grid.
 * You are given a grid where:
 * A rotten orange makes its adjacent fresh oranges (up, down, left, right) rot
 * Find the minimum time required for all fresh oranges to rot. If some oranges cannot rot, return -1.
 * 0 represents an empty cell.
 * 1 represents a fresh orange.
 * 2 represents a rotten orange.
 * 1. count total oranges available in cell
 *  2. Remove it using BFS and manage the count in the end if count is not same, return -1 otherwise return minimum time
 *  use Linked as queue
 *  add --> addLast
 *  remove --> removeFirst
 */
public class RottenOranges {

    // Helper class to store row, column, and time for BFS traversal
    static class Cell {
        int row, col, time;

        Cell(int row, int col, int time) {
            this.row = row;
            this.col = col;
            this.time = time;
        }
    }

    // Directions to move in 4 possible ways: Up, Left, Down, Right
    static int[] rowDirection = {-1, 0, 1, 0};
    static int[] colDirection = {0, -1, 0, 1};

    public int findMinimumTimeToRotOranges(int[][] grid) {
        /**
         * 1. Count number of oranges
         * 2. At same time add rotted oranges in queue, do that we can add then for multisource BFS
         */
        int totalRows = grid.length;     // Number of rows
        int totalColumns = grid[0].length; // Number of columns

        Queue<Cell> queue = new ArrayDeque<>(); // BFS queue
        int freshOrangeCount = 0; // Count of fresh oranges

        // Step 1: Initialize Queue with Rotten Oranges and Count total Fresh Oranges
        for (int row = 0; row < totalRows; row++) {
            for (int col = 0; col < totalColumns; col++) {
                // count oranges, if rotted have it in queue with time = 0
                // multisource BFS problem, add all source in queue
                if (grid[row][col] == 2) {
                    queue.add(new Cell(row, col, 0)); // Rotten orange at time = 0
                }else if (grid[row][col] == 1) {
                    freshOrangeCount++; // Counting fresh oranges
                }
            }
        }

        // If there are no fresh oranges, return 0 (already rotten)
        if (freshOrangeCount == 0) return 0;

        // Step 2: Perform BFS level-wise to spread rot
        int minimumTimeRequired = 0; // Track the maximum time taken to rot all oranges

        while (!queue.isEmpty()) {
            // 1. Remove the front element from the queue
            Cell currentCell = queue.poll();
            // 2. Work --> storing min time and decrement in number of oranges
            minimumTimeRequired = currentCell.time; // Update time with the last processed node
            // Step 3: Add unvisited number : Try to rot adjacent fresh oranges
            // for any coordinate, we have 4 direction : top, left, down, right
            // validate the cell and have it in queue
            for (int direction = 0; direction < 4; direction++) {
                // Move in the i-th direction
                int newRow = currentCell.row + rowDirection[direction]; // New row position
                int newCol = currentCell.col + colDirection[direction]; // New column position

                // Check if the new position is valid and contains a fresh orange
                if (newRow >= 0 && newRow < totalRows && newCol >= 0 && newCol < totalColumns && grid[newRow][newCol] == 1) {
                    grid[newRow][newCol] = 2; // Mark orange as rotten
                    queue.add(new Cell(newRow, newCol, currentCell.time + 1)); // Add to queue with updated time
                    freshOrangeCount--; // Reduce fresh orange count
                }
            }
        }

        // Step 4: Check if any fresh oranges remain
        if (freshOrangeCount > 0) return -1; // Some fresh oranges are unreachable, return -1
        return minimumTimeRequired; // Corrected return statement
    }

    public static void main(String[] args) {
        RottenOranges solver = new RottenOranges();

        int[][] grid = {
                {2, 1, 1},
                {1, 1, 0},
                {0, 1, 1}
        };

        int result = solver.findMinimumTimeToRotOranges(grid);
        System.out.println("Minimum time to rot all oranges: " + result);
    }
}
