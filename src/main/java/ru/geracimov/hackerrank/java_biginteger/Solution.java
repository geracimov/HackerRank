package ru.geracimov.hackerrank.java_biginteger;

import java.io.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            var a = new BigInteger(bufferedReader.readLine());
            var b = new BigInteger(bufferedReader.readLine());
            System.out.println(a.add(b));
            System.out.println(a.multiply(b));
        }
    }

}