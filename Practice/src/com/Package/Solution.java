package com.Package;
import java.util.HashSet;
class Solution {
    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs = new HashSet<Character>();
        int sizeOfSubString = 0;
        int maxSubString = 0;
        for (int i = 0; i < s.length(); i++) {

            if (hs.contains(s.charAt(i))) {
                hs.clear();
                maxSubString = sizeOfSubString;
                sizeOfSubString = 0;
            } else {
                hs.add(s.charAt(i));
                sizeOfSubString++;
            }

        }
        if(hs.isEmpty()){
            return maxSubString;
        }
        return hs.size();
    }




    public static void main(String[] args){
      int s =  lengthOfLongestSubstring("abcdefabc");
      System.out.println(s);
    }
}