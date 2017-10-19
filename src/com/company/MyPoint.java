package com.company;

public class MyPoint {
    private double x;
    private double y;

    MyPoint(){}

    MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double getX() {
        return x;
    }

    double getY() {
        return y;
    }
    /*formlen for længden mellem to punkter..
     * Kvadratroden af  (x2 - x1)^2 + (y2 - y1)^2
     * */
    double distance(MyPoint p2) {

        double x2 = p2.getX();
        double y2 = p2.getY();

        return Math.sqrt(Math.pow(x2 - this.x, 2) + Math.pow(y2 - this.y, 2));
    }

    double distance(double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - this.x, 2) + Math.pow(y2 - this.y, 2));
    }

}


