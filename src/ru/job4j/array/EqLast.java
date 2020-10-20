package ru.job4j.array;

public class EqLast {
    public static boolean check(int[] left, int[] right) {
        boolean result = true;
        for (int i = 0; i < left.length; i++) {
            if (left[2] != right[2]) {
                result = false;
                break;

            }

        }
        return result;
    }
}