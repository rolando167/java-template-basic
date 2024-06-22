package com.apirest.spring.app_template_basic;

import java.util.ArrayList;
import java.util.HashMap;

public class utils {
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

    private void hashMap(){
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");

        // capitalCities.get("England");
        // capitalCities.remove("England");
        // capitalCities.clear();

        // Print keys and values
        for (String i : capitalCities.keySet()) {
            System.out.println("key: " + i + " value: " + capitalCities.get(i));
        }
    }

    private void examples(){
        String[] carros = {"Volvo", "BMW", "Ford", "Mazda"};
        int[] myNum = {10, 20, 30, 40};
        Object[] usersMock =  new Object[]{4,5};

    }
}
