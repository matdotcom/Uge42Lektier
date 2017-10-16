package com.company;

public class BMI {
    private String name;
    private double centimeter;
    private int age;
    private double weight;
    private double meter;
    private double height;

    public BMI(String name, int age, double weight, double height){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;

    }
    // Opgave 10.2
    public BMI(String name, int age, double weight, double meter, double centimeter){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = meter + centimeter;
    }
    public BMI(String name, double weight, double height) {
        this(name, 20, weight, height);
    }

    public double getBmi(){
        double bmi = weight / (height * height);
        return bmi;
    }

    public String getStatus() {
        double bmi = getBmi();
        if (bmi < 18.5)
            return " Undervægtig ";
        else if (bmi < 25)
            return " Normal ";
        else if (bmi < 30)
            return " Overvægtig ";
        else
            return "Meget tyk";

    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public double getWeight(){
        return weight;
    }
    public double getHeight(){
        return height;
    }
}
