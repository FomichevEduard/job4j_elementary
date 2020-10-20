package ru.job4j.array;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int i = 1; i < word.length; i++) {
                if (word[1] != pref[1]) {
                    result = false;
                    break;

            }

        }
        return result;
    }
}

