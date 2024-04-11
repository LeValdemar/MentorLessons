package Lessons;

import java.util.Random;

public class L2 {
    public static void main(String[] args) {
        // Задача 2 (легкая):
       // Напишите программу, которая заполняет массив из 6 элементов случайными числами от -50 до 50 и выводит на экран только положительные числа из этого массива.

        int[] rnumbers = new int[6];
        Random value = new Random();

        for (int i = 0; i < rnumbers.length; i++) {
            rnumbers[i] = value.nextInt(-50,50);
            System.out.print(rnumbers[i] + " | ");
        }
        System.out.println("- заполнение массива.");

        for (int i = 0; i < rnumbers.length; i++) {
            if (rnumbers[i]>0){
                System.out.print(rnumbers[i] + " | ");
            }
        }
        System.out.println(" - положительные элементы массива.");
    }
}
