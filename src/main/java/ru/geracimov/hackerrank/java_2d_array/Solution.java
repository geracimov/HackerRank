package ru.geracimov.hackerrank.java_2d_array;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


/**
 * You are given a  2D array. An hourglass in an array is a portion shaped like this:
 * a b c
 * d
 * e f g
 * For example, if we create an hourglass using the number 1 within an array full of zeros, it may look like this:
 * 1 1 1 0 0 0
 * 0 1 0 0 0 0
 * 1 1 1 0 0 0
 * 0 0 0 0 0 0
 * 0 0 0 0 0 0
 * 0 0 0 0 0 0
 * Actually, there are many hourglasses in the array above. The three leftmost hourglasses are the following:
 * 1 1 1     1 1 0     1 0 0
 * 1         0         0
 * 1 1 1     1 1 0     1 0 0
 * The sum of an hourglass is the sum of all the numbers within it. The sum for the hourglasses above are 7, 4, and 2, respectively.
 * In this problem you have to print the largest sum among all the hourglasses in the array.
 * Input Format
 * There will be exactly  lines, each containing  integers seperated by spaces. Each integer will be between  and  inclusive.
 * Output Format
 * Print the answer to this problem on a single line.
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        System.out.println(maxHourglassSize(arr));
        bufferedReader.close();
    }

    private static int maxHourglassSize(List<List<Integer>> arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                List<Integer> line1 = arr.get(i);
                List<Integer> line2 = arr.get(i + 1);
                List<Integer> line3 = arr.get(i + 2);
                int sum = line1.get(j) + line1.get(j + 1) + line1.get(j + 2)
                        + line2.get(j + 1)
                        + line3.get(j) + line3.get(j + 1) + line3.get(j + 2);
                max = Math.max(max, sum);
            }
        }
        return max;
    }
}
