package ru.geracimov.hackerrank.java_negative_subarray;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void solve() {
        assertThat(Solution.solve(new int[]{1, -2, 4, -5, 1})).isEqualTo(9);
    }
}