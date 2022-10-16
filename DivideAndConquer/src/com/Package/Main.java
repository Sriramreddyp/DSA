package com.Package;

public class Main {

    public static void main(String[] args) {
//	NumberFactor nf = new NumberFactor();
//    System.out.println(nf.waysToGetN(6));
//    System.out.println(nf.waysToGetN(7));
//    System.out.println(nf.waysToGetN(8));

        HouseRobber hr = new HouseRobber();
        int worth[] = new int[]{20,30,40,50,60};
        System.out.println(hr.maxMoney(worth));
    }
}
