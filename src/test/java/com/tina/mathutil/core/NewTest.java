/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.tina.mathutil.core;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static com.tina.mathutil.core.MathUtil.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author User
 */

public class NewTest {

    @Test
    public void checkInputOfGetFactorial() {
        assertEquals(2, getFactorial(2));
        assertEquals(6, getFactorial(3));


    }
    
    public static Object[][] initData(){
        return new Integer[][] {
            {0,1},
            {1,1},
            {2,3},
        };
    }
    
    @ParameterizedTest
    @MethodSource(value = "initData")
    public void testDDT(int input, long expected){
        assertEquals(expected, getFactorial(input));
    }
}
