package HW_2;

public class HW_2 {

    public static void main(String[] args) {


        taskOne(3, 12);
        taskTwo(8);
        taskThree(33);
        taskThreeAdd(17);
        taskFour("Love", 8);
        taskFive(1996);


    }
    
    /*1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит
 в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false. */
    private static boolean taskOne(int a, int b) {
        int sum = a + b;
        if (10 <= sum && sum <= 20) {
            System.out.println(sum);
            return true;
        }
        return false;
    }

    /* 2. Написать метод, которому в качестве параметра передается целое число, метод должен
напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль
считаем положительным числом */

    private static void taskTwo(int a) {
        if (a >= 0) {
            System.out.println("The digit is positive");
        } else {
            System.out.println("The digit is negative");
        }
    }


    /*3. Написать метод, которому в качестве параметра передается целое число. Метод должен
вернуть true, если число отрицательное, и вернуть false если положительное.*/

    private static boolean taskThree(int a) {
        if (a >= 0) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean taskThreeAdd(int a) {

        return a >= 0;
    }

  /*  4. Написать метод, которому в качестве аргументов передается строка и число, метод должен
     отпечатать в консоль указанную строку, указанное количество раз;*/

    private static void taskFour(String a, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println(a);

        }

        }
        /*5. * Написать метод, который определяет, является ли год високосным, и возвращает boolean
(високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме каждого
100-го, при этом каждый 400-й – високосный*/

    private static boolean taskFive(int year) {
        if ((year % 4 == 0 || year % 400 == 0) && year % 100 != 0 ) {
            return true;
        }else {
            return false;
        }
        
    }
}
