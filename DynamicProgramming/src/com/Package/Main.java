package com.Package;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        Fibinocci f = new Fibinocci();
        HashMap<Integer,Integer> memo = new HashMap<>();
        System.out.println(f.fibMEMO(6,memo));
        System.out.println(f.fibTab(6));
    }
}
