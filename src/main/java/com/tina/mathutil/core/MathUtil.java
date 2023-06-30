/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tina.mathutil.core;

/**
 *
 * @author User
 */
public class MathUtil {
    public static long getFactorial(int n){
        if (n < 0 || n > 20){
            throw new IllegalArgumentException("input must be under 20 and not a negative number");
        }
        if (n == 0 || n == 1){
            return 1;
        }
        long res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    }
}
