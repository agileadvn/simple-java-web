/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hien
 */
public class CalculatorTest {
    
    public CalculatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of sum method, of class Calculator.
     */
    @Test
    public void testSum() {
        int number1 = 10;
        int number2 = 20;
        Calculator instance = new Calculator();
        int expResult = 40;
        int result = instance.sum(number1, number2);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSum2() {
        int number1 = 1;
        int number2 = 20;
        Calculator instance = new Calculator();
        int expResult = 21;
        int result = instance.sum(number1, number2);
        assertEquals(expResult, result);
    }
}
