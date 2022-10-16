//Take no of days from user - arraylength
//initialize temperatures to the days 
//calculate average
//check whether the initialized days have more temperature than average temperature

import java.util.*;

class ArrayProject {

 int[] days;
 int sum = 0;
 int AvgTemp = 0;
 Scanner s = new Scanner(System.in);

 public ArrayProject(int NoOfDays) {
  days = new int[NoOfDays];
 }



 public void addTemp() {
  for (int i = 0; i < days.length; i++) {
   System.out.print("Enter Day" + (i + 1) + "'s Temperature : ");
   days[i] = s.nextInt();
  }
 }

 public void AverageTemp() {

  for (int i = 0; i < days.length; i++) {

   sum = sum + days[i];
  }
  AvgTemp = (sum / days.length);
  System.out.println("Average Temperature : " + AvgTemp);
 }

 public void checkTemp() {
  int count = 0;
  for (int i = 0; i < days.length; i++) {
   if (days[i] > AvgTemp)
    count++;
  }
  System.out.println(count + " no of days are in high Temp.");
 }
}