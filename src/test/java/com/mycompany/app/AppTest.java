package com.mycompany.app;

import java.util.ArrayList;
import java.util.Arrays;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    public void testNullFirstArray() {
        ArrayList<Integer> empty = new ArrayList<Integer>();
        ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> array3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> array4 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> result = new App().biggestInTheIndices(null , array2 , array3 , array4 );
        for (int i = 0; i < result.size(); i++)
            assertEquals(empty.get(i), result.get(i));
    }


    public void testNullSecondArray() {
        ArrayList<Integer> empty = new ArrayList<Integer>();
        ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> array3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> array4 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> result = new App().biggestInTheIndices(array2 , null , array3 , array4 );
        for (int i = 0; i < result.size(); i++)
            assertEquals(empty.get(i), result.get(i));
    }

    public void testNullThirdArray() {
        ArrayList<Integer> empty = new ArrayList<Integer>();
        ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> array3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> array4 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> result = new App().biggestInTheIndices(array2 , array3 , null , array4 );
        for (int i = 0; i < result.size(); i++)
            assertEquals(empty.get(i), result.get(i));
    }

    public void testNullFourthArray() {
        ArrayList<Integer> empty = new ArrayList<Integer>();
        ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> array3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> array4 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> result = new App().biggestInTheIndices(array2 , array4 , array3 , null );
        for (int i = 0; i < result.size(); i++)
            assertEquals(empty.get(i), result.get(i));
    }

    public void testEmptyFirstArray() {
        ArrayList<Integer> empty = new ArrayList<Integer>();
        ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> array3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> array4 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> result = new App().biggestInTheIndices(empty , array2 , array3 , array4 );
        for (int i = 0; i < result.size(); i++)
            assertEquals(empty.get(i), result.get(i));
    }

    public void testEmptySecondArray() {
        ArrayList<Integer> empty = new ArrayList<Integer>();
        ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> array3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> array4 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> result = new App().biggestInTheIndices(array2 , empty , array3 , array4 );
        for (int i = 0; i < result.size(); i++)
            assertEquals(empty.get(i), result.get(i));
    }

    public void testEmptyThirdArray() {
        ArrayList<Integer> empty = new ArrayList<Integer>();
        ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> array3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> array4 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> result = new App().biggestInTheIndices(array3 , array2 , empty , array4 );
        for (int i = 0; i < result.size(); i++)
            assertEquals(empty.get(i), result.get(i));
    }

    public void testEmptyFourthArray() {
        ArrayList<Integer> empty = new ArrayList<Integer>();
        ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> array3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> array4 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> result = new App().biggestInTheIndices(array4 , array2 , array3 , empty );
        for (int i = 0; i < result.size(); i++)
            assertEquals(empty.get(i), result.get(i));
    }

    public void testDifferentSizesForFirstAndSecond() {
        ArrayList<Integer> empty = new ArrayList<Integer>();
        ArrayList<Integer> array1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4 , 5));
        ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> array3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> array4 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> result = new App().biggestInTheIndices(array1 , array2 , array3 , array4 );
        for (int i = 0; i < result.size(); i++)
            assertEquals(empty.get(i), result.get(i));
    }

    public void testDifferentSizesForThirdAndFourth() {
        ArrayList<Integer> empty = new ArrayList<Integer>();
        ArrayList<Integer> array1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> array3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4 , 5));
        ArrayList<Integer> array4 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> result = new App().biggestInTheIndices(array1 , array2 , array3 , array4 );
        for (int i = 0; i < result.size(); i++)
            assertEquals(empty.get(i), result.get(i));
    }


    public void testDifferentSizesForFirstAndThird() {
        ArrayList<Integer> empty = new ArrayList<Integer>();
        ArrayList<Integer> array1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> array3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4 , 5));
        ArrayList<Integer> array4 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> result = new App().biggestInTheIndices(array1 , array2 , array3 , array4 );
        for (int i = 0; i < result.size(); i++)
            assertEquals(empty.get(i), result.get(i));
    }

    public void testExceptedResult() {
        ArrayList<Integer> array1 = new ArrayList<>(Arrays.asList(5, 27, 7, 11 ));
        ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(4, 2, 16, 40));
        ArrayList<Integer> array3 = new ArrayList<>(Arrays.asList(17, 9, 6, 4 , 5));
        ArrayList<Integer> array4 = new ArrayList<>(Arrays.asList(1, 11, 81, 14));
        
        ArrayList<Integer> expectedResult = new ArrayList<>(Arrays.asList(17, 27, 81, 40));
        
        ArrayList<Integer> result = new App().biggestInTheIndices(array1 , array2 , array3 , array4 );

        for (int i = 0; i < result.size(); i++)
            assertTrue(expectedResult.get(i) == result.get(i));
    }

    public void testUnExceptedResult() {
        ArrayList<Integer> array1 = new ArrayList<>(Arrays.asList(5, 27, 7, 11 ));
        ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(4, 2, 16, 40));
        ArrayList<Integer> array3 = new ArrayList<>(Arrays.asList(17, 9, 6, 4 , 5));
        ArrayList<Integer> array4 = new ArrayList<>(Arrays.asList(1, 11, 81, 14));
        
        ArrayList<Integer> expectedResult = new ArrayList<>(Arrays.asList(17, 27, 81, 14));
        
        ArrayList<Integer> result = new App().biggestInTheIndices(array1 , array2 , array3 , array4 );

        boolean control = true; 
        for (int i = 0; i < result.size(); i++){
            if(expectedResult.get(i) != result.get(i)){
               control = false; 
            }
        }
        assertFalse(control);
    }

    public void testTheAuxMethod(){
        assertTrue(48 == new App().biggestNumber(7,8,1,48));
    }
    
}
