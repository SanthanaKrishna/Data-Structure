package org.DSA.Hashing;

import java.util.Arrays;
import java.util.HashMap;

/**
 * SCALER organizes a series of contests aimed at helping learners enhance their coding skills.
 * Each learner can participate in multiple contests, and their participation is represented by integers in an array.
 * The goal is to identify how frequently each learner has participated in these contests.
 * This information will help SCALER determine which learners are participating the least, allowing them to provide targeted support and encouragement.
 * Given an array A that represents the participants of various contests, where each integer corresponds to a specific learner, and an array B containing the learners for whom you want to check participation frequency, your task is to find the frequency of each learner from array B in the array A and return a list containing all these frequencies
 * Input 1: A = [1, 2, 1, 1] B = [1, 2]    Output 1: [3, 1]
 * Input 2: A = [2, 5, 9, 2, 8] B = [3, 2]   Output 2: [0, 2]
 * For Input 1:
 * The frequency of learner 1 in the array A is 3 (they participated in three contests).
 * The frequency of learner 2 in the array A is 1 (they participated in one contest).
 * For Input 2:
 * The frequency of learner 3 in the array A is 0 (they did not participate in any contest).
 * The frequency of learner 2 in the array A is 2 (they participated in two contests).
 */
public class FrequencyElementQuery {
    static int[] findLearnerParticipation(int[] A, int[] B) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int[] result = new int[B.length];

        for (int i = 0; i < A.length; i++) {
            hm.put(A[i], hm.getOrDefault(A[i], 0) + 1);
        }

        for (int i = 0; i < B.length; i++) {
            result[i] = hm.getOrDefault(B[i], 0);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 1, 1}, B = {1, 2};
        int[] result = findLearnerParticipation(A, B);
        System.out.println(Arrays.toString(result));
    }
}
