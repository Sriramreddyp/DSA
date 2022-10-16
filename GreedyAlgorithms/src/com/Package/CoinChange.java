package com.Package;

import java.util.Arrays;

public class CoinChange {

    static void coinChangeProblem(int[] coins,int totalAmount){
        Arrays.sort(coins);
        int index = coins.length - 1;
        int ResultValue = 0;
        while(true){
          if(coins[index] < totalAmount){
              totalAmount = totalAmount - coins[index];
              ResultValue++;
          }else if(coins[index] > totalAmount){
              index--;
          }else if(totalAmount == coins[index]) {
              totalAmount = totalAmount - coins[index];
              ResultValue++;
              break;
          }else{
              break;
          }
        }

        System.out.println(ResultValue);



    }
    public static void main(String[] args){
        int arr[] = new int[]{1,2,3,4,5};
        coinChangeProblem(arr,12);

    }
}
