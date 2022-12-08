package lesson1;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class HW1 {
    public static void main(String[] args) {

        System.out.println(forFirst(14, 8));
        forTwo(10);
        System.out.println(forThree(-15));
        System.out.println(forFour("мы не рабы, рабы не мы; ", 7));
        forFive(2024);
        forSix(10);
        forSeven(100);
        forEight();
        forNine();
        forTen(100, 23);
        forEleven(10);


    }
    //1. Написать метод, принимающий на вход два целых числа и проверяющий,
    // что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
    // в противном случае – false.
    static boolean forFirst(int a, int b) {
        System.out.println("\nЗадание 1.");
        int sum = a + b;
        if (sum >= 10 && sum <= 20) return true;
        else return false;
        }

    //2. Написать метод, которому в качестве параметра передается целое число,
    // метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    // Замечание: ноль считаем положительным числом.

    static void forTwo(int a) {
        System.out.println("\nЗадание 2.");
        if(a >= 0) System.out.println("Число положительное");
        else System.out.println("Число отрицательное");
        }

    //3.  Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true,
    // если число отрицательное, и вернуть false если положительное.

    static boolean forThree(int a) {
        System.out.println("\nЗадание 3.");
        if(a >= 0) return false;
        else return true;
    }

    //4. Написать метод, которому в качестве аргументов передается строка и число,
    // метод должен отпечатать в консоль указанную строку, указанное количество раз;
    static <str> String forFour(str a, int b) {
        System.out.println("\nЗадание 4.");
        String result = "";
        for (int i = 0; i < b; i += 1) {
            result += a;
        }

        return result;
    }

    //6. Задать целочисленный массив, состоящий из элементов 0 и 1.
    // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    // С помощью цикла и условия заменить 0 на 1, 1 на 0;
    static void forSix(int a) {
        System.out.println("\nЗадание 6.");
        Random random = new Random();
        int[] array = new int[a];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(2);
            }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {

                if(array[i] == 1)
                    array[i] = array[i] - 1;
                else if (array[i] == 0) {
                    array[i] = array[i] +1;
                }
            }
        System.out.println(Arrays.toString(array));
    }


    //7. Задать пустой целочисленный массив длиной 100.
    // С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
    static void forSeven(int a) {
        System.out.println("\nЗадание 7.");
        int[] b = new int[a];
        for(int i = 0; i < a; i++) {
            b[i] = i+1;
            }
    System.out.println(Arrays.toString(b));
    }


    //8. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
    // и числа меньшие 6 умножить на 2;
    static void forEight() {
        System.out.println("\nЗадание 8.");
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr));

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < 6)
                arr[i] = arr[i] * 2;
    }
        System.out.println(Arrays.toString(arr));
    }


    //9. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    // и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
    // Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны,
    // то есть [0][0], [1][1], [2][2], …, [n][n];
    static void forNine() {
        System.out.println("\nЗадание 9.");

        int[][] arr = new int[5][5];
        IntStream.range(0, 5).forEach(i -> {
            arr[i][i] = 1;
            arr[i][arr.length - 1 - i] = 1;
        });
        Arrays.stream(arr).map(Arrays::toString).forEach(System.out::println);
    }


    //10. Написать метод, принимающий на вход два аргумента: len и initialValue,
    // и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
    static void forTen(int len, int intialValue) {
        System.out.println("\nЗадание 10.");
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = intialValue;
            }
        System.out.println(Arrays.toString(array));
    }


    //5*. Написать метод, который определяет, является ли год високосным,
    // и возвращает boolean (високосный - true, не високосный - false).
    // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    static void forFive(int year) {
        System.out.println("\nЗадание 5*.");
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) System.out.println(year + " г. не високосный");
        else System.out.println(year + " г. високосный");
    }




    // 11* Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
    static void forEleven(int a) {
        System.out.println("\nЗадание 11*.");
        Random random = new Random();
        int[] b = new int[a];
        for (int i = 0; i < a; i++) {
            b[i] = random.nextInt(-40, 40);
        }
        System.out.println(Arrays.toString(b));

        int min = b[0];
        int max = b[0];
        for (int i : b) {
            if (i < min)min = i; if (i > max)  max = i;
        }
        System.out.println(min);
        System.out.println(max);
    }
}
