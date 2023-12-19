package com.bimurto.leetcodesolutions.educative.fastandslowpointers;

public class Problem202HappyNumber {

    public boolean isHappy(int n) {

        var slowPointer = getSumOfSquaredDigits(n);
        var fastPointer = getSumOfSquaredDigits(getSumOfSquaredDigits(n));

        while (true) {
            if (slowPointer == 1) {
                return true;
            }
            if (fastPointer == slowPointer) {
                return false;
            }
            slowPointer = getSumOfSquaredDigits(slowPointer);
            fastPointer = getSumOfSquaredDigits(getSumOfSquaredDigits(fastPointer));
        }
    }

    private int getSumOfSquaredDigits(int n) {
        var sum = 0;
        while (n != 0) {
            var digit = n % 10;
            sum = sum + digit * digit;
            n = n / 10;
        }
        return sum;
    }
}
