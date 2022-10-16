package com.Package;

import java.util.ArrayList;
import java.util.HashMap;

public class Fibinocci {
    int fibMEMO(int n, HashMap<Integer,Integer> memo){
        if(n == 1)
            return 0;
        if(n==2)
            return 1;
        if(!memo.containsKey(n)){
            memo.put(n,(fibMEMO(n-1,memo)) + fibMEMO(n-2,memo));
        }
        return memo.get(n);
    }

    int fibTab(int n){
        ArrayList<Integer> results  = new ArrayList<>();
        results.add(0);
        results.add(1);

        //add the solutions and use them to find other solutions..for any n input and single output
        for(int i = 2;i<=n-1;i++){
            int n1 = results.get(i-1);
            int n2 = results.get(i-2);
            results.add(n1 + n2);

        }
        return results.get(n-1);
    }

}
