package com.mycompany.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{

	//this method returns true when multiplication of array1 with the last element of array2 equals 
    // multiplication of array2 and the last element of array1. Else this method returns false 
    public static boolean equalityOfExtendedArrays(ArrayList<Integer> array1 , ArrayList<Integer> array2 , int a1 , int a2){
    	
    	if (array1 == null) return false;
    	if (array2 == null) return false;
    	if (array1.size() == 0) return false;
    	if (array2.size() == 0) return false;
    	//you cant entry a emtpy array as array1 or array2

    	if (array1.size() != array2.size()) return false;
    	//you cant entry two array that have different sizes

    	ArrayList<Integer> array1MultiplyWithA1 = new ArrayList<Integer>();
		ArrayList<Integer> array2MultiplyWithA2 = new ArrayList<Integer>();
    	
    	//multiplication the array1 with the last element of array2
    	for (int element : array1){
    		array1MultiplyWithA1.add(element*a2);
    	}    	

    	//multiplication the array1 with the last element of array2
    	for (int element : array2){
    		array2MultiplyWithA2.add(element*a1);
    	}    	

    	boolean control = true;

    	for (int i = 0 ; i < array1MultiplyWithA1.size() ; i++ ){//same sizes

    		if (array1MultiplyWithA1.get(i) != array2MultiplyWithA2.get(i))
    			control = false;
    	}

    	return control;	
    }


    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
