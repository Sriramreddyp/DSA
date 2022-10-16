package com.Package;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

    class Result {

        /*
         * Complete the 'timeConversion' function below.
         *
         * The function is expected to return a STRING.
         * The function accepts STRING s as parameter.
         */

          String timeConversion(String s) {

            int length = s.length();
            int hours = Integer.parseInt(s.substring(0,2));
            String minutes = s.substring(3,5);
            String seconds = s.substring(6,8);
            int MilataryHours = 0;


            String timeZone = s.substring(8,10);


            if(timeZone.equals("PM")){
                MilataryHours = 24 -  (12 - hours);
                String MH = Integer.toString(MilataryHours);
                return MH+":"+minutes+":"+seconds;
            }
            else{

                MilataryHours = 12 - hours;
                String MH = Integer.toString(MilataryHours);
                return MH+":"+minutes+":"+seconds;
            }

        }

    }

    public class TimeConversion{

        public static void main(String[] args){
            Result r = new Result();
            r.timeConversion("07:45:45PM");
        }


    }


