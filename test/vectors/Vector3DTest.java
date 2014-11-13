/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectors;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Karolina i Daniel
 */
public class Vector3DTest {
    
    public Vector3DTest() {
    }
    
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Jestem w metodzie setUpClass");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Jestem w metodzie tearDownClass");
    }
    
    @Before
    public void setUp() {
        System.out.println("Jestem w metodzie setUp");
    }
    
    @After
    public void tearDown() {
        System.out.println("Jestem w metodzie tearDown");
    }

    @Test
    public void testLength() {
        System.out.println("length");
        Vector3D instance = new Vector3D(1,2,3);
        double expResult = Math.sqrt(1*1+2*2+3*3);
        double result = instance.length();
        assertEquals(expResult, result, 0.0);
       // fail("The test case is a prototype.");
    }

    @Test
    public void testAdd() {
        System.out.println("add");
        Vector3D anotherVector = new Vector3D(1,2,3);
        Vector3D instance = new Vector3D(4,7,3);
        Vector3D expResult = new Vector3D(5,9,6);
        Vector3D result = instance.add(anotherVector);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testMultiplyByScalar() {
        System.out.println("multiplyByScalar");
        double alpha = 3.0;
        Vector3D instance = new Vector3D(1,2,3);
        Vector3D expResult = new Vector3D(3,6,9);
        Vector3D result = instance.multiplyByScalar(alpha);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testDotProduct() {
        System.out.println("dotProduct");
        Vector3D anotherVector = new Vector3D(1,3,4);
        Vector3D instance = new Vector3D(2,2,2);
        double expResult = 16;
        double result = instance.dotProduct(anotherVector);
        assertEquals(expResult, result, 0.0);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testCrossProduct() {
        System.out.println("crossProduct");
        Vector3D anotherVector = new Vector3D(1,2,3);
        Vector3D instance = new Vector3D(2,3,4);
        Vector3D expResult = new Vector3D(1,-2,1);
        Vector3D result = instance.crossProduct(anotherVector);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Vector3D instance = new Vector3D(1,2,3);
        String expResult = "[1.0, 2.0, 3.0]";
        String result = instance.toString();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testEquals() {
        System.out.println("equals");
        Object anotherObject = new Vector3D(1,4,7);
        Vector3D instance = new Vector3D(1,4,7);
        boolean expResult = true;
        boolean result = instance.equals(anotherObject);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    
}
