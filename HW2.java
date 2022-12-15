package lesson1;

public class HW2 {

    public static void main(String[] args) {
        forTask1("МадаМ я АдАм");
//       forTask2("TEST,", 100);

    }
//Напишите метод, который принимает на вход строку (String)
// и определяет является ли строка палиндромом (возвращает boolean значение).
    private static boolean forTask1(String str1) {
        System.out.println("\nЗадание 1.");

        System.out.println();
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите строку: ");
//        String str1 = scanner.nextLine();

        str1 = str1.replaceAll("\\s*", "");
        str1 = str1.toLowerCase();
        System.out.println(str1);

        StringBuffer sb = new StringBuffer(str1);
        sb.reverse();
        System.out.println(sb);
        boolean answer = true;
        for (int count = 0; count < str1.length(); count++) {
            if (str1.charAt(count) != sb.charAt(count)) {
                answer = false;
                break;
            }
        }

        return answer;

    }
}
// Задача 2. Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
//который запишет эту строку в простой текстовый файл, обработайте исключения.



//    static void forTask2(String in, int n) {
//    System.out.println("\nЗадание 2.");
//
//
//
//    StringBuilder b = new StringBuilder(n * in.length());
//    for (int i = 0; i < n; ++i) b.append(in);
//        String result = b.toString();
//        System.out.println(result);
//
//        File file = new File("file.txt");
//        String text = result;
//
//        try (FileWriter fw = new FileWriter(file))
//        {
//            fw.write(text);
//            System.out.println("Successfully written data to the file");
//        }
//        catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}

