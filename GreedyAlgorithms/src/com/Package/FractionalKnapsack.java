package com.Package;
import java.util.Collections;
import  java.util.ArrayList;
import java.util.Comparator;

public class FractionalKnapsack {
    static void knapsack(ArrayList<KnapsackItem> items,int capacity){
        Comparator<KnapsackItem> comparator = new Comparator<KnapsackItem>() {
            @Override
            public int compare(KnapsackItem o1, KnapsackItem o2) {
                if(o2.getRatio() > o1.getRatio()){
                    return 1;
                }else{
                    return  -1;
                }
            }
        };
        Collections.sort(items,comparator);

        int usedcapacity = 0;
        double totalvalue = 0;

        for(KnapsackItem item : items){
            if(usedcapacity + item.getWeight()<=capacity){
                usedcapacity+=item.getWeight();
                System.out.println("Taken : " + usedcapacity);
                totalvalue+=item.getWeight();
            }else{
                int usedWeight = capacity - usedcapacity;
                double value = item.getRatio()+usedWeight;
                System.out.println("Taken : item index " + item.getIndex() + ", obtained value = "+ value + ". used weight = " + usedWeight + ", ratio = "+ item.getRatio());
                usedcapacity+=usedWeight;
                totalvalue+=value;
            }
            if(usedcapacity == capacity){
                break;
            }
            System.out.println("Total Value Obtained : " + totalvalue);
        }
    }
}
