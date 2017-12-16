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
public class WelcomeServiceTest {
    
    public WelcomeServiceTest() {
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
     * Test of welcome method, of class WelcomeService.
     */
    @Test
    public void testWelcome() {
        String user = "VP Bank";
        WelcomeService instance = new WelcomeService();
        String expResult = "Welcome VP Bank!";
        String result = instance.welcome(user);
        assertEquals(expResult, result);
    }
    
}
