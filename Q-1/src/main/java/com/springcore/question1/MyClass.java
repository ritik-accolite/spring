package com.springcore.question1;
import java.util.Map;

public class MyClass {
private Map<String, Integer> myMap;
    
    public MyClass(Map<String, Integer> myMap) {
        this.myMap = myMap;
    }
    
    public void printMap() {
        for (Map.Entry<String, Integer> entry : myMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
