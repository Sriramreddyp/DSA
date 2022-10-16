package com.Package;

import java.util.Stack;

class Solution {
    public boolean isSubsequence(String s, String t) {
        int count = s.length() - 1;

        Stack<Character> chars = new Stack<Character>();
        boolean booleanValue = true;

        if(s.length() > t.length() || (s.length() == t.length() && s != t)){
            return false;
        }
        for (int i = 0; i < t.length(); i++) {
            chars.push(t.charAt(i));
        }

        while (count >= 0) {
            if (chars.empty()) {
                return false;
            }
            if (s.charAt(count) == chars.peek()) {
                count--;
                chars.pop();
            } else {
//                if(chars.empty() && count != 0){
//                    return false;
//                }
                chars.pop();
            }
        }


//        if(booleanValue){
//            return true;
//        }
//        return false;
        return true;

    }
}

public class isSequence{
    public static void main(String[] args){
        Solution s = new Solution();

        System.out.println(s.isSubsequence("arte","axcte"));
    }
}