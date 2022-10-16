package com.Package;

public class LPS {
    private int findLPSLength(String s,int startIndex,int endIndex){
        if(startIndex > endIndex){
            return 0;
        }
        if(startIndex == endIndex){
            return 1;
        }
        int count1 = 0;
        if(s.charAt(startIndex) == s.charAt(endIndex)){
            count1 = 2 + findLPSLength(s,startIndex + 1,endIndex -1);
        }
        int count2 = findLPSLength(s,startIndex + 1,endIndex);
        int count3 = findLPSLength(s,startIndex,endIndex -1);

        return Math.max(count1,Math.max(count2,count3));
    }

    public int LPS(String s){
        return findLPSLength(s,0,s.length() -1);
    }
}
