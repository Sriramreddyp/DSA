package com.Package;

import java.util.Arrays;
import java.util.HashSet;
public class Merge {
    static Double Median(int arr1[],int arr2[]){
        HashSet<Integer> hs= new HashSet<Integer>();

        if(arr1.length == 0 || arr2.length == 0){
            return  null;
        }
        int totSize = arr1.length + arr2.length;

        int innerVariable = 0;
        for(int i = 0;i<totSize;i++) {
            if (i > arr1.length - 1) {

                hs.add(arr2[innerVariable]);
                innerVariable++;
            } else {
                hs.add(arr1[i]);
            }
        }

        int[] totalArray = hs.stream().mapToInt(Number::intValue).toArray();
        if(totalArray.length % 2 == 0){
            Double first = (double)totalArray[totalArray.length / 2];
            Double second = (double)totalArray[(totalArray.length / 2) - 1];
            return ((first + second)/2);
        }else{
              int index = (int)Math.floor(totalArray.length / 2);
              int median = totalArray[index];
              return (double)median;
        }
    }


    public static void main(String[] args){
        int arr1[] = new int[]{1,2,3,4};
        int arr2[] = new int[]{5,6,7,8,10,11,12,13};
        System.out.println(Median(arr1,arr2));
    }
}
