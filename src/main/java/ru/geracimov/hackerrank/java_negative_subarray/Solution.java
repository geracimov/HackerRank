package ru.geracimov.hackerrank.java_negative_subarray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) throws IOException {
        var bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        int[] ints = Arrays.stream(bufferedReader.readLine().split("\\s"))
                .map(Integer::parseInt)
                .mapToInt(Integer::intValue)
                .toArray();

        System.out.println(solve(ints));
    }

    public static int solve(int[] ints) {
        if (ints.length == 0) return 0;
        if (ints.length == 1) return ints[0] < 0 ? 1 : 0;

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