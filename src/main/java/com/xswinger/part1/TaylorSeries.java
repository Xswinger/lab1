package com.xswinger.part1;

public class TaylorSeries {
    public double calc(double value, int n) {
        double res = (Math.pow(-1, n+1) * Math.pow(2, 2*n) * (Math.pow(2, 2 * n) - 1) * 1 * Math.pow(value, 2 * n - 1))/(factorialUsingForLoop(n));

        return res;
    }

    private long factorialUsingForLoop(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
