package com.Package;
import java.util.*;
public class RomanToInt {

    public static int romanToInt(String s) {
        HashMap<Character,Integer> Romans = new HashMap<Character,Integer>();
        Romans.put('I',1);
        Romans.put('V',5);
        Romans.put('X',10);
        Romans.put('L',50);
        Romans.put('C',100);
        Romans.put('D',500);
        Romans.put('M',1000);

        int Result = 0;
        //Second step : start comparing the string with the hashmap

        for(int i = 0;i<s.length();i++){
            char Roman = s.charAt(i);
            int Int = Romans.get(Roman);




            //Apply Condition

            if(i-1 >= 0){
                int extraValue = 0;
                extraValue = Romans.get(s.charAt(i-1));

                if(Int > extraValue){
                    int temp = Int - extraValue;
                    Result = Result + temp - extraValue;
                    continue;
                }

            }

            Result = Result + Int;

        }


        return Result;

    }

    public static  void main(String[] args){
        romanToInt("IV");
        System.out.println(romanToInt("LVIII"));
    }
}
