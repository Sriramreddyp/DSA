package com.Package;
import java.util.HashSet;
import java.util.ArrayList;

import static java.util.Comparator.comparing;

public class LongestPalindrome {



        public static void longestPalindrome(String s) {
//            HashSet<Character>hs = new HashSet<Character>();
            ArrayList<String> Strings = new ArrayList<String>();

            int size = s.length();
            String maxString = " ";


            for(int i =0;i<size/2;i++){
                int j = size - 1;
                while(j > i){
                    if(s.charAt(i) == s.charAt(j)){
                        maxString = s.substring(i,j + 1);
                        Strings.add(maxString);
                        j--;
                    }
                    else{
                        j--;
                    }

                }
            }

            for (int i = 0; i < Strings.size(); i++) {

                System.out.println(Strings.get(i));
                // will print each index as it loops
            }

//
//            for(int i = 0;i<size;i++){
//                if(hs.contains(s.charAt(i))){
//                    String substr = s.substring(firstPointer,secondPointer);
//                    Strings.add(substr);
//                    hs.remove(s.charAt(firstPointer));
//                    firstPointer++;
//                    if(firstPointer == size - 1){
//                        break;
//                    }
//                    else{
//                        secondPointer = firstPointer + 1;
//                        hs.add(s.charAt(i));
//                    }
//                }else{
//                    hs.add(s.charAt(i));
//                    secondPointer++;
//                }
//            }
//
//            String maxString = Strings.stream().max(comparing(String::length)).get();
//
//            int palindromePointer_1 = 0;
//            int palindromePointer_2 = maxString.length() - 1;
//
//            for(int i = 0;i<maxString.length();i++){
//                if(maxString.charAt(palindromePointer_1) != maxString.charAt(palindromePointer_2)){
//                    return null;
//                }
//                palindromePointer_1++;
//                palindromePointer_2--;
//            }
//
//            return maxString;
        }

        public static void main(String[] args){
          longestPalindrome("baaababab");

        }


    }

