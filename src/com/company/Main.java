package com.company;

public class Main {

    public static void main(String[] args) {
        BMI bmi1 = new BMI ("Johnny", 60, 1.80);
        System.out.println("Bmi'et for " + bmi1.getName() + " Er " + bmi1.getBmi() + bmi1.getStatus());
        BMI bmi2 = new BMI ("Susan ",36, 56,1.67);
        System.out.println("Bmi'et for " + bmi2.getName() + " Er " + bmi2.getBmi() + bmi2.getStatus() + " Hendes højde er " + bmi2.getHeight() );
        BMI bmi3 = new BMI (" Peter ", 15, 60, 1, 0.60);
        System.out.println("Bmi'et for " + bmi3.getName() + " Er " + bmi3.getBmi() + bmi3.getStatus() + " Hendes højde er " + bmi3.getHeight());
    }
}
