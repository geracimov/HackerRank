package ru.geracimov.hackerrank.java_negative_subarray;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void solveCorrectTest() {
        assertThat(Solution.solve(new int[]{1, -2, 4, -5, 1})).isEqualTo(9);
    }

    @Test
    void solveOnlyNegativeTest() {
        assertThat(Solution.solve(new int[]{-1})).isEqualTo(1);
    }

    @Test
    void solveOnlyZeroTest() {
        assertThat(Solution.solve(new int[]{0})).isEqualTo(0);
    }

    @Test
    void solveEmptyTest() {
        assertThat(Solution.solve(new int[]{})).isEqualTo(0);
    }
}