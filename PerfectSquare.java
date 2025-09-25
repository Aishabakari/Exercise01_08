package com.bptn.course._01_variables;

public class PerfectSquare {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(1));
        System.out.println(isPerfectSquare(4));
        System.out.println(isPerfectSquare(Integer.MAX_VALUE/100));
        System.out.println(isPerfectSquare(255));
    }
    
    public static boolean isPerfectSquare(int num) {
        for (int i = 1; i * i <= num; i++) {
            if (i * i == num) { // Check if i squared equals num
                return true; // A perfect square is found
            } else if (i * i > num) {
                return false; // i squared exceeds num, so it's not a perfect square
            }
        }
        return false; // Return false if no perfect square is found
    }
}
