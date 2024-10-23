package org.DSA.Recursion;

import java.util.ArrayList;
import java.util.HashMap;

/*
SCALER organizes a series of contests aimed at helping learners enhance their coding skills.
Each learner can participate in multiple contests, and their participation is represented by integers in an array.
The goal is to identify how frequently each learner has participated in these contests.
This information will help SCALER determine which learners are participating the least, allowing them to provide targeted support and encouragement.

Given an array A that represents the participants of various contests, where each integer corresponds to a specific learner, and an array B containing the learners for whom you want to check participation frequency, your task is to find the frequency of each learner from array B in the array A and return a list containing all these frequencies
Input 1: A = [1, 2, 1, 1]  B = [1, 2]  Output 1: [3, 1]
Input 2: A = [2, 5, 9, 2, 8]  B = [3, 2]  Output 2: [0, 2]
 */
public class FrequencyElementQuery {

    static ArrayList<Integer> findParticipationFrequency(int[] A, int[] B){
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int learner : A) {
            freqMap.put(learner, freqMap.getOrDefault(learner, 0) + 1);
        }

        ArrayList<Integer> result = new ArrayList<>();

        for (int learner : B) {
            result.add(freqMap.getOrDefault(learner, 0)); // Default is 0 if learner is not found
        }

        return result;
    }
    public static void main(String[] args) {
        int[] A = {1, 2, 1, 1}, B = {1, 2};

    }
}
