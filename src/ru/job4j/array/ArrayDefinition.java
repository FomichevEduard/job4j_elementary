package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
      short[] ages = new short[10];
      String[] names = new String[100500];
        names[0] = "Ivan Kramskoi";
        names[1] = "Vasiliy Petrov";
        names[2] = "Alexey Savrasov";
        names[3] = "Nikita Zubenko";
      float[] prices = new float[40];
        System.out.println("Размер массива равен: " + ages.length);
        System.out.println("Размер массива равен: " + names.length);
        System.out.println("Размер массива равен: " + prices.length);
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
