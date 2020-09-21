package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        int callX = (x2-x1);
        double callX1 = Math.pow(callX, 2);

        int callY = (y2-y1);
        double callY1 = Math.pow(callY, 2);
        int SumXY = (int) (callX1 + callY1);

        double rsl = Math.sqrt(SumXY);
        return rsl;
    }


    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}






