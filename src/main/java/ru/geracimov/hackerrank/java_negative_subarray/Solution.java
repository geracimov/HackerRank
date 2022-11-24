package ru.geracimov.hackerrank.java_negative_subarray;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }

    public static int solve(int[] ints) {
        int count = 0;
        for (int start = 0; start < ints.length; start++) {
            int sum = ints[start];
            if (sum < 0) count++;

            for (int end = start + 1; end < ints.length; end++) {
                sum += ints[end];
                if (sum < 0) count++;
            }
        }
        return count;
    }
}