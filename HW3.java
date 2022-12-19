package lesson1;

import java.util.*;

import static java.util.stream.Collectors.partitioningBy;
import static java.util.stream.Collectors.toList;

public class HW3 {


//   1. Пусть дан произвольный список целых чисел, удалить из него четные числа
//   (в языке уже есть что-то готовое для этого)


        public static void main(String[] args) {
          System.out.println(get(Arrays.asList(1,2,3,4,5,-1,5,-10,-7,9,18,13)));
          forMinMax();
        }

        static List<Integer> get(List<Integer> integers){
            System.out.println("\nЗадание 1.");
            Map<Boolean, List<Integer>> map = integers.stream()
                    .collect(partitioningBy(x -> x % 2 == 0, toList()));
            return map.get(map.get(false).size() % 2 != 0);
        }

// 2. Задан целочисленный список ArrayList. Найти минимальное,
// максимальное и среднее арифметическое из этого списка.




    private static ArrayList<Integer> forMinMax() {
        System.out.println("\nЗадание 2.");

        ArrayList<Integer> b = new ArrayList<Integer>();
        Collections.addAll(b, 2, -8, 12, 9, -2, 55, 18, -1, 64);
        System.out.println(b);

        int max = Collections.max(b);
        System.out.println("Максимальный элемент : " + max);

        int min = Collections.min(b);
        System.out.println("Минимальный элемент : " + min);

        int sum = 0;
        for (int i = 0; i < b.size(); i++) {
            sum = sum + b.get(i);

        }

        System.out.println("Сумма элементов : " + sum);
        System.out.println("Размер : " + b.size());
        double result = sum / b.size();
        System.out.println("Среднее арифметическое : " + result);
        return b;

    }

}













