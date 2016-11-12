/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.lang.reflect.Method;
import java.util.ArrayList;
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
public class MainPanelTest {
    public MainPanelTest() {
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
     * Test of convertToInt method, of class MainPanel.
     * pass 0 as argument, expect a exception as result
     */
    @Test(expected = IllegalArgumentException.class)
    public void testConvertToInt0() {
        MainPanel instance = new MainPanel(0);
        Class c = MainPanel.class;
        try{
            Method method = c.getDeclaredMethod("convertToInt", new Class[]{int.class});
            method.setAccessible(true);
            Object result = method.invoke(instance, new Object[]{0});
            assertEquals(0, result);
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    /**
     * Test of convertToInt method, of class MainPanel.
     * pass -1 as argument, however an array cannot have a negative length
     * expect an exception
     */
    @Test(expected = NegativeArraySizeException.class)
    public void testConvertToIntNegative() {
        MainPanel instance = new MainPanel(-1);
        Class c = MainPanel.class;
        try{
            Method method = c.getDeclaredMethod("convertToInt", new Class[]{int.class});
            method.setAccessible(true);
            Object result = method.invoke(instance, new Object[]{-1});
            assertEquals(-1, result);
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    /**
     * Test of convertToInt method, of class MainPanel.
     * pass 15 as argument, the test should pass
     */
    @Test
    public void testConvertToInt15() {
        MainPanel instance = new MainPanel(15);
        Class c = MainPanel.class;
        try{
            Method method = c.getDeclaredMethod("convertToInt", new Class[]{int.class});
            method.setAccessible(true);
            Object result = method.invoke(instance, new Object[]{15});
            assertEquals(15, result);
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    /**
     * Test of toString method, of class MainPanel.
     * pass 0 as argument, expect a exception as result
     */
    @Test(expected = IllegalArgumentException.class)
    public void testToString0() {
        MainPanel instance = new MainPanel(0);
        String str=instance.toString();
        System.out.println(str);
    }
    /**
     * Test of toString method, of class MainPanel.
     * pass 15 as argument, the test should pass
     */
    @Test
    public void testToString15() {
        MainPanel instance = new MainPanel(15);
        String str=instance.toString();
        System.out.println(str);
    }
    /**
     * Test of toString method, of class MainPanel.
     *  pass -1 as argument, however an array cannot have a negative length
     * expect an exception
     */
    @Test(expected = NegativeArraySizeException.class)
    public void testToStringNegatie() {
        MainPanel instance = new MainPanel(-1);
        String str=instance.toString();
        System.out.println(str);
    }

    
}
