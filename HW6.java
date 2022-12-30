package lesson1.HW6;

import java.util.*;

public class HW6 {
   public static void main(String[] args) {

      Notebook notebook1 = new Notebook("MSI", "16", "1000", "Windows", "red");
      Notebook notebook2 = new Notebook("Asus", "4", "1000", "Lunex", "black");
      Notebook notebook3 = new Notebook("Lenovo", "4", "2000", "Windows", "black");
      Notebook notebook4 = new Notebook("Asus", "16", "1000", "Windows", "grey");
      Notebook notebook5 = new Notebook("Huawei", "8", "1000", "Windows", "black");

      Set<Notebook> notebooks = new HashSet<>(List.of(notebook1, notebook2,
            notebook3, notebook4, notebook5));

      Map<String, String> sel = selectCriteria();
      sort(sel, notebooks);

   }

   public static String scanner() {
      Scanner scanner = new Scanner(System.in);
      String scan = scanner.nextLine();
      return scan;
   }

   public static Map<String, String> selectCriteria() {
      Map<String, String> resultCriterias = new HashMap<>();
      while (true) {
         System.out.println("Для выбора параметров введите 'y', если нет введите 'n'");
         String question = scanner();
         if (question.equals("n")) {
            break;
         } else {

            System.out.println(
                  "Для выбора необходимого параметра нажмите нужную цифру: \n 1 - Название \n 2 - Объем оперативной памяти \n 3 - Объем Жесткого диска \n 4 - Операционная система \n 5 - Цвет");
            String key = scanner();
            System.out.println("Введите нужный параметр: ");
            String value = scanner();

            resultCriterias.put(key, value);
         }
      }
      System.out.println(resultCriterias);
      return resultCriterias;

   }

   public static void sort(Map<String, String> criterias, Set<Notebook> notebooks) {

      Set<Notebook> temp = new HashSet<>(notebooks);
      for (Notebook notebook : notebooks) {

         for (Object pair : criterias.keySet()) {

            if (pair.equals("1") && !notebook.getName().equals(criterias.get(pair))) {
               temp.remove(notebook);
            }
            for (Object pair1 : criterias.keySet()) {

               if (pair1.equals("2") && !notebook.getRam().equals(criterias.get(pair1))) {
                  temp.remove(notebook);

               }
               for (Object pair2 : criterias.keySet()) {

                  if (pair2.equals("3") && !notebook.getHardDisk().equals(criterias.get(pair2))) {
                     temp.remove(notebook);

                  }
                  for (Object pair3 : criterias.keySet()) {

                     if (pair3.equals("4") && !notebook.getOperatingSystem().equals(criterias.get(pair3))) {
                        temp.remove(notebook);

                     }
                     for (Object pair4 : criterias.keySet()) {

                        if (pair4.equals("5") && !notebook.getColour().equals(criterias.get(pair4))) {
                           temp.remove(notebook);

                        }
                     }
                  }
               }
            }
         }

      }
      if (temp.isEmpty()) {
         System.out.println("Такого товара нет.");
      } else {
         System.out.println("Вот что есть в наличии: \n" + temp.toString());
      }

   }

}
