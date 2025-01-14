package org.DSA.Heaps;

import java.util.Arrays;
import java.util.Comparator;

/**
 * #JobScheduling.java
 * implement the Activity Selection (or Job Scheduling) problem using the greedy approach
 * Problem Statement:
 * Given n jobs with their start and end times, find the maximum number of jobs that can be completed if only one job can be done at a time.
 * Problem Description
 * There are N jobs to be done, but you can do only one job at a time.
 * Given an array A denoting the start time of the jobs and an array B denoting the finish time of the jobs.
 * Your aim is to select jobs in such a way so that you can finish the maximum number of jobs.
 * Return the maximum number of jobs you can finish.
 * Input 1:A = [1, 5, 7, 1] B = [7, 8, 8, 8]    Output 1: 2
 * Input 2: A = [3, 2, 6] B = [9, 8, 9]   Output 2: 1
 * Explanation 1: We can finish the job in the period of time: (1, 7) and (7, 8).
 * Explanation 2:  Since all three jobs collide with each other. We can do only 1 job.
 * ##Algorithm Steps:
 * 1.Sort all jobs based on their end times.</li>
 * 2.For each subsequent job, check if its start time is greater than or equal to the finish time of the last selected job. If yes, select it..</li>
 * 3.Continue this process to maximize the number of non-overlapping jobs..</li>
 * ##Complexity:
 * - **Time Complexity**: O(n log n) for sorting, and O(n * m) for scheduling, where n is the number of jobs, and m is the maximum deadline.</p>
 */
public class JobScheduling {
    static class Job { // Job class to store start and end times
        int start, end;

        Job(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public static int maxJobs(Job[] jobs) {  // Function to find the maximum number of jobs
        Arrays.sort(jobs, Comparator.comparing(job -> job.end));   // Sort all jobs based on their end times.

        int count = 1;
        int lastSelectedJobEnd = jobs[0].end;

        for (int i = 1; i < jobs.length; i++) {
            if (jobs[i].start >= lastSelectedJobEnd) {
                count++;
                lastSelectedJobEnd = jobs[i].end;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // Example input
        Job[] jobs = {
                new Job(1, 2),
                new Job(3, 4),
                new Job(0, 6),
                new Job(5, 7),
                new Job(8, 9),
                new Job(5, 9)
        };

        int maxJobs = maxJobs(jobs);
        System.out.println("Maximum number of non-overlapping jobs: " + maxJobs);  // output is 4

        int[] A = {1, 5, 7, 1};
        int[] B = {7, 8, 8, 8};
        int n = A.length;
        // Create an array of Job objects to store start and finish times
        Job[] jobs2 = new Job[n];
        for (int i = 0; i < n; i++) {
            jobs2[i] = new Job(A[i], B[i]);
        }

        int maxJobs2 = maxJobs(jobs2);
        System.out.println("Maximum number of non-overlapping jobs: " + maxJobs2);  // output is 2
    }
}


/**
 * Explanation:
 * Job Class: A class to represent the start and end times of each job.
 * maxJobs Function:
 * Sorts the jobs by their end time using Arrays.sort with a custom comparator.
 * Selects the first job and keeps a counter count to track the number of selected jobs.
 * Iterates through the remaining jobs and checks if the current job can be selected based on its start time.
 * Updates the count and the end time of the last selected job if the current job is selected.
 */
