/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorabinariosjava;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author zeus
 */
public class CalculoBiTest {
    
    public CalculoBiTest() {
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
     * Test of numberValid method, of class CalculoBi.
     */
    @Test
    public void testNumberValid() {
        System.out.println("numberValid");
        String num = "";
        CalculoBi instance = new CalculoBi();
        boolean expResult = false;
        boolean result = instance.numberValid(num);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Empalme method, of class CalculoBi.
     */
    @Test
    public void testEmpalme_String_String() {
        System.out.println("Empalme");
        String b1 = "";
        String b2 = "";
        CalculoBi instance = new CalculoBi();
        String[] expResult = null;
        String[] result = instance.Empalme(b1, b2);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Empalme method, of class CalculoBi.
     */
    @Test
    public void testEmpalme_0args() {
        System.out.println("Empalme");
        CalculoBi instance = new CalculoBi();
        instance.Empalme();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBin1 method, of class CalculoBi.
     */
    @Test
    public void testSetBin1() {
        System.out.println("setBin1");
        String bin1 = "";
        CalculoBi instance = new CalculoBi();
        instance.setBin1(bin1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBin2 method, of class CalculoBi.
     */
    @Test
    public void testSetBin2() {
        System.out.println("setBin2");
        String bin2 = "";
        CalculoBi instance = new CalculoBi();
        instance.setBin2(bin2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Sumar method, of class CalculoBi.
     */
    @Test
    public void testSumar_String_String() throws Exception {
        System.out.println("Sumar");
        String b1 = "";
        String b2 = "";
        CalculoBi instance = new CalculoBi();
        String expResult = "";
        String result = instance.Sumar(b1, b2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Sumar method, of class CalculoBi.
     */
    @Test
    public void testSumar_0args() throws Exception {
        System.out.println("Sumar");
        CalculoBi instance = new CalculoBi();
        String expResult = "";
        String result = instance.Sumar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Restar method, of class CalculoBi.
     */
    @Test
    public void testRestar_String_String() throws Exception {
        System.out.println("Restar");
        String bin1 = "";
        String bin2 = "";
        CalculoBi instance = new CalculoBi();
        String expResult = "";
        String result = instance.Restar(bin1, bin2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Restar method, of class CalculoBi.
     */
    @Test
    public void testRestar_0args() throws Exception {
        System.out.println("Restar");
        CalculoBi instance = new CalculoBi();
        String expResult = "";
        String result = instance.Restar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Multiplicar method, of class CalculoBi.
     */
    @Test
    public void testMultiplicar() throws Exception {
        System.out.println("Multiplicar");
        CalculoBi instance = new CalculoBi();
        String expResult = "";
        String result = instance.Multiplicar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mayorBin method, of class CalculoBi.
     */
    @Test
    public void testMayorBin() {
        System.out.println("mayorBin");
        String b1 = "";
        String b2 = "";
        CalculoBi instance = new CalculoBi();
        boolean expResult = false;
        boolean result = instance.mayorBin(b1, b2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Dividir method, of class CalculoBi.
     */
    @Test
    public void testDividir() throws Exception {
        System.out.println("Dividir");
        CalculoBi instance = new CalculoBi();
        String expResult = "";
        String result = instance.Dividir();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
