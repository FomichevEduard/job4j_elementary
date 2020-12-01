package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                for (int index1 = index + 1; index1 < array.length; index1++) {
                    if (array[index1] != null) {
                        swap(array, index, index1);
                        break;
                    }
                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }

    public static void swap(String[] array, int point, int point1) {
        String tmp = array[point];
        array[point] = array[point1];
        array[point1] = tmp;
    }
}
