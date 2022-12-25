package lesson1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PhoneBook {

//    Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров.
//    Учесть, что под одной фамилией может находиться несколько телефонных номеров.
//            Важно: Каждый пользователь - уникальный ключ в коллекции.
//            В выбранной Вами коллекции не должно быть повторений имён
//
//    Неправильно:
//            911 - Тимофей
//            112 - Тимофей
//            03 - Тимофей
//            .
//            Правильно:
//            Тимофей: 911, 112, 03

    HashMap<String, ArrayList<String>> phoneMap = new HashMap<>();

    public  static void main(String[] args) {

            PhoneBook pb = new PhoneBook();


        pb.put("Иванов", "6546558");
        pb.put("Петров", "6465221");
        pb.put("Иванов", "22145878");
        pb.put("Сидоров", "3654789");
        pb.put("Петров", "45821478");
        pb.put("Иванов", "365237895");
        pb.put("Сидоров", "24698");

        Set<Map.Entry<String, ArrayList<String>>> set = pb.phoneMap.entrySet();
            System.out.println(set.toString());

    }

    public  void  put(String surname, String phone) {

        ArrayList<String> string = phoneMap.get(surname);

        if (string == null) {
            ArrayList<String> listOfPhones = new ArrayList<>();
            listOfPhones.add(phone);
            phoneMap.put(surname, listOfPhones);
        }
        else {
            string.add(phone);
            phoneMap.put(surname,string);
        }
    }

    public ArrayList<String> get(String surname) {
        return phoneMap.get(surname);
    }

}