package com.apirest.spring.app_template_basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class utils {

    private void examples(){
        String[] carros = {"Volvo", "BMW", "Ford", "Mazda"};
        int[] myNum = {10, 20, 30, 40};
        Object[] usersMock =  new Object[]{4,5};

    }

    private int getDataMock(){
        Object[] usersMock =  new Object[2];
        ArrayList<Object> numbers = new ArrayList<Object>();
        numbers.add(4);
        numbers.add(5);

        return 1;
    }

    private ArrayList<Integer> getArrayListInt(){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(20);
        numbers.add(54);
        numbers.add(9);
        for (Integer i : numbers) {
            System.out.println(i);
        }
        return numbers;
    }

    private ArrayList<Object> getArrayListObj(){
        ArrayList<Object> numbers = new ArrayList<Object>();
        numbers.add(54);
        numbers.add(9);
        return numbers;
    }

    private void getHashMap(){
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");

        // capitalCities.get("England");
        // capitalCities.remove("England");
        // capitalCities.clear(); ca

        // Print keys and values
        for (String i : capitalCities.keySet()) {
            System.out.println("key: " + i + " value: " + capitalCities.get(i));
        }
    }

    private void ArrayToList(){
      // Creating Array
      String[] colors={"blue","green","red","yellow"};
      System.out.println("Array: "+Arrays.toString(colors));
      //Converting Array to List
      List<String> list=new ArrayList<String>();
      for(String color: colors){
        list.add(color);
      }
      System.out.println("List: "+list);
    }

    private void getListExample2(){
        List<String> days = new ArrayList<String>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");
        // get()
        System.out.println("Element at index 1: "+days.get(1));
        // set() -- change
        days.set(2, "Miercoles");

        // Converting ArrayList to Array
        String[] array = days.toArray(new String[days.size()]);
        System.out.println("Array: "+Arrays.toString(array));
        System.out.println("List: "+days);

        for(String letter: days){
             System.out.println(letter);
        }
    }


    public static void sortListInteger() {
        List<Integer> numbers = Arrays.asList(5, 3, 2, 4, 1);
        numbers.sort(null);
        System.out.println(numbers); // prints [1, 2, 3, 4, 5]
    }

    
}
