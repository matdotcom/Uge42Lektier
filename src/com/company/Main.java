package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BMI bmi1 = new BMI ("Johnny", 60, 1.80);
        System.out.println("Bmi'et for " + bmi1.getName() + " Er " + bmi1.getBmi() + bmi1.getStatus());
        BMI bmi2 = new BMI ("Susan ",36, 56,1.67);
        System.out.println("Bmi'et for " + bmi2.getName() + " Er " + bmi2.getBmi() + bmi2.getStatus() + " Hendes højde er " + bmi2.getHeight() );
        BMI bmi3 = new BMI (" Peter ", 15, 60, 1, 0.60);
        System.out.println("Bmi'et for " + bmi3.getName() + " Er " + bmi3.getBmi() + bmi3.getStatus() + " Hendes højde er " + bmi3.getHeight());


        Time time = new Time();

        System.out.println("\n\ntime... ");
        System.out.println("Hours: " + time.getHour());
        System.out.println("Minutes: " + time.getMinute());
        System.out.println("Seconds: " + time.getSecond());

        Scanner in = new Scanner(System.in);


        Time time2 = new Time(555550000);

        System.out.println("\ntime2...");
        System.out.println("Hours: " + time2.getHour());
        System.out.println("Minutes: " + time2.getMinute());
        System.out.println("Seconds: " + time2.getSecond());

        MyPoint p1 = new MyPoint(0,0);
      MyPoint p2 = new MyPoint(10, 30.5);

        System.out.println("\n\nThe distance between these points is: " + p1.distance(p2));
        System.out.println("The distance between p1 and (10, 30.5): " + p1.distance(10, 30.5) + " \n\n");
    }
}
