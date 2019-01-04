/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findit.findit_database;

import java.util.LinkedList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class ElementInsertionTest {
    
    public ElementInsertionTest() {
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
     * Test of insert method, of class ElementInsertion.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        LinkedList<Element> expResult = null;
        LinkedList<Element> result = ElementInsertion.insert();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sort method, of class ElementInsertion.
     */
    /*@Test
    public void testSort() {
        System.out.println("sort");
        Object list = null;
        LinkedList<LinkedList<Element>> expResult = null;
        //LinkedList<LinkedList<Element>> result = ElementInsertion.sort(list);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
    
}
