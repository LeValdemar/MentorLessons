package Lessons;

public class L4 {
    public static void main(String[] args) {
       // Задача 4 (средняя):
       // Напишите программу, которая находит разность между суммой элементов массива из 14 чисел,
       // стоящих на четных позициях, и суммой элементов, стоящих на нечетных позициях.

        int[] values = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        int evensum = 0;
        int oddsum = 0;

        for (int i = 0; i < values.length; i+=2) {
            evensum += values[i];
        }
        System.out.println(evensum);

        for (int i = 1; i < values.length; i+=2) {
            oddsum += values[i];
        }
        System.out.println(oddsum);
        System.out.print("разность между четными и нечетными эелементами массива: ");
        System.out.println(evensum-oddsum);

    }
}
