package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short height1) {
        double rsl = (height1 - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short height = 170;
        short height1 = 161;
        double man = Fit.manWeight(height);
        double woman = Fit.womanWeight(height1);
        System.out.println("Man 170 is " + man);
        System.out.println("Woman 161 is " + woman);
    }

}
