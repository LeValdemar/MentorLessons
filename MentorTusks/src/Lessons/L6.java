package Lessons;

import java.util.Random;

public class L6 {
    public static void main(String[] args) {
        //Задача 6 (сложная):
        //Напишите программу, которая находит наибольшую возрастающую последовательность чисел в массиве из 30 элементов и выводит ее на экран.

        int [] values = new int[30];
        Random random = new Random();

        for (int i = 0; i < values.length; i++) {
            values[i] = random.nextInt(30);
            System.out.print(values[i] + " | ");
        }
        System.out.println("Массив заполнен.");
    }
}
