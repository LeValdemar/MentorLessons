package Lessons;

import java.util.Random;
import java.util.Scanner;

public class L5 {
    public static void main(String[] args) {
       // Задача 5 (сложная):
       //  Напишите программу, которая находит все тройки подряд идущих чисел в массиве из 24 элементов, сумма которых равна
       //  заданному числу, введенному с клавиатуры

        int [] values = new int[24];
        Random random = new Random();
        Scanner number = new Scanner(System.in);

        for (int i = 0; i < values.length; i++) {
            values[i] = random.nextInt(24);
            System.out.print(values[i] + " | ");
        }
        System.out.println("Массив заполнен.");
        System.out.println("Какую сумму вы желаете получить?");
        int sum = number.nextInt();

        for (int i = 0; i < values.length - 2; i++) {
            int summ = values[i] + values[i+1] + values[i+2]; //создаем переменную для проверки со значением полученным с консоли в которой суммируем значение 3х секций массива.
            if (sum == summ){ // если значения схожи, то выводим по отдельности каждую совпавшую цифру.
                System.out.println("3 числа соответствующие введенной вами сумме: " + values[i] + " " + values[i+1] + " " + values[i+2]);
            }
        }
    }
}
