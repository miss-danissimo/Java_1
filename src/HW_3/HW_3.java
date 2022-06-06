package HW_3;

import java.util.Arrays;

public class HW_3 {
    public static void main(String[] args) {
        taskOne();
        taskTwo();
        taskThree();
        taskFour();
        taskFive(8, 2);
        taskSix();
        taskEight(4);
    }




    /*  1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например:
     [ 1, 1, 0, 0, 1, 0, 1, 1,0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;*/
    private static void taskOne() {
        int[] digits = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(digits));
        for (int i = 0; i < digits.length; i++)
            if (digits[i] == 1) {
                digits[i] = 0;
            } else {
                digits[i] = 1;
            }
        System.out.println(Arrays.toString(digits));
    }

/*2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его
    значениями 1 2 3 4 5 6 7 8 … 100;*/

    private static void taskTwo() {
        int a = 1;
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = a;
            System.out.print(arr[i] + " ");
            a++;
        }

    }

    /*3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6
            умножить на 2;*/
    private static void taskThree() {
        int[] numbers = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++) {
            int b = numbers[i];
            if (b < 6) {
                numbers[i] = b * 2;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }

/*4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов
            одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами
            (можно только одну из диагоналей, если обе сложно). Определить элементы одной из
    диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0],
            [1][1], [2][2], …, [n][n];*/

    private static void taskFour() {
        int[][] ex4 = new int[8][8];
        int lastIndex = ex4.length - 1;
        for (int i = 0; i < ex4.length; i++) {
            ex4[i][i] = ex4[i][lastIndex - i] = 1;
            System.out.println(Arrays.toString(ex4[i]));
        }
    }

    /*5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий
        одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;*/
    private static int[] taskFive(int len, int initialvalue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialvalue;
            System.out.println(arr[i]);
        }return arr;
    }
/*6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;*/
    private static void taskSix() {
        int[] c = {12, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int min = c[0];
        int max = c[0];
        for (int i = 1; i < c.length; i++) {
            if (c[i] < min) {
                min = c[i];
            }
            if (c[i] > max) {
                max = c[i];
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        }

    }

