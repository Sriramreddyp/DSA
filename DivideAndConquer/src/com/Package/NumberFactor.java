package com.Package;

public class NumberFactor {
    public int waysToGetN(int n){

        //Identified the base solutions for small sub problems for all possible inputs
        //divided the input to small sub problems in order to get the base solutions ----> DIVIDE
        //added the---->CONQUER
        if(n == 0 || n == 1 || n == 2){
            return 1;
        }
        if(n == 3){
            return 2;
        }

        int sub1 = waysToGetN(n-1);
        int sub2 = waysToGetN(n - 3);
        int sub3 = waysToGetN(n-4);

        return sub1 + sub2 + sub3;

    }


}
