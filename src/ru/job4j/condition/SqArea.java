package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
       int h = p / (2 * (k + 1));
       int L = h * k;
       int s = L * h;

        double rsl = s;
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 12);
        System.out.println(" p = 6, k = 2, s = 1, real = " + result1);

    }
}
