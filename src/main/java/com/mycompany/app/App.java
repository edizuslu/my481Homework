package com.mycompany.app;

import static spark.Spark.get;
import static spark.Spark.port;
import static spark.Spark.post;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import spark.ModelAndView;
import spark.template.mustache.MustacheTemplateEngine;

public class App 
{

	//This method takes four list of integer and create a new list which have the biggest numbers in the all indices.

    public static ArrayList<Integer> biggestInTheIndices(ArrayList<Integer> array1 , ArrayList<Integer> array2 , ArrayList<Integer> array3 , ArrayList<Integer> array4){
    	
    	ArrayList<Integer> empty = new ArrayList<Integer>(); 

    	if (array1 == null) return empty;
    	if (array2 == null) return empty;
    	if (array3 == null) return empty;
    	if (array4 == null) return empty;
    	
    	if (array1.size() == 0) return empty;
    	if (array2.size() == 0) return empty;
    	if (array3.size() == 0) return empty;
    	if (array4.size() == 0) return empty;
    	

    	if (array1.size() != array2.size() || array3.size() != array4.size() || array1.size() != array3.size() ) return empty;

    	ArrayList<Integer> resultArray = new ArrayList<Integer>();
		
    	for (int i = 0 ; i < array1.size() ; i++){
    		resultArray.add(biggestNumber(array1.get(i),array2.get(i),array3.get(i),array4.get(i))); 
    	}

    	return resultArray;	
    }

    public static int biggestNumber(int a , int b , int c , int d){
    	int temp = 0;
    	if (a >= temp)
    		temp = a;
    	if (b >= temp)
    		temp = b;
    	if (c >= temp)
    		temp = c;
    	if (d >= temp)
    		temp = d;
    	return temp;
    }


       public static void main(String[] args) {
        port(getHerokuAssignedPort());

        get("/", (req, res) -> "Hello, World");

        post("/compute", (req, res) -> {
        
        //input1
        String input1 = req.queryParams("input1");
        java.util.Scanner sc1 = new java.util.Scanner(input1);
        sc1.useDelimiter("[;\r\n]+");
        java.util.ArrayList<Integer> inputList = new java.util.ArrayList<>();
        while (sc1.hasNext()){
        	int value = Integer.parseInt(sc1.next().replaceAll("\\s",""));
            inputList.add(value);
        }
		System.out.println(inputList);

        //second input2
        String input2 = req.queryParams("input2");
        java.util.Scanner sc2 = new java.util.Scanner(input2);
        sc2.useDelimiter("[;\r\n]+");
        java.util.ArrayList<Integer> inputList2 = new java.util.ArrayList<>();
        while (sc2.hasNext()){
        	int value = Integer.parseInt(sc2.next().replaceAll("\\s",""));
            inputList2.add(value);
        }
        System.out.println(inputList2);
        
        //input3
        
        String input3 = req.queryParams("input3");
        java.util.Scanner sc3 = new java.util.Scanner(input3);
        sc3.useDelimiter("[;\r\n]+");
        java.util.ArrayList<Integer> inputList3 = new java.util.ArrayList<>();
        while (sc3.hasNext()){
        	int value = Integer.parseInt(sc3.next().replaceAll("\\s",""));
            inputList3.add(value);
        }
		System.out.println(inputList3);
		
		//input 4

		String input4 = req.queryParams("input4");
        java.util.Scanner sc4 = new java.util.Scanner(input4);
        sc4.useDelimiter("[;\r\n]+");
        java.util.ArrayList<Integer> inputList4 = new java.util.ArrayList<>();
        while (sc4.hasNext()){
        	int value = Integer.parseInt(sc4.next().replaceAll("\\s",""));
            inputList4.add(value);
        }
		System.out.println(inputList4);


		ArrayList<Integer> result = App.biggestInTheIndices(inputList, inputList2 , inputList3 , inputList4 );
		
    	
		


        Map map = new HashMap();
        map.put("result : ", result);
        return new ModelAndView(map, "compute.mustache");
        }, new MustacheTemplateEngine());


        get("/compute",
            (rq, rs) -> {
              Map map = new HashMap();
              map.put("result", "not computed yet!");
              return new ModelAndView(map, "compute.mustache");
            },
            new MustacheTemplateEngine());
    }

    static int getHerokuAssignedPort() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return Integer.parseInt(processBuilder.environment().get("PORT"));
        }
        return 4567; //return default port if heroku-port isn't set (i.e. on localhost)
    }


}
