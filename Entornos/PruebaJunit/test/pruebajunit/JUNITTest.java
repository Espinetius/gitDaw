/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebajunit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class JUNITTest {
    
    public JUNITTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of piramide method, of class JUNIT.
     */
    @Test
    public void testPiramide() {
        System.out.println("piramide");
        int filas = 0;
        JUNIT instance = new JUNIT();
        instance.piramide(filas);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of ej15 method, of class JUNIT.
     */
    @Test
    public void testEj15() {
        System.out.println("ej15");
        int num1 = 0;
        int num2 = 0;
        JUNIT instance = new JUNIT();
        instance.ej15(num1, num2);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of ej9 method, of class JUNIT.
     */
    @Test
    public void testEj9() {
        System.out.println("ej9");
        int num = 0;
        JUNIT instance = new JUNIT();
        instance.ej9(num);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of ej13 method, of class JUNIT.
     */
    @Test
    public void testEj13() {
        System.out.println("ej13");
        int N = 0;
        JUNIT instance = new JUNIT();
        instance.ej13(N);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
