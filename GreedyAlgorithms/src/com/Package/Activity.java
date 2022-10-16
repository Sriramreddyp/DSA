package com.Package;

public class Activity {
    private String name;
    private int startTime;
    private int FinishTime;

    public Activity(String name,int startTime,int FinishTime){
        this.name = name;
        this.startTime = startTime;
        this.FinishTime = FinishTime;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getStartTime(){
        return startTime;
    }

    public void setstartTime(int startTime){
        this.startTime = startTime;
    }
    public int getFinishTime(){
        return FinishTime;
    }

    public void setFinishTime(int FinishTime){
        this.FinishTime = FinishTime;
    }

    @Override
    public String toString(){
        return "Activity : " + name + ", startTime : " + startTime + ",FinishTime " + FinishTime + ".";
    }
}
