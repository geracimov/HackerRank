package ru.geracimov.hackerrank.java.java_primality_test;

import java.io.*;
import java.math.BigInteger;

/**
 * A prime number is a natural number greater than  whose only positive divisors are  and itself. For example, the first six prime numbers are , , , , , and .
 * Given a large integer, , use the Java BigInteger class' isProbablePrime method to determine and print whether it's prime or not prime. *
 * Input Format
 * A single line containing an integer,  (the number to be checked).
 * Constraints
 *  contains at most  digits.
 * Output Format
 * If  is a prime number, print prime; otherwise, print not prime.
 * */
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String n = bufferedReader.readLine();
        System.out.println(isPrime(n) ? "prime" : "not prime");
        bufferedReader.close();
    }

    private static boolean isPrime(String n) {
        return new BigInteger(n).isProbablePrime(1);
    }
}
