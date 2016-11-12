/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author duxia
 */
public class CellTest {
    
    public CellTest() {
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
     * Test of toString method, of class Cell.
     * the cell is alive, the string it backs should be X
     */
    @Test
    public void testToStringAlive() {
        Cell cell = new Cell();
        cell.setAlive(true);
        String result=cell.toString();
        assertEquals("X", result);
    }
    
    /**
     * Test of toString method, of class Cell.
     * the cell is dead, the string it backs should be " "
     */
    @Test
    public void testToStringDie() {
        Cell cell = new Cell();
        cell.setAlive(false);
        String result=cell.toString();
        assertEquals(" ", result);
    }
    
    /**
     * Test of toString method, of class Cell.
     * the cell is dead and has been alive, the string it backs should be " "
     */
    @Test
    public void testToStringBeenAlive() {
        Cell cell = new Cell();
        cell.reset();
        String result=cell.toString();
        assertEquals(" ", result);
    }

    
}
