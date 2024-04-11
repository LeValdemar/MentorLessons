package Lessons;

public class L3 {
    public static void main(String[] args) {
        //Задача 3 (средняя):
        //Напишите программу, которая находит сумму элементов массива из 10 чисел, стоящих на нечетных позициях (индексы).

        int[] values = {3,7,12,15,21,6,17,45,9,13};
        int oddsum = 0;

        for (int i = 1; i < values.length; i+=2) { //0 элемент четный, начинаем с 1го и далее с шагом 2 прыгаем по нечетным индексам 1 3 5 итд.
            oddsum +=values[i];

        }
        System.out.println("сумма нечетных позиций массива: " + oddsum);
    }
}
