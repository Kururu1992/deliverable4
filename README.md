# deliverable4
##Summary

    The methods are determined to be changed by evaluating the CPU usage and memory usage.  By profling the program via VisionVM, the result showed that the most part of CPU and memory are occupied by three funtion: convertToInt() in MainPanel.class, runContinuous() in MainPanel.class, and the non-parameter constructor of Cell.class.  Thus, the main modification will focus on these three functions.
    
    For the convertToInt(), no matter how the function handle the variables, the function will always return a value same as the parameter pass to the function.  Thus, deleting this part of code will significantly decrease the CPU usage.
    
    For the runContinuous(), the variable _r is sent to the variable origR.  Although there is a process to modify the value of _r, the _r will always equal to the origR, in other word, the original _r, thus the code to calcuate _r is useless.  Deleting this part of code will decrease the CPU and memory usage.  
    
    The toString() in MainPanel.class can be also modified.  No matter the cell is alived or not, the content of _cell[j][k] will always write into the toWrite string.  Thus the condition to judge the  cell is alive is useless. This modification will slightly decrease the CPU usage.
    
    The toString() in Cell.class scan all the cell from current visiting cell, and always return current state of the first cell.  Base on the function it performs, the method can directly return the current state of the cell rather than scanning other redundant cells.  This will significantly save the CPU and memory usage.
    
##Screenshots
###Before refactoring
![](https://github.com/Kururu1992/deliverable4/blob/master/screenshot/origin1.jpg)
###After refactoring
![](https://github.com/Kururu1992/deliverable4/blob/master/screenshot/modify3.jpg)

##Pinning test
###Unit test

    The unit test is focus on convertToInt(), toString() in MainPanel and toString() in Cell.  Design the unit tests before modification, and keep the unit tests unchange after refactoring.  A reasonable refactoring should perform the same test result.
    For instance, use -1 to test the edge case of convertToInt().  The result should throw an exception before or after modification.  
    
```Java
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
```

###Manual test

    Since the runContinuous() in MainPanel return nothing, it is hard to design the unit test for it.  Thus, the manual test should be applied here.  
    The basic operation is recording an arrangement of cell before modification and then press run continuous button.                                
      
    
