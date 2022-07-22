/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Junit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author david
 */
public class JUnitTest {
    
    public JUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of calculadoraSumRes method, of class JUnit.
     */
    @Test
    public void testCalculadoraSumRes() {
        System.out.println("calculadoraSumRes");
        JUnit instance = new JUnit();
        String palabra="suma";
        int expResult = 15;
        int result = instance.calculadoraSumRes(palabra);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of calculadora method, of class JUnit.
     */
    @Test
    public void testCalculadora() {
        System.out.println("calculadora");
        String operacion = "";
        JUnit instance = new JUnit();
        int expResult = 0;
        int result = instance.calculadora(operacion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of esmayoromenor method, of class JUnit.
     */
    @Test
    public void testEsmayoromenor() {
        System.out.println("esmayoromenor");
        int numero1 = 50;
        int numero2 = 4;
        JUnit instance = new JUnit();
        boolean expResult = true;
        boolean result = instance.esmayoromenor(numero1, numero2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of divisionnumeros method, of class JUnit.
     */
    @Test
    public void testDivisionnumeros() {
        System.out.println("divisionnumeros");
        int numero1 = 75;
        int numero2 = 2;
        JUnit instance = new JUnit();
        boolean mayor = true;
        String expResult = "la division no es exacta";
        String result = instance.divisionnumeros(numero1, numero2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of main method, of class JUnit.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        JUnit.main(args);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
