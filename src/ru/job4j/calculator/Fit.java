package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short height) {
        double rsl = (189 - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short height1) {
        double rsl = (167-100) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short height = 187;
        short height1 = 167;
        double man = Fit.manWeight(height);
        double woman = Fit.womanWeight(height1);
        System.out.println("Man 189 is " + man);
        System.out.println("Woman 167 is " + woman);
    }

}
