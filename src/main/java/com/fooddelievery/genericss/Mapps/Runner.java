package com.fooddelievery.genericss.Mapps;

public class Runner
{

    public static void main(String[] args) {


    OwnMap<String, Integer> ageMap = new OwnMap<>();
    ageMap.put("Saqib", 25);
    ageMap.put("Bob", 30);
        ageMap.put("Saqib", 45);

        System.out.println(ageMap.get("Saqib")); // 25
    System.out.println(ageMap.containsKey("Bob")); // true

    }
}