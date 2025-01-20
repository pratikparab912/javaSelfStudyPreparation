package com.selfmadeproblems.cloudexample;

import java.util.LinkedHashMap;
import java.util.Map;

public class TypesOfCloud {
    public static void main(String[] args) {
        LinkedHashMap<String,String> cloudMap = new LinkedHashMap<>();
        cloudMap.put("Cirrus","8000-12000 metres");
        cloudMap.put("Cumulus","4000-8000 metres");
        cloudMap.put("Stratus","2000-4000 metres");
        cloudMap.put("Nimbus","0-2000 metres");

        //Print the number of clouds
        System.out.println("Total number of clouds : " +cloudMap.size());

        //Print the names of the clouds
        System.out.println("\nNames of the clouds :");
        for(String cloudNames : cloudMap.keySet())
        {
            System.out.println(cloudNames);
        }

        //Print the names of the clouds along with their ranges
        System.out.println("\nClouds with their height ranges");
        for(Map.Entry<String,String> cloudDetails : cloudMap.entrySet())
        {
            System.out.println(cloudDetails.getKey()+" : "+cloudDetails.getValue());
        }

        TypesOfCloud.rainCapacityCloud();
    }

    public static void rainCapacityCloud() {
        System.out.println("\nOnly Nimbus cloud has a capacity to drop a rain.");
    }
}
