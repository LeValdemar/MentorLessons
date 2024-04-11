package Lessons;

public class L1 {
    public static void main(String[] args) {
        //Задача 1 (легкая):
        //Напишите программу, которая создает массив из 8 целых чисел и выводит на экран только те числа, которые делятся на 3 без остатка.

        int[] value = {3,9,12,15,18,21,23,55};

        for (int i = 0; i < value.length; i++) {
            if (value[i] % 3 == 0){
                System.out.println("Делим быстренько на 3 получаем мы нули: " +value[i]);
            }
        }
    }
}
