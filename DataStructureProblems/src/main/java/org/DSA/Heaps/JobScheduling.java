package org.DSA.Heaps;

import java.util.Arrays;
import java.util.Comparator;

/**
 * JobScheduling.java
 * implement the Activity Selection (or Job Scheduling) problem using the greedy approach
 *
 * <p>
 * <h2>Problem Statement:</h2>
 * Given n jobs with their start and end times, find the maximum number of jobs that can be completed if only one job can be done at a time.
 * </p>
 *
 * <h2>Algorithm Steps:</h2>
 * <ul>
 * <li>Sort all jobs based on their end times.</li>
 * <li>For each subsequent job, check if its start time is greater than or equal to the finish time of the last selected job. If yes, select it..</li>
 * <li>Continue this process to maximize the number of non-overlapping jobs..</li>
 * </ul>
 *
 * <h2>Complexity:</h2>
 * <p>Time Complexity: O(n log n) for sorting, and O(n * m) for scheduling,
 * where n is the number of jobs, and m is the maximum deadline.</p>
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
    }
}


/**
 * <h3>Explanation:</h3>
 * <p>Job Class: A class to represent the start and end times of each job.</p>
 * <h3>maxJobs Function:</h3>
 * <ul>
 * <li>Sorts the jobs by their end time using Arrays.sort with a custom comparator.</li>
 * <li>Selects the first job and keeps a counter count to track the number of selected jobs.</li>
 * <li>Iterates through the remaining jobs and checks if the current job can be selected based on its start time.</li>
 * <li>Updates the count and the end time of the last selected job if the current job is selected.</li>
 * </ul>
 */
